package br.edu.infinet.assesment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infinet.assesment.model.domain.Cliente;
import br.edu.infinet.assesment.model.service.ClienteService;

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
					
					campos = linha.split(";");	
					
					Cliente cliente = new Cliente();
					cliente.setStatusEmpreemdimento(campos[0]);
					cliente.setNomeCliente(campos[1]);
					cliente.setCnpj(campos[2]);
					cliente.setEndereco(campos[3]);
					cliente.setCidade(campos[4]);
					cliente.setEstado(campos[5]);
					cliente.setPais(campos[6]);
					cliente.setCep(campos[7]);
					
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
	
	
