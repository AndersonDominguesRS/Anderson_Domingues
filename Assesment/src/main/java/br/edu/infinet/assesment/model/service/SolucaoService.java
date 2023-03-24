package br.edu.infinet.assesment.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.assesment.model.domain.Solucao;
import br.edu.infinet.assesment.model.exceptions.HorariosInicioFimAtendimentoExceptions;
import br.edu.infinet.assesment.model.repository.SolucaoRepository;

@Service
public class SolucaoService {
	
	@Autowired
	private SolucaoRepository solucaoRepository;
	
	public Solucao incluir (Solucao solucao) {
		
		try {
			solucao.regHorarioAtendimento(solucao.getHoraInicioAtendimento(), solucao.getHoraFimAtendimento());
		} catch (HorariosInicioFimAtendimentoExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return solucaoRepository.save(solucao);
	}
	
	public void excluirSolucao (Integer key) {
		
		solucaoRepository.deleteById(key);
	}
	
	public Collection<Solucao> obterLista(){
		
		return (Collection<Solucao>) solucaoRepository.findAll();
	}
	
	public Solucao obterListaId( Integer id){
		
		return  solucaoRepository.findById(id).orElse(null);
	}

}
