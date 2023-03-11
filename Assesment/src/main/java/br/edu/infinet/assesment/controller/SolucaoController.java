package br.edu.infinet.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infinet.assesment.model.domain.Solucao;
import br.edu.infinet.assesment.model.repository.SolucaoRepository;
import br.edu.infinet.assesment.model.service.SolucaoService;



@Controller
public class SolucaoController {
	
	@Autowired
	private SolucaoService solucaoService;
	
	public String msg;
	
	@GetMapping(value = "/solucao/novo")
	public String telaSolucaoNovo() {

		return "solucao/cadastroSolucao";
	}
	
	@GetMapping(value = "/solucao/lista")
	public String listaSolucao(Model model) {
		
		model.addAttribute("solucoes", solucaoService.obterLista());

		return "solucao/listaSolucao";
	}

	@GetMapping(value = "/solucao/{id}/excluir")
	public String excluirSolucao(@PathVariable Integer id) {

		Solucao solucao = solucaoService.excluir(id);
		

		return "redirect:/solucao/lista";
	}
	
	@PostMapping(value = "/solucao/incluir")
	public String incluir(Solucao solucao) {

		solucaoService.incluir(solucao);

		return "redirect:/home";

	}

}