package documento.documento.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class professorDTO {
    private Long id;
    private String nome;
    private String CPF;
    private String RG;
    private int endereco;
    private int celular;
}
