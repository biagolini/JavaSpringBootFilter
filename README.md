# Exemplo de Filtro em Aplicação Web com Spring Boot

Este repositório contém um projeto de exemplo que demonstra como utilizar um filtro no Spring Boot para registrar informações de requisições HTTP em uma aplicação web.

## Estrutura do Projeto

O projeto é dividido em várias camadas, incluindo:

- Controller: Responsável pelo mapeamento das rotas e pela manipulação das requisições HTTP.
- Model: Contém as entidades do domínio da aplicação.
- Repository: Camada responsável pela persistência e recuperação de dados.
- Service: Camada responsável pela lógica de negócio da aplicação.
- Filter: Camada onde os filtros são implementados para manipular requisições HTTP antes que elas cheguem ao controlador.

## Como o Filtro Funciona

Neste projeto, um filtro chamado `LoggingFilter` é utilizado para registrar informações sobre as requisições HTTP feitas à aplicação. O filtro intercepta todas as requisições feitas ao endpoint `/api/contato/*` e registra informações como método HTTP, URI, endereço IP do cliente, horário de início e fim da requisição.

## Como Executar o Projeto

1. Clone este repositório e importe o projeto em sua IDE preferida.
2. Inicie a aplicação usando o Spring Boot.
3. Acesse o seguinte endereço usando um navegador ou uma ferramenta de teste de API, como o Postman: `http://localhost:8080/api/contato`
4. Para verificar o funcionamento do filtro, acesse `http://localhost:8080/api/log` e realize uma requisição do tipo GET. Você receberá uma lista de registros de log das requisições HTTP feitas ao endpoint `/api/contato/*`.

## Contribuições

Sinta-se à vontade para criar issues, pull requests ou fazer fork do repositório para ajudar a melhorar o projeto.

## Licença e Isenção de Responsabilidade

Este projeto é de código aberto e está disponível sob a Licença MIT. Você tem liberdade para copiar, modificar e usar o projeto como desejar. No entanto, qualquer responsabilidade pelo uso do código é de sua inteira responsabilidade. Por favor, use-o por sua conta e risco.

