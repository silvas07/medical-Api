package medicExpert.api.medico;

import jakarta.validation.constraints.NotNull;
import medicExpert.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {



}
