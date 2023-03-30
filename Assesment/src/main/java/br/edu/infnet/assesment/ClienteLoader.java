package br.edu.infnet.assesment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.assesment.model.domain.Cliente;
import br.edu.infnet.assesment.model.domain.Usuario;
import br.edu.infnet.assesment.model.service.ClienteService;

@Order(2)
@Component
public class ClienteLoader implements ApplicationRunner {
	
	@Autowired
	private ClienteService clienteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		try {
			
			String arq="ListaClientes.txt";
			
			try {

				
				FileReader file=new FileReader(arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
				String[] campos=null;
							
				while (linha != null ) {
					
					Usuario usuario = new Usuario();
					usuario.setId(1);
					
					campos = linha.split(";");	
					
					Cliente cliente = new Cliente();
					cliente.setStatusEmpreemdimento(campos[0]);
					cliente.setNomeCliente(campos[1]);
					cliente.setCnpj(campos[2]);					
					cliente.setUsuario(usuario);
					
										
					clienteService.incluir(cliente);
					
					
					linha = leitura.readLine();
			
				}
						
				
				leitura.close();
				file.close();
				
				
			} catch (IOException e) {
				
				System.out.println("[ERROR] - " + e.getMessage() );
			}
			
		} finally {
			System.out.println("Importação de clientes realizada com sucesso!");
			}
	}
		

}
	
	
