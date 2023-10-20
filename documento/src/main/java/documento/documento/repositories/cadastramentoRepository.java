package documento.documento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import documento.documento.models.cadastramento;


public interface cadastramentoRepository extends JpaRepository<cadastramento, Long>{
    cadastramento findCategoriaCursoFetchCursos(@Param("id") Long id);
}
