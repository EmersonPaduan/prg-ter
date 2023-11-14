create database bd_escola;

use bd_escola;

-- paga a tabela e TODOS os dados
drop table alunos; 

create table alunos(
	ra int not null auto_increment,
    nome varchar(120),
    email varchar(80) unique,
    primary key pk_alunos (ra)
);

desc alunos;

# manipulando os dados

-- inserindo dados 
insert into alunos (nome, email) values ('Carlos', 'carlos@email.com');
insert into alunos (nome, email) values ('Pedro', 'pedro@email.com');

-- buscando todos as informações de todos os alunos
select * from alunos;

-- buscando apenas o nome e email de todos os alunos
select nome, email from alunos;

-- busque os alunos com ra menor que 3
select * from alunos where ra < 3;

-- busque os dados do aluno com email pedro@email.com
select * from alunos where email = 'pedro@email.com';

-- busque os dados do aluno com email contendo pedro
select * from alunos where email like 'pedro%';

-- alterando o email do aluno com ra 1
update alunos
set email = 'carlos@novoemail.com'
where ra = 1;

-- apagar os dados do aluno com ra 3
delete  from alunos where ra = 3;
