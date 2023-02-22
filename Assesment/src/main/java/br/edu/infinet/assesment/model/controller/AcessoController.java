package br.edu.infinet.assesment.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infinet.assesment.model.domain.Usuario;
import br.edu.infinet.assesment.model.repository.AcessoRepository;

@Controller
public class AcessoController {

	
	@GetMapping(value="/login")
	public String telaLogin() {		
		return "login";
	}
	
	@PostMapping(value="/login")
	public String login(Usuario usuario) {
		
		Usuario user = new Usuario(usuario.getEmail(), usuario.getSenha());

		if(AcessoRepository.autenticar(user) != null) {
			return "redirect:/home";
		}
		
		return "redirect:/login";

	}
}
