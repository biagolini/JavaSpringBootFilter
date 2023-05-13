package br.edu.ifsp.spo.contatos.service;


import br.edu.ifsp.spo.contatos.model.Log;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogService {
    private final List<Log> logEntries = new ArrayList<>();

    public void addLogEntry(Log log) {
        logEntries.add(log);
    }

    public List<Log> getLogEntries() {
        return new ArrayList<>(logEntries);
    }
}