package br.edu.ifsp.spo.contatos.controller;

import br.edu.ifsp.spo.contatos.dto.ContatoDto;
import br.edu.ifsp.spo.contatos.service.ContatoService;
import lombok.AllArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/contato")
@AllArgsConstructor
public class ContatoController {

    private final ConversionService conversionService;

    private final ContatoService contatoService;

    @GetMapping
    public @ResponseBody
    Page<ContatoDto> findAllPaginated(
            @PageableDefault(sort = "id", direction = Sort.Direction.DESC, page = 0, size = 10) Pageable pageable
    ) {
        return this.contatoService
                .findAll(pageable)
                .map(entity -> this.conversionService.convert(entity, ContatoDto.class));
    }




}
