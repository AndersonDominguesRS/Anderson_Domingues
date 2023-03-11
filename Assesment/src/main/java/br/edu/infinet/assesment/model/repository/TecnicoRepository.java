package br.edu.infinet.assesment.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infinet.assesment.model.domain.Tecnico;

@Repository
public class TecnicoRepository {

	private static Integer id = 1;
	private static Map<Integer, Tecnico> mapaTecnico = new HashMap<Integer, Tecnico>();

	// incluir usuario

	public static boolean incluir(Tecnico tecnico) {

		tecnico.setId(id++);

		try {

			mapaTecnico.put(tecnico.getId(), tecnico); // Inclusão

			return true;

		} catch (Exception e) {
			return false;
		}

	}

	// Excluir
	public static Tecnico excluirTecnico(Integer key) {

		return mapaTecnico.remove(key);
	}

	// obterLista

	public static Collection<Tecnico> obterLista() {

		return mapaTecnico.values();

	}

}
