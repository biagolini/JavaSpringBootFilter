package br.edu.ifsp.spo.contatos.filter;

import br.edu.ifsp.spo.contatos.model.Log;
import br.edu.ifsp.spo.contatos.service.LogService;
import jakarta.servlet.annotation.WebFilter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.time.LocalDateTime;

@WebFilter("/api/contato/*")
public class LoggingFilter implements Filter {


    private final LogService logService;

    public LoggingFilter(LogService logService) {
        this.logService = logService;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Inicialização do filtro, se necessário
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String method = httpServletRequest.getMethod();
        String requestURI = httpServletRequest.getRequestURI();
        String clientIP = request.getRemoteAddr();
        LocalDateTime startTime = LocalDateTime.now();

        chain.doFilter(request, response);

        LocalDateTime endTime = LocalDateTime.now();
        Log logEntry = new Log(method, requestURI, clientIP, startTime, endTime);
        logService.addLogEntry(logEntry);
    }

}