<h1>API-WorkDB-Teste</h1>

> Status: Finalizado. 

### API para consulta de previsões do tempo, se alimentando de uma API externa.
### Técnologias utilizadas:
+ Java.
+ Spring Boot.
+ Banco de dados Postgres.
+ API externa - https://openweathermap.org

### Funcionalidades:
#### Buscar a temperatura de uma determinada cidade, passando latitude, longitude e senha de autenticação como parâmetros, retorna:
+ Temperatura. Padrão da unidade: Kelvin, Métrico: Celsius, Imperial: Fahrenheit.
+ Sensação termica
+ Temperatura mínima no momento
+ Temperatura máxima no momento
+ Pressão atmosférica
+ Umidade
+ Pressão atmosférica ao nível do mar
+ Pressão atmosférica ao nível do solo

#### Pegar o histórico de buscas registrado no banco de dados.
+ Retorna as pesquisas de todas as cidades que foram feitas na API

### Como rodar a aplicação:
