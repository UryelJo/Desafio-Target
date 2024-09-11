-- Utlizei como base Postgress, mas posso fazer em outros bancos de dados tambem --

-- Criação da tabela 'estado'
CREATE TABLE estado (
                        id SERIAL PRIMARY KEY,
                        descricao VARCHAR(255) NOT NULL
);

-- Criação da tabela 'endereco'
CREATE TABLE endereco (
                          id SERIAL PRIMARY KEY,
                          rua VARCHAR(255) NOT NULL,
                          bairro VARCHAR(255) NOT NULL,
                          estado INTEGER REFERENCES estado(id),
                          numero INTEGER NOT NULL,
                          cep VARCHAR(20) NOT NULL
);

-- Criação da tabela 'tipo_telefone'
CREATE TABLE tipo_telefone (
                               id SERIAL PRIMARY KEY,
                               descricao VARCHAR(50) NOT NULL
);

-- Criação da tabela 'telefone'
CREATE TABLE telefone (
                          id SERIAL PRIMARY KEY,
                          numero VARCHAR(20) NOT NULL,
                          tipo_telefone INTEGER REFERENCES tipo_telefone(id)
);

-- Criação da tabela 'cliente'
CREATE TABLE cliente (
                         id SERIAL PRIMARY KEY,
                         nome VARCHAR(255) NOT NULL,
                         cpf VARCHAR(11) NOT NULL UNIQUE,
                         email VARCHAR(255) NOT NULL,
                         razao_social VARCHAR 70 NOT NULL,
                         telefone_id INTEGER REFERENCES telefone(id),
                         endereco_id INTEGER REFERENCES endereco(id)
);

-- Script de busca requerido --
SELECT * FROM cliente JOIN endereco ON cliente.endereco_id = endereco.id JOIN
    estado ON endereco.estado = estado.id JOIN
    telefone ON telefone.cliente_id = cliente.id WHERE
    estado.descricao = 'SP';