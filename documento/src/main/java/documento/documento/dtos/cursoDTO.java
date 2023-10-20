package documento.documento.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class cursoDTO {
    private Long id;
    private String nome;
    private int cargaHoraria;
    private String objetivos;
    private String Emenda;
}
