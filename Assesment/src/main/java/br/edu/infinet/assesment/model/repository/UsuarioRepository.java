package br.edu.infinet.assesment.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infinet.assesment.model.domain.Usuario;

public class UsuarioRepository {

	private static Integer id = 1;
	private static Map<Integer, Usuario> mapaUsuario = new HashMap<Integer, Usuario>();

	// incluir usuario

	public static boolean incluir(Usuario usuario) {

		usuario.setId(id++);

		try {

			mapaUsuario.put(usuario.getId(), usuario); // Inclusão

			return true;

		} catch (Exception e) {
			return false;
		}

	}

	// Excluir
	public static Usuario excluir(Integer key) {

		return mapaUsuario.remove(key);
	}

	// obterLista

	public static Collection<Usuario> obterLista() {

		return mapaUsuario.values();

	}

}
