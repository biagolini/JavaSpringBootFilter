package br.edu.ifsp.spo.contatos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Log {
    private String method;
    private String requestURI;
    private String clientIP;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // Adicione construtores, getters e setters
}
