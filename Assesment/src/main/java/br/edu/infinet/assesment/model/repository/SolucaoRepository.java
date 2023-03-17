package br.edu.infinet.assesment.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infinet.assesment.model.domain.Solucao;
import br.edu.infinet.assesment.model.exceptions.HorariosInicioFimAtendimentoExceptions;

@Repository
public class SolucaoRepository {

	private static Integer id = 1;
	private static Map<Integer, Solucao> mapaSolucao = new HashMap<Integer, Solucao>();

	// incluir solucao

	public static boolean incluir(Solucao solucao) {

		solucao.setId(id++);
		try {
			solucao.regHorarioAtendimento(solucao.getHoraInicioAtendimento(), solucao.getHoraFimAtendimento());

			try {

				mapaSolucao.put(solucao.getId(), solucao); // Inclusão

				return true;

			} catch (Exception e) {
				return false;
			}

		} catch (HorariosInicioFimAtendimentoExceptions e1) {

			System.out.println("[ERROR] " + e1.getMessage());
		}
		;

		return true;

	}

	// Excluir
	public static Solucao excluirSolucao(Integer key) {

		return mapaSolucao.remove(key);
	}

	// obterLista

	public static Collection<Solucao> obterLista() {

		return mapaSolucao.values();

	}

}
