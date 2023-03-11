package br.edu.infinet.assesment.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.assesment.model.domain.Defeito;
import br.edu.infinet.assesment.model.repository.DefeitoRepository;

@Service
public class DefeitoService {
	
	@Autowired
	private DefeitoRepository defeitoRepository;
	
	public boolean incluir (Defeito defeito) {
		
		return defeitoRepository.incluir(defeito);
	}
	
	public Defeito excluirDefeito (Integer key) {
		
		return defeitoRepository.excluirDefeito(key);
	}
	
	public Collection<Defeito> obterLista(){
		
		return defeitoRepository.obterLista();
	}

}
