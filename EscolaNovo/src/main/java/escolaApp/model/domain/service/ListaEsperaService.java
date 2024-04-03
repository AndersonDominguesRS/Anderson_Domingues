package escolaApp.model.domain.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import escolaApp.model.domain.ListaEspera;

public class ListaEsperaService {
	
	private static Map<Integer, ListaEspera> listaEsperas = new HashMap<Integer, ListaEspera>();
	
	private static Integer id=0;
	

	public static void incluir(ListaEspera listaEsperaNovo) {
	
		listaEsperaNovo.setId(++id);
		listaEsperas.put(listaEsperaNovo.getId(), listaEsperaNovo);		
	}		

	public static void excluir(Integer idListaEspera) {
		
		listaEsperas.remove(idListaEspera);
	}	

	public static Collection<ListaEspera> obterListaEsperas() {
		return listaEsperas.values();		
	}		
	
	public static ListaEspera  obterListaEspera(Integer idListaEspera) {
		
		return listaEsperas.get(idListaEspera);
		
	}

}
