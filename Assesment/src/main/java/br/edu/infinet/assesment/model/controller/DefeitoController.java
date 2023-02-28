package br.edu.infinet.assesment.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infinet.assesment.model.domain.Defeito;
import br.edu.infinet.assesment.model.repository.DefeitoRepository;



@Controller
public class DefeitoController {
	
	public String msg;
	
	@GetMapping(value = "/defeito/novo")
	public String telaDefeitoNovo() {

		return "defeito/cadastroDefeito";
	}
	
	@GetMapping(value = "/defeito/lista")
	public String listaClient(Model model) {
		
		model.addAttribute("defeitos", DefeitoRepository.obterLista());

		return "defeito/listaDefeito";
	}

	@GetMapping(value = "/defeito/{id}/excluir")
	public String excluirDefeito(@PathVariable Integer id) {

		Defeito defeito = DefeitoRepository.excluirDefeito(id);
		

		return "redirect:/defeito/lista";
	}
	
	@PostMapping(value = "/defeito/incluir")
	public String incluir(Defeito defeito) {

		DefeitoRepository.incluir(defeito);

		return "redirect:/home";

	}

}