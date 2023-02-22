package br.edu.infinet.assesment.model.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.infinet.assesment.model.domain.Usuario;

public class UsuarioRepository {

	private static List<Usuario> lista=new ArrayList<Usuario>();

	
	//incluir usuario
	
	public static boolean incluir(Usuario usuario) {
		
		try {
			
			lista.add(usuario); //inclus�o
			
			return true;
			
		} catch (Exception e) {
			return false;
		}

	}
	
	
	//obterLista
	
	public static List<Usuario> obterLista() {
		
		return lista;
	}
	
}


