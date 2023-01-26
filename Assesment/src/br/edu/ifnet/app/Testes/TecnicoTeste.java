package br.edu.ifnet.app.Testes;

import br.edu.ifnet.app.Dominio.Tecnico;
import br.edu.ifnet.app.Exceptions.CadastroTecnicoExceptions;

public class TecnicoTeste {
	
	public static void main(String[] args) {
		
		Tecnico t1= new Tecnico();
		
		try {
			t1.cadastroTecnico("Carlos");
		} catch (CadastroTecnicoExceptions e) {
			System.out.println("[ERROR] " + e.getMessage());
		}

		
	}

}
