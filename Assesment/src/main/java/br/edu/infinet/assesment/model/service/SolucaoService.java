package br.edu.infinet.assesment.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.assesment.model.domain.Solucao;
import br.edu.infinet.assesment.model.repository.SolucaoRepository;

@Service
public class SolucaoService {
	
	@Autowired
	private SolucaoRepository solucaoRepository;
	
	public boolean incluir (Solucao solucao) {
		
		return solucaoRepository.incluir(solucao);
	}
	
	public Solucao excluir (Integer key) {
		
		return solucaoRepository.excluirSolucao(key);
	}
	
	public Collection<Solucao> obterLista(){
		
		return solucaoRepository.obterLista();
	}

}
