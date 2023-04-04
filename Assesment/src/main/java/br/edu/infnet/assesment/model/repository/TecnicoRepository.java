package br.edu.infnet.assesment.model.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.assesment.model.domain.Tecnico;;

@Repository
public interface TecnicoRepository extends CrudRepository<Tecnico, Integer> {
	
	
	@Query(value = "select u from Usuario u where u.nome like %?1%")
	List<Tecnico> buscarPorNome(String name);
	
	Collection<Tecnico> findAll(Sort by);


}
