package documento.documento.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class cadastramentoDTO {
    private Long id;
    private String nome;    
    private String DTinicio; //data inicio
    private String DTfim; //data final
    private int HRinicio;
    private int HRfim;
    private String cidade;
    private String estado;
    private String cep;

}
