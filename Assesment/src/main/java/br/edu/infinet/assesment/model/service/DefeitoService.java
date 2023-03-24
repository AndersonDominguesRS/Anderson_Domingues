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
	
	public Defeito incluir (Defeito defeito) {
		
		return defeitoRepository.save(defeito);
	}
	
	public void excluirDefeito (Integer key) {
		
		 defeitoRepository.deleteById(key);
	}
	
	public Collection<Defeito> obterLista(){
		
		return (Collection<Defeito>) defeitoRepository.findAll();
	}
	
	public Defeito obterListaId( Integer id){
		
		return  defeitoRepository.findById(id).orElse(null);
	}

}
