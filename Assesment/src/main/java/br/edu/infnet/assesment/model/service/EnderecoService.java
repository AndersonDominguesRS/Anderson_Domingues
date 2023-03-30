package br.edu.infnet.assesment.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.assesment.clients.IEnderecoClient;
import br.edu.infnet.assesment.model.domain.Endereco;

@Service
public class EnderecoService {
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco buscaCep(String cep) {

		
		return enderecoClient.buscaCep(cep);
	}

}
