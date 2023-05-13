package br.edu.ifsp.spo.contatos.dto;

import br.edu.ifsp.spo.contatos.model.Contato;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class ContatoDto {

    private Long id;

    private String nome;

    private String email;

    private String endereco;

    private Date nascimento;

    public ContatoDto(Contato contato) {
        this.id = contato.getId();
        this.nome = contato.getNome();
        this.email = contato.getEmail();
        this.endereco = contato.getEndereco();
        this.nascimento = contato.getNascimento();
    }
}
