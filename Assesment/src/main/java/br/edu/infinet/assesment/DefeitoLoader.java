package br.edu.infinet.assesment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infinet.assesment.model.domain.Cliente;
import br.edu.infinet.assesment.model.domain.Defeito;
import br.edu.infinet.assesment.model.service.DefeitoService;

@Order(3)
@Component
public class DefeitoLoader implements ApplicationRunner {

		@Autowired
		private DefeitoService defeitoService;


		@Override
		public void run(ApplicationArguments args) throws Exception {

			
			try {
				
				String arq="ListaDefeitos.txt";
				
				try {

					
					FileReader file=new FileReader(arq);
					BufferedReader leitura = new BufferedReader(file);
					
					String linha = leitura.readLine();
					String[] campos=null;
								
					while (linha != null ) {
						
						Cliente cliente1=new Cliente();	
						cliente1.setId(3);
												
						campos = linha.split(";");	
						
						Defeito defeito=new Defeito();
						
						defeito.setIdentificacaoCliente(campos[0]);
						defeito.setObservacoes(campos[1]);
						defeito.setTipoEquipamento(campos[2]);
						defeito.setIdentificacaoEquipamento(campos[3]);
						defeito.setCliente(cliente1);
			
						defeitoService.incluir(defeito);
																
						linha = leitura.readLine();
				
					}
							
					
					leitura.close();
					file.close();
					
					
				} catch (IOException e) {
					
					System.out.println("[ERROR] - " + e.getMessage() );
				}
				
			} finally {
				System.out.println("Importação de Defeitos realizada com sucesso!");
				}
							
		}

	}
