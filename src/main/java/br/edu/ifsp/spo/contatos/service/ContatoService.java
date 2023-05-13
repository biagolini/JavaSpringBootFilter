package br.edu.ifsp.spo.contatos.service;

import br.edu.ifsp.spo.contatos.model.Contato;
import br.edu.ifsp.spo.contatos.repository.ContatoRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ContatoService {

    private final ContatoRepository contatoRepository;
    public Page<Contato> findAll(Pageable pageable){
        System.out.println("Passei aqui 2");
        return this.contatoRepository.findAll(pageable);
    }


}
