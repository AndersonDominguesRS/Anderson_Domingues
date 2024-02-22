package br.edu.infnet.AppControl.model.domain.tests;

import br.edu.infnet.AppControl.model.domain.Usuario;

public class UsuarioTest {

	public static void main(String[] args) {
		
		Usuario user1=new Usuario();
		
		
		user1.setNome("ANDERSON");
		user1.setId(1);
		user1.setTipo("ADMINISTRADOR");
		
		
		System.out.println(user1.getNome());
		System.out.println(user1.getId());
		System.out.println(user1.getTipo());
		

		
		
			

	}

}
