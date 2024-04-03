package escolaApp.model.domain.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import escolaApp.model.domain.Avaliacao;

public class AvaliacoesService {
	
	private static Map<Integer, Avaliacao> avaliacoess = new HashMap<Integer, Avaliacao>();
	
	private static Integer id=0;
	

	public static void incluir(Avaliacao avaliacoesNovo) {
	
		avaliacoesNovo.setId(++id);
		avaliacoess.put(avaliacoesNovo.getId(), avaliacoesNovo);		
	}		

	public static void excluir(Integer idAvaliacoes) {
		
		avaliacoess.remove(idAvaliacoes);
	}	

	public static Collection<Avaliacao> obterAvaliacoes() {
		return avaliacoess.values();		
	}		
	
	public static Avaliacao  obterAvaliacao(Integer idAvaliacoes) {
		
		return avaliacoess.get(idAvaliacoes);
		
	}

}
