package br.edu.infinet.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infinet.assesment.model.domain.Usuario;
import br.edu.infinet.assesment.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	public String msg;

	@GetMapping(value = "/usuario")
	public String telaCadastro() {

		return "usuario/cadastroLogin";
	}
	
	@GetMapping(value = "/usuario/novo")
	public String telaCadastroNovo() {

		return "usuario/cadastro";
	}

	@GetMapping(value = "/usuario/lista")
	public String telaLista(Model model ) {

		model.addAttribute("usuarios", usuarioService.obterLista());

		model.addAttribute("mensagem", msg);

		return "usuario/lista";
	}

	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {

		usuarioService.incluir(usuario);

		msg = "A inclusão do usuário " + usuario.getNome() + " foi realizada com sucesso!!!";

		return "redirect:/home";

	}
	
	@PostMapping(value = "/usuario/incluirLogin")
	public String incluirLogin(Usuario usuario) {

		usuarioService.incluir(usuario);

		msg = "A inclusão do usuário " + usuario.getNome() + " foi realizada com sucesso!!!";

		return "redirect:/";

	}
	
	@GetMapping(value="/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		usuarioService.excluir(id);
		
		msg="A exclusão do usuário " + id + " foi realizada com sucesso!!!";
		
		return "redirect:/usuario/lista";
	}

}
