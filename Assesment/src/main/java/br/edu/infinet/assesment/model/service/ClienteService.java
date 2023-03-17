package br.edu.infinet.assesment.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.assesment.model.domain.Cliente;
import br.edu.infinet.assesment.model.domain.Usuario;
import br.edu.infinet.assesment.model.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente incluir (Cliente cliente) {
		

		return clienteRepository.save(cliente);
	}
	
	public void excluirCliente (Integer key) {
		

		clienteRepository.deleteById(key);
		
	}
	
	public Collection<Cliente> obterLista(){
		

		return (Collection<Cliente>) clienteRepository.findAll();
	}
	
	public Collection<Cliente> obterLista(Usuario usuario){
		return clienteRepository.obterLista(usuario.getId());
	}

}
