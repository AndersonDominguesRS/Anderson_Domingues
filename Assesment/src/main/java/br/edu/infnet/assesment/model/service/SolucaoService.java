package br.edu.infnet.assesment.model.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.assesment.model.domain.Solucao;
import br.edu.infnet.assesment.model.exceptions.HorariosInicioFimAtendimentoExceptions;
import br.edu.infnet.assesment.model.repository.SolucaoRepository;

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
		
		return (Collection<Solucao>) solucaoRepository.findAll(Sort.by(Direction.ASC, "identificacaoCliente"));
	}
	
	public Solucao obterListaId( Integer id){
		
		return  solucaoRepository.findById(id).orElse(null);
	}
	
	public long qtdeAtendimento() {
		
		return solucaoRepository.count();
	}
	
	public Collection<Solucao> qtdeSla( ) {
		
		return solucaoRepository.qtdeSla();
	}
	
	public Collection<Solucao> qtdePecas( ) {
		
		return solucaoRepository.qtdePecas();
	}

}
