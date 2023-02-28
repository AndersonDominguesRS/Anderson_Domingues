package br.edu.infinet.assesment.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infinet.assesment.model.domain.Solucao ;


public class SolucaoRepository {

	private static Integer id = 1;
	private static Map<Integer, Solucao > mapaSolucao = new HashMap<Integer, Solucao >();

	// incluir solucao

	public static boolean incluir(Solucao solucao) {

		solucao.setId(id++);

		try {

			mapaSolucao.put(solucao.getId(), solucao); // Inclusão

			return true;

		} catch (Exception e) {
			return false;
		}

	}

	// Excluir
	public static Solucao  excluirSolucao (Integer key) {

		return mapaSolucao.remove(key);
	}

	// obterLista

	public static Collection<Solucao > obterLista() {

		return mapaSolucao.values();

	}

}
