package br.edu.infnet.AppControl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import br.edu.infnet.AppControl.model.domain.Aluno;
import br.edu.infnet.AppControl.model.domain.Disciplina;
import br.edu.infnet.AppControl.model.service.DisciplinaService;

@SpringBootTest
public class DIsciplinaTest {

	private DisciplinaService disciplinaService;

	@BeforeEach
	void setUp() {
		disciplinaService = new DisciplinaService();
	}

	@Test
	void inclusao() {

		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Joao");
		aluno1.setAprovado(false);
		aluno1.setId(2);

		listaAlunos.add(aluno1);

		Disciplina disciplina = new Disciplina("Matematica");
		Disciplina disciplina2 = new Disciplina("Georgrafia", listaAlunos);

		disciplinaService.incluir(disciplina);
		disciplinaService.incluir(disciplina2);

		disciplina2.getAlunos();
		disciplina.setAlunos(listaAlunos);

		assertEquals(disciplina, disciplinaService.obter("Matematica"));

	}

	@Test
	void recuperacaoDisciplina() {

		disciplinaService.obter("Matematica");

	}

	@Test
	void recuperacaoTodasDisicplinas() {

		disciplinaService.obterLista();

	}

	@Test
	void exclusao() {

		disciplinaService.excluir("Matematica");

	}

}
