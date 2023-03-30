package br.edu.infnet.assesment.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.assesment.model.domain.Defeito;
import br.edu.infnet.assesment.model.repository.DefeitoRepository;

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
		
		return (Collection<Defeito>) defeitoRepository.findAll(Sort.by(Direction.ASC, "identificacaoCliente"));
	}
	
	public Defeito obterListaId( Integer id){
		
		return  defeitoRepository.findById(id).orElse(null);
	}

}
