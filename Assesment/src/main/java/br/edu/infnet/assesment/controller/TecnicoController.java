package br.edu.infnet.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.assesment.model.domain.Tecnico;
import br.edu.infnet.assesment.model.service.TecnicoService;



@Controller
public class TecnicoController {
	
	@Autowired
	private TecnicoService tecnicoService;
	
	public String msg;
	
	@GetMapping(value = "/tecnico/novo")
	public String telaTecnicoNovo() {

		return "tecnico/cadastroTecnico";
	}
	
	@GetMapping(value = "/tecnico/lista")
	public String listaClient(Model model) {
		
		model.addAttribute("tecnicos", tecnicoService.obterLista());
		
		model.addAttribute("mensagem", msg);

		return "tecnico/listaTecnico";
	}

	@GetMapping(value = "/tecnico/{id}/excluir")
	public String excluirTecnico(@PathVariable Integer id) {
		
		Tecnico tecnico = new Tecnico();

		tecnicoService.excluirTecnico(id);
		
		msg="A exclusão do tecnico " + tecnico.getNomeTecnico() + " foi realizada com sucesso!!!";

		return "redirect:/tecnico/lista";
	}
	
	@PostMapping(value = "/tecnico/incluir")
	public String incluir(Tecnico tecnico) {

		tecnicoService.incluir(tecnico);

		msg = "A inclusão do usuário " + tecnico.getNomeTecnico() + " foi realizada com sucesso!!!";

		return "redirect:/home";

	}

}