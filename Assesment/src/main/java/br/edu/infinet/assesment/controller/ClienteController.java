package br.edu.infinet.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infinet.assesment.model.domain.Cliente;
import br.edu.infinet.assesment.model.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	public String msg;
	
	@GetMapping(value = "/cliente/novo")
	public String telaClienteNovo() {

		return "cliente/cadastroCliente";
	}
	
	@GetMapping(value = "/cliente/lista")
	public String listaClient(Model model) {
		
		model.addAttribute("clientes", clienteService.obterLista());
		
		model.addAttribute("mensagem", msg);

		return "cliente/listaCliente";
	}

	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluirCliente(@PathVariable Integer id) {

		Cliente cliente = clienteService.excluirCliente(id);
		
		msg="A exclusão do cliente " + cliente.getNomeCliente() + " foi realizada com sucesso!!!";

		return "redirect:/cliente/lista";
	}
	
	
	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente) {

		clienteService.incluir(cliente);

		msg= "A inclusão do cliente " + cliente.getNomeCliente() + " foi realizada com sucesso!!!";

		return "redirect:/home";

	}

}