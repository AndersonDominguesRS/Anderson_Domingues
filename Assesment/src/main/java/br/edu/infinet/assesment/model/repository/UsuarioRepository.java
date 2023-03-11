package br.edu.infinet.assesment.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infinet.assesment.model.domain.Usuario;

@Repository
public class UsuarioRepository {

	private static Integer id = 1;
	private static Map<Integer, Usuario> mapaUsuario = new HashMap<Integer, Usuario>();

	// incluir usuario

	public boolean incluir(Usuario usuario) {

		usuario.setId(id++);

		try {

			mapaUsuario.put(usuario.getId(), usuario); // Inclusão

			return true;

		} catch (Exception e) {
			return false;
		}

	}

	// Excluir
	public Usuario excluir(Integer key) {

		return mapaUsuario.remove(key);
	}

	// obterLista

	public Collection<Usuario> obterLista() {

		return mapaUsuario.values();

	}

}
