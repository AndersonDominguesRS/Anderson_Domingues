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
	
	public boolean incluir (Tecnico tecnico) {
		
		return tecnicoRepository.incluir(tecnico);
	}
	
	public Tecnico excluir (Integer key) {
		
		return tecnicoRepository.excluirTecnico(key);
	}
	
	public Collection<Tecnico> obterLista(){
		
		return tecnicoRepository.obterLista();
	}

}
