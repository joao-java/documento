package documento.documento.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import documento.documento.models.professor;


public interface professorRepository extends JpaRepository<professor, Long>{

    List<professor> findByNomeLike(String nome);
}
