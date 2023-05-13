package br.edu.ifsp.spo.contatos;

import br.edu.ifsp.spo.contatos.filter.LoggingFilter;
import br.edu.ifsp.spo.contatos.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ContatosApplication {

	@Autowired
	private LogService logService;

	public static void main(String[] args) {
		SpringApplication.run(ContatosApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<LoggingFilter> loggingFilter() {
		FilterRegistrationBean<LoggingFilter> registrationBean = new FilterRegistrationBean<>();

		registrationBean.setFilter(new LoggingFilter(logService));
		registrationBean.addUrlPatterns("/api/contato/*");

		return registrationBean;
	}
}