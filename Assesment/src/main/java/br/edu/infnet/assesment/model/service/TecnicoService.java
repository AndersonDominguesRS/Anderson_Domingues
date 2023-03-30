package br.edu.infnet.assesment.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.assesment.model.domain.Tecnico;
import br.edu.infnet.assesment.model.repository.TecnicoRepository;

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
		
		return (Collection<Tecnico>) tecnicoRepository.findAll(Sort.by(Direction.ASC, "nomeTecnico"));
	}
	
	public Tecnico obterListaId( Integer id){
		
		return  tecnicoRepository.findById(id).orElse(null);
	}

}
