package br.edu.infnet.assesment.model.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.assesment.model.domain.Solucao;


@Repository
public interface SolucaoRepository extends CrudRepository<Solucao, Integer> {
	
	@Query("from Solucao s where s.cliente.id = :solucaoId")
	List<Solucao> obterLista(Integer solucaoId);
	
	Collection<Solucao> findAll(Sort by);


}
