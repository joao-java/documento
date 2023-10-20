package documento.documento.models;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class cadastramento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;    
    private String DTinicio; //data inicio
    private String DTfim; //data final
    private int HRinicio;
    private int HRfim;
    private String cidade;
    private String estado;
    private String cep;

    @OneToMany(mappedBy = "cadastramentos")
    private List<curso> cursos;
    @OneToMany(mappedBy = "professor")
    private List<professor> professores;

    @Override
    public String toString() {
        return "cadastramento [id=" + id + ", nome=" + nome + "]";
    }

}
