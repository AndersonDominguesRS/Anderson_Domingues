package br.edu.infnet.assesment.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.assesment.model.domain.Usuario;

@FeignClient (url = "localhost:8080/api/usuario", name = "ususarioClient")
public interface IUsuarioClient {
	
	@GetMapping
	public List<Usuario> obterLista();

}
