package br.edu.infinet.assesment.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.assesment.model.domain.Cliente;
import br.edu.infinet.assesment.model.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public boolean incluir (Cliente cliente) {
		
		return clienteRepository.incluir(cliente);
	}
	
	public Cliente excluirCliente (Integer key) {
		
		return clienteRepository.excluirCliente(key);
	}
	
	public Collection<Cliente> obterLista(){
		
		return clienteRepository.obterLista();
	}

}
