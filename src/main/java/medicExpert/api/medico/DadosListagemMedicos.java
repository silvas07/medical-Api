package medicExpert.api.medico;

public record DadosListagemMedicos(String nome, String crm, String email, Especialidade especialidade) {

    public DadosListagemMedicos(Medico medico){
        this(medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getEspecialidade());
    }

}
