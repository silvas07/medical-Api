package medicExpert.api.medico;

public record DadosListagemMedicos(Long id, String nome, String crm, String email, Especialidade especialidade) {

    public DadosListagemMedicos(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getEspecialidade());
    }

}
