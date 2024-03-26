package br.edu.infnet.AppControl.model.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppControl.model.domain.Endereco;

@FeignClient(url ="https://viacep.com.br/ws", name="enderecoClient")
public interface IEnderecoClient {
	
	@GetMapping(value="/{cep}/json/")
	Endereco endCep(@PathVariable String cep);	

}
