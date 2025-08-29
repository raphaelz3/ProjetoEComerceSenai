--DDL Comandos que Criam, Editam ou Removem Tabelas, Colunas, Schema, Banco de Dados
/* 
	CREATE <O QUE CRIAR>
	DROP <O QUE REMOVER>
	ALTER <O QUE EDITAR>
*/

CREATE SCHEMA clinica;
--Criar TAbelas
CREATE TABLE clinica.medico(
	id_medico INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	nome TEXT NOT NULL,
	crm TEXT NOT NULL,
	especialidade TEXT NOT NULL
);

CREATE TABLE clinica.paciente(
	id_paciente INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	cpf TEXT NOT NULL,
	nome TEXT NOT NULL,
	idade INT NOT NULL,
	data_de_nascimento DATE NOT NULL,
	email TEXT UNIQUE
);

CREATE TABLE clinica.clinica(
	id_clinica INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	nome TEXT NOT NULL,
	endereco TEXT NOT NULL,
	descricao TEXT NOT NULL
);

CREATE TABLE clinica.consulta(
	id_consulta INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	data_consulta TIMESTAMPTZ NOT NULL,
	valor NUMERIC (10,4),
	id_medico INT NOT NULL,
	FOREIGN KEY (id_medico) REFERENCES clinica.medico(id_medico), --metodo longo
	id_clinica INT NOT NULL REFERENCES clinica.clinica(id_clinica), --metodo curto
	id_paciente INT NOT NULL REFERENCES clinica.paciente(id_paciente)
);

--Excluir Tabelas

DROP TABLE IF EXISTS clinica.consulta; --IF EXISTS é usado para o comando só ser execultado se realmente existe
DROP TABLE IF EXISTS clinica.clinica;
DROP TABLE IF EXISTS clinica.paciente;
DROP TABLE IF EXISTS clinica.medico;

--Limpar Tabela
TRUNCATE TABLE clinica.consulta;
--RESTART IDENTITY -Reinicia a sequencia da tabela

--Editar Tabelas

ALTER TABLE clinica.paciente ADD COLUMN telefone NUMERIC (11); -- adiciona coluna telefone
ALTER TABLE clinica.paciente ADD COLUMN email TEXT UNIQUE; -- adiciona columa email em que o dado é unico na tabela
ALTER TABLE clinica.paciente DROP COLUMN telefone; -- Excluir coluna
ALTER TABLE clinica.paciente RENAME TO novopaciente; -- renomeando a tabela paciente para novopaciente
ALTER TABLE clinica.clinica ALTER COLUMN nome TYPE TEXT; -- Foi alterado o tipo de dado
--DML (Linguagem de Manipulação de Dados) - Inserem, Editam ou Removem Dados

