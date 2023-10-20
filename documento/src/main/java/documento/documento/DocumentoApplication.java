package documento.documento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import documento.documento.models.curso;

@SpringBootApplication
public class DocumentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentoApplication.class, args);

		curso novoCurso = new curso();
		novoCurso.setNome("Nome do Curso");
		novoCurso.setCargaHoraria(40);
		novoCurso.setObjetivos("Objetivos do Curso");
		novoCurso.setEmenda("Emenda do Curso");
	}

}
