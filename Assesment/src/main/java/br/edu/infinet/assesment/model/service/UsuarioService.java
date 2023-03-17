package br.edu.infinet.assesment.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.assesment.model.domain.Usuario;
import br.edu.infinet.assesment.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario incluir (Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}
	
	public void excluir (Integer key) {
		
		usuarioRepository.deleteById(key);
	}
	
	public Collection<Usuario> obterLista(){
		
		return (Collection<Usuario>) usuarioRepository.findAll();
	}
	
	public Usuario autenticar(Usuario usuario) {	
		
		return usuarioRepository.autenticacao(usuario.getEmail(), usuario.getSenha());
		
		
	}

}
