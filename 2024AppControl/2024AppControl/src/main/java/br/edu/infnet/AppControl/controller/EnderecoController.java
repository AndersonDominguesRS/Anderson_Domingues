package br.edu.infnet.AppControl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.AppControl.model.domain.Endereco;
import br.edu.infnet.AppControl.model.service.EnderecoService;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping(value="/{cep}/cep")
	Endereco endCep(@PathVariable String cep) {
		return enderecoService.endCep(cep);
	}

}
