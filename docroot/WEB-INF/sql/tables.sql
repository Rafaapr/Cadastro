create table icesp_cadastroUsuario (
	cpf VARCHAR(75) not null primary key,
	rg VARCHAR(75) null,
	nome VARCHAR(75) null,
	userName VARCHAR(75) null,
	sobrenome VARCHAR(75) null,
	email VARCHAR(75) null,
	emailconfir VARCHAR(75) null,
	senha VARCHAR(75) null,
	senhaconfir VARCHAR(75) null,
	celular VARCHAR(75) null,
	sexo VARCHAR(75) null,
	date_ DATE null,
	cep VARCHAR(75) null,
	estado VARCHAR(75) null,
	cidade VARCHAR(75) null,
	rua VARCHAR(75) null,
	profissao VARCHAR(75) null,
	hospital VARCHAR(75) null
);