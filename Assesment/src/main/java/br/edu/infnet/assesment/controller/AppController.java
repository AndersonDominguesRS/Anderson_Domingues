package br.edu.infnet.assesment.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.assesment.model.service.SolucaoService;


@Controller
public class AppController {
	
	@Autowired
	private SolucaoService solucaoService;
	
	
	@GetMapping(value="/")
	public String telaIndex() {
		return "login";		
	}
	
	
	@GetMapping(value="/home")
	public String telaHome(Model model) {
		
		Map<String, Integer> mapaQtdeAten = new HashMap<String, Integer>();
		Map<String, Integer> mapaQtdePecas = new HashMap<String, Integer>();
		Map<String, Integer> mapaQtdeSla = new HashMap<String, Integer>();
		Map<String, Integer> mapaQtdeTerc = new HashMap<String, Integer>();
		
		
		
		mapaQtdeAten.put("atendimentos", (int) solucaoService.qtdeAtendimento() );
		mapaQtdePecas.put("pecas", solucaoService.qtdePecas().size());
		mapaQtdeSla.put("sla", solucaoService.qtdeSla().size());
		mapaQtdeTerc.put("terceiros", 12);
		
		System.out.println(solucaoService.qtdeSla().size());
		
		
		model.addAttribute("mapaQtdeAten", mapaQtdeAten);
		model.addAttribute("mapaQtdePecas", mapaQtdePecas);
		model.addAttribute("mapaQtdeSla", mapaQtdeSla);
		model.addAttribute("mapaQtdeTerc", mapaQtdeTerc);
		
		return "index";
	}
	
}
