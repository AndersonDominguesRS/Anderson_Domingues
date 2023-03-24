package br.edu.infinet.assesment.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.assesment.model.domain.Tecnico;
import br.edu.infinet.assesment.model.repository.TecnicoRepository;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	public Tecnico incluir (Tecnico tecnico) {
		
		return tecnicoRepository.save(tecnico);
	}
	
	public void excluirTecnico (Integer key) {
		
		tecnicoRepository.deleteById(key);
	}
	
	public Collection<Tecnico> obterLista(){
		
		return (Collection<Tecnico>) tecnicoRepository.findAll();
	}
	
	public Tecnico obterListaId( Integer id){
		
		return  tecnicoRepository.findById(id).orElse(null);
	}

}
