package br.edu.infinet.assesment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infinet.assesment.model.domain.Usuario;
import br.edu.infinet.assesment.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner {
	
	@Autowired
	private UsuarioService usuarioSerice;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		try {
			
			String arq="ListaUsuario.txt";
			
			try {

				
				FileReader file=new FileReader(arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
				String[] campos=null;
							
				while (linha != null ) {
					
					campos = linha.split(";");	
					
					Usuario usuario = new Usuario();
					usuario.setNome(campos[0]);
					usuario.setEmail(campos[1]);
					usuario.setSenha(campos[2]);
					usuario.setTipo(campos[3]);
					
					usuarioSerice.incluir(usuario);					
					
					linha = leitura.readLine();
			
				}
						
				
				leitura.close();
				file.close();
				
				
			} catch (IOException e) {
				
				System.out.println("[ERROR] - " + e.getMessage() );
			}
			
		} finally {
			System.out.println("Importação de usuários realizada com sucesso!");
			}
						
	}

}


