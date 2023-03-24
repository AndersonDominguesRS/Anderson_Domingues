package br.edu.infinet.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infinet.assesment.model.domain.Defeito;
import br.edu.infinet.assesment.model.service.DefeitoService;



@Controller
public class DefeitoController {
	
	@Autowired
	private DefeitoService defeitoService;
	
	public String msg;
	
	@GetMapping(value = "/defeito/novo")
	public String telaDefeitoNovo() {

		return "defeito/cadastroDefeito";
	}
	
	@GetMapping(value = "/defeito/lista")
	public String listaClient(Model model) {
		
		model.addAttribute("defeitos", defeitoService.obterLista());
		
		model.addAttribute("mensagem", msg);

		return "defeito/listaDefeito";
	}

	@GetMapping(value = "/defeito/{id}/excluir")
	public String excluirDefeito(@PathVariable Integer id) {

		defeitoService.excluirDefeito(id);
		

		return "redirect:/defeito/lista";
	}
	
	@PostMapping(value = "/defeito/incluir")
	public String incluir(Defeito defeito) {

		defeitoService.incluir(defeito);

		return "redirect:/home";

	}

}