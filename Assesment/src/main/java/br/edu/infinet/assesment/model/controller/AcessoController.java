package br.edu.infinet.assesment.model.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infinet.assesment.model.domain.Usuario;
import br.edu.infinet.assesment.model.repository.AcessoRepository;

@Controller
@SessionAttributes("usuario")
public class AcessoController {

	
	@GetMapping(value="/login")
	public String telaLogin() {		
		return "login";
	}
	
	@PostMapping(value="/login")
	public String login(Model model, Usuario usuario) {
		
		Usuario user = new Usuario(usuario.getEmail(), usuario.getSenha());
		
		user = AcessoRepository.autenticar(user);

		if(AcessoRepository.autenticar(user) != null) {
			
			model.addAttribute("usuario", user);
			return "redirect:/home";
		}
		
		model.addAttribute("mensagem", "As credenciais para o e-mail " + usuario.getEmail() + " estão incorretas");
		
		return telaLogin();

	}
	
	@GetMapping(value="/logout")
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		
		session.removeAttribute("usuario");
		
		return "redirect:/";
	}
	
}
