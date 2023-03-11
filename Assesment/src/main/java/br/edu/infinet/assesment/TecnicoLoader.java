package br.edu.infinet.assesment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infinet.assesment.model.domain.Tecnico;
import br.edu.infinet.assesment.model.service.TecnicoService;


@Component
public class TecnicoLoader implements ApplicationRunner {
	
	@Autowired
	private TecnicoService tecnicoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		
		try {
			
			String arq="ListaTecnico.txt";
			
			try {

				
				FileReader file=new FileReader(arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
				String[] campos=null;
							
				while (linha != null ) {
					
					campos = linha.split(";");	
					
					Tecnico tecnico = new Tecnico();
					tecnico.setFuncaoTecnico(campos[0]);
					tecnico.setCodigoTecnico(Integer.parseInt(campos[1]));
					tecnico.setNomeTecnico(campos[2]);

					
					tecnicoService.incluir(tecnico);					
					
					linha = leitura.readLine();
			
				}
						
				
				leitura.close();
				file.close();
				
				
			} catch (IOException e) {
				
				System.out.println("[ERROR] - " + e.getMessage() );
			}
			
		} finally {
			System.out.println("Importação Técnico realizada com sucesso!");
			}
						
	}

}