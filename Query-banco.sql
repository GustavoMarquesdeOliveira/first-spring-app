### Criação do banco de dados
create database cadastro;
use cadastro;
create table usuarios (
nome varchar(100)
);


### Inserir dados
use cadastrar;
insert into usuarios (nome) values ('Gustavo Teste');

### Criar banco se o banco cadastrar não existir
CREATE DATABASE IF NOT EXISTS cadastrar;

### Selecionar a table pessoa
select * from pessoa

### Ver bancos
SELECT DATABASE();

### Adicionar coluna cpf na tabela pessoa
ALTER TABLE pessoa ADD COLUMN cpf BIGINT;


-- confirma com qual database você está conectado
SELECT DATABASE(), USER(), CURRENT_USER();

-- procura qualquer rotina com esse nome em todos os schemas
SELECT ROUTINE_SCHEMA, ROUTINE_NAME, ROUTINE_TYPE
FROM information_schema.routines
WHERE ROUTINE_NAME = 'insert_pessoa';

-- verifica status de procedures específicas
SHOW PROCEDURE STATUS WHERE Name = 'insert_pessoa';
SHOW FUNCTION STATUS WHERE Name = 'insert_pessoa';

-- lista privilégios do usuário atual
SHOW GRANTS FOR CURRENT_USER();