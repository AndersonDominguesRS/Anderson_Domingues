package br.edu.infinet.assesment.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infinet.assesment.model.domain.Tecnico;
import br.edu.infinet.assesment.model.repository.TecnicoRepository;



@Controller
public class TecnicoController {
	
	public String msg;
	
	@GetMapping(value = "/tecnico/novo")
	public String telaTecnicoNovo() {

		return "tecnico/cadastroTecnico";
	}
	
	@GetMapping(value = "/tecnico/lista")
	public String listaClient(Model model) {
		
		model.addAttribute("tecnicos", TecnicoRepository.obterLista());

		return "tecnico/listaTecnico";
	}

	@GetMapping(value = "/tecnico/{id}/excluir")
	public String excluirTecnico(@PathVariable Integer id) {

		Tecnico tecnico = TecnicoRepository.excluirTecnico(id);
		
		msg="A exclusão do tecnico " + tecnico.getNomeTecnico() + " foi realizada com sucesso!!!";

		return "redirect:/tecnico/lista";
	}
	
	@PostMapping(value = "/tecnico/incluir")
	public String incluir(Tecnico tecnico) {

		TecnicoRepository.incluir(tecnico);

		msg = "A inclusão do usuário " + tecnico.getNomeTecnico() + " foi realizada com sucesso!!!";

		return "redirect:/home";

	}

}