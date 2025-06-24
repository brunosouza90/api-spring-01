package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Endereco;

public record DadosDetalhamentoMedico(Long id, Boolean ativo, String nome, String email, String crm, String telefone, Endereco endereco) {
    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.isAtivo(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEndereco());

    }
}
