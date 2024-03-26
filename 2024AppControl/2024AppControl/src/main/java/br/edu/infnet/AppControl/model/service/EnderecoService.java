package br.edu.infnet.AppControl.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppControl.model.clients.IEnderecoClient;
import br.edu.infnet.AppControl.model.domain.Endereco;


@Service
public class EnderecoService {
	
	@Autowired
	private IEnderecoClient enderecoCient;
	
	public Endereco endCep(String cep) {
		return enderecoCient.endCep(cep);
	}

}

