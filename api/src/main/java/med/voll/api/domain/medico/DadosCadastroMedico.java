package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank(message = "O nome não pode estar em branco")
        String nome,
        @NotBlank(message = "O e-mail não pode estar em branco")
        @Email(message = "Formato de e-mail inválido")
        String email,

        @NotBlank(message = "O telefone não pode estar em branco")
        String telefone,
        @NotBlank(message = "O CRM não pode estar em branco")
        @Pattern(regexp = "\\d{4,6}", message = "Formato do CRM é inválido")
        String crm,
        @NotNull(message = "Especialidade é obrigatório")
        Especialidade especialidade,

        @NotNull(message = "Dados do endereço são obrigatórios") @Valid DadosEndereco endereco) {
}
