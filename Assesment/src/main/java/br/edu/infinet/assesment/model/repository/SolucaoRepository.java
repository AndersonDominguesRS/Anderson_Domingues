package br.edu.infinet.assesment.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infinet.assesment.model.domain.Solucao;

@Repository
public interface SolucaoRepository extends CrudRepository<Solucao, Integer> {
	
//	@Query("from Defeito d where d.cliente.id = :clientId")
//	List<Defeito> obterLista(Integer clientId);

}
