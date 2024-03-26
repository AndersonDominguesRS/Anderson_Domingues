package br.edu.infnet.AppControl.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.AppControl.model.domain.Aluno;
import br.edu.infnet.AppControl.model.service.AlunoService;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Aluno aluno) {
		System.out.println("A inclusão do aluno " + aluno + " foi realizada com sucesso");
		alunoService.incluir(aluno);

	}
	
	@DeleteMapping(value = "/{nome}/excluir")
	public void excluir(@PathVariable String  nome) {
		System.out.println("A exclusão do aluno " + nome + " foi realizada com sucesso");
		alunoService.excluir(nome);
		
	}
	
	
	@GetMapping(value = "/obterLista")
	public Collection<Aluno> obterLista() {
		
		System.out.println("Passou em opbter lista");
		
		return alunoService.obterLista();
	}
	
	
	@GetMapping(value = "/{nome}/obterAluno")
	Aluno obter(@PathVariable String nome) {
		
		System.out.println("PAssou em obter aluno");
		
		return alunoService.obter(nome);
		
	}
	


}
