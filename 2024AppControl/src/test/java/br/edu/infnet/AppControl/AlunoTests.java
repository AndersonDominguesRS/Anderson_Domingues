package br.edu.infnet.AppControl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.AppControl.model.domain.Aluno;

@SpringBootTest
class AlunoTests {
	
	private Aluno aluno;
	
	private final String NOME="ANDERSON";
	private final int ID=123;
	private final String TIPO="GRADUADO";
	private final int FREQUENCIA=8;
	
	@BeforeEach
	void setUp() {
		aluno=new Aluno();
		
		aluno.setNome(NOME);
		aluno.setId(ID);
		aluno.setTipo(TIPO);
		aluno.setFrequencia(FREQUENCIA);
	}

	
	@Test
	void AlunoAprovado() {
		
		aluno.setNota(8);
		aluno.setAprovado(aluno.status());

		assertEquals(true, aluno.status());
	}
	
	@Test
	void AlunoReprovado() {		

		aluno.setNota(5);
		aluno.setAprovado(aluno.status());
					
	
		assertEquals(false, aluno.status());
	}
	
	@Test
	void RecuperarDados() {
		
		assertEquals(NOME, aluno.getNome());
		assertEquals(ID, aluno.getId());
		assertEquals(TIPO, aluno.getTipo());
		assertEquals(FREQUENCIA, aluno.getFrequencia());
		assertEquals(0, aluno.getNota());
		assertEquals(false, aluno.isAprovado());

		
	}

}
