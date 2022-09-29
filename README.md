<h1>API-WorkDB-Teste</h1>

> Status: Finalizado. 

### API para consulta de previsões do tempo, alimentada por uma API externa.
### Técnologias utilizadas:
+ Java.
+ Spring Boot.
+ Banco de dados PostgreSQL.
+ API externa - https://openweathermap.org

### Funcionalidades:
#### -- Buscar a temperatura de uma determinada cidade, PASSANDO OS PARÂMETROS DA SEGUINTE FORMA:

localhost:8080/latitude/longitude/senha de autenticação </br>
Exemplo de URL no Postman: http://localhost:8080/-27.5969/-48.5495/f89de51b9af13ce4476877feca3f99a0 </br>
(Latitude e longitude de Florianópolis no exemplo)
</br>
</br>
Retorna:
+ Temperatura. Padrão da unidade: Kelvin, Métrico: Celsius, Imperial: Fahrenheit.
+ Sensação termica
+ Temperatura mínima no momento
+ Temperatura máxima no momento
+ Pressão atmosférica
+ Umidade
+ Pressão atmosférica ao nível do mar
+ Pressão atmosférica ao nível do solo

#### -- Pegar o histórico de buscas registrado no banco de dados.
URL no Postman: http://localhost:8080/pegarRegistros
+ Retorna as pesquisas de todas as cidades que foram feitas na API

### Collections do postman, arquivo:
API WorkDB.postman_collection.json

### Como rodar a aplicação:
+ Crie no banco de dados PostgreSQL uma database com o nome: api_previsao
+ Start a sua aplicação, e a tabela para salvar registros será criada automaticamente.
