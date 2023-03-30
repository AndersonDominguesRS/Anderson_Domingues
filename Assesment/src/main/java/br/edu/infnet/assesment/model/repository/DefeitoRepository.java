package br.edu.infnet.assesment.model.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.assesment.model.domain.Defeito;


@Repository
public interface DefeitoRepository extends CrudRepository<Defeito, Integer> {
	
	@Query("from Defeito d where d.cliente.id = :clientId")
	List<Defeito> obterLista(Integer clientId);

	Collection<Defeito> findAll(Sort by);
}
