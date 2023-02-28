package br.edu.infinet.assesment.model.repository;

import br.edu.infinet.assesment.model.domain.Usuario;

public class AcessoRepository {

	public static Usuario autenticar(Usuario usuario) {		
		
		
		if (usuario.getEmail().equalsIgnoreCase(usuario.getSenha())) {
			
			
			return new Usuario("Administrador", usuario.getEmail(), usuario.getSenha(), "ADMINISTRADOR");
		}
		
		return null;
	}

}
