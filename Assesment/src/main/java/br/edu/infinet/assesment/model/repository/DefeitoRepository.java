package br.edu.infinet.assesment.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infinet.assesment.model.domain.Defeito;

@Repository
public class DefeitoRepository {

	private static Integer id = 1;
	private static Map<Integer, Defeito> mapaDefeito = new HashMap<Integer, Defeito>();

	// incluir defeito

	public static boolean incluir(Defeito defeito) {

		defeito.setId(id++);

		try {

			mapaDefeito.put(defeito.getId(), defeito); // Inclusão

			return true;

		} catch (Exception e) {
			return false;
		}

	}

	// Excluir
	public static Defeito excluirDefeito(Integer key) {

		return mapaDefeito.remove(key);
	}

	// obterLista

	public static Collection<Defeito> obterLista() {

		return mapaDefeito.values();

	}

}
