package br.edu.ifsp.spo.contatos.controller;

import br.edu.ifsp.spo.contatos.model.Log;
import br.edu.ifsp.spo.contatos.service.LogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/log")
@AllArgsConstructor
public class LogController {

    private final LogService logService;

    @GetMapping
    public @ResponseBody
    List<Log> getAllLogs() {
        return this.logService.getLogEntries();
    }

}
