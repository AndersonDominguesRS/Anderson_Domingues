package br.edu.infinet.assesment.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infinet.assesment.model.domain.Cliente;
import br.edu.infinet.assesment.model.repository.ClienteRepository;



@Controller
public class ClienteController {
	
	public String msg;
	
	@GetMapping(value = "/cliente/novo")
	public String telaClienteNovo() {

		return "cliente/cadastroCliente";
	}
	
	@GetMapping(value = "/cliente/lista")
	public String listaClient(Model model) {
		
		model.addAttribute("clientes", ClienteRepository.obterLista());

		return "cliente/listaCliente";
	}

	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluirCliente(@PathVariable Integer id) {

		Cliente cliente = ClienteRepository.excluirCliente(id);
		
		msg="A exclusão do cliente " + cliente.getNomeCliente() + " foi realizada com sucesso!!!";

		return "redirect:/cliente/lista";
	}
	
	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente) {

		ClienteRepository.incluir(cliente);

		msg = "A inclusão do usuário " + cliente.getNomeCliente() + " foi realizada com sucesso!!!";

		return "redirect:/home";

	}

}