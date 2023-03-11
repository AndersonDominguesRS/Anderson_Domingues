package br.edu.infinet.assesment.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infinet.assesment.model.domain.Cliente;

@Repository
public class ClienteRepository {

	private static Integer id = 1;
	private static Map<Integer, Cliente> mapaCliente = new HashMap<Integer, Cliente>();

	// incluir usuario

	public static boolean incluir(Cliente cliente) {

		cliente.setId(id++);

		try {

			mapaCliente.put(cliente.getId(), cliente); // Inclusão

			return true;

		} catch (Exception e) {
			return false;
		}

	}

	// Excluir
	public static Cliente excluirCliente(Integer key) {

		return mapaCliente.remove(key);
	}

	// obterLista

	public static Collection<Cliente> obterLista() {

		return mapaCliente.values();

	}

}
