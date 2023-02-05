package br.edu.infinet.assesment.model.tests;

import br.edu.infinet.assesment.model.domain.Tecnico;
import br.edu.infinet.assesment.model.exceptions.CadastroTecnicoExceptions;

public class TecnicoTest {
	
	public static void main(String[] args) {
		
		Tecnico t1= new Tecnico();
		
		try {
			t1.cadastroTecnico("Carlos");
		} catch (CadastroTecnicoExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}

		
	}

}