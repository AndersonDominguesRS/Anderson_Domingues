package br.edu.infnet.assesment.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.assesment.model.domain.Tecnico;;

@Repository
public interface TecnicoRepository extends CrudRepository<Tecnico, Integer> {
	
	Collection<Tecnico> findAll(Sort by);


}
