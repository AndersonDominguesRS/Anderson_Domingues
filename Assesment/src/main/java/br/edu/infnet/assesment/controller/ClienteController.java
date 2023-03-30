package br.edu.infnet.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.assesment.model.domain.Cliente;
import br.edu.infnet.assesment.model.domain.Endereco;
import br.edu.infnet.assesment.model.domain.Usuario;
import br.edu.infnet.assesment.model.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	public String msg;
	
	@GetMapping(value = "/cliente/novo")
	public String telaClienteNovo() {

		return "cliente/cadastroCliente";
	}
	
	//////////////////////////////
	
	@GetMapping(value = "/cliente/novoCep")
	public String telaClienteCep() {

		return "cep/cadastroCep";
	}
	
	//////////////////////////////
	
	@GetMapping(value = "/cliente/lista")
	public String listaClient(Model model, @SessionAttribute("usuario") Usuario usuario) {
		
		model.addAttribute("clientes", clienteService.obterLista(usuario));
		
		model.addAttribute("mensagem", msg);

		return "cliente/listaCliente";
	}

	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluirCliente(@PathVariable Integer id) {

		clienteService.excluirCliente(id);
		
		msg="A exclusão do cliente " + id + " foi realizada com sucesso!!!";

		return "redirect:/cliente/lista";
	}
	
	
	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente, Endereco enderecoApi,   @SessionAttribute("usuario") Usuario usuario) {
		
		cliente.setUsuario(usuario);
		
		cliente.setEnderecoApi(enderecoApi);

		clienteService.incluir(cliente);

		msg= "A inclusão do cliente " + cliente.getNomeCliente() + " foi realizada com sucesso!!!";

		return "redirect:/home";

	}

}