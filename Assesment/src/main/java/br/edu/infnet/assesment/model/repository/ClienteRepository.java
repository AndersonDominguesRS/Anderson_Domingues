package br.edu.infnet.assesment.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.assesment.model.domain.Cliente;

import org.springframework.data.domain.Sort;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	
	@Query("from Cliente c where c.usuario.id = :userId")
	List<Cliente> obterLista(Integer userId, Sort sort);

}
