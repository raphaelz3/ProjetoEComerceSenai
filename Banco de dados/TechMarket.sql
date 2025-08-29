--DDL
CREATE SCHEMA ecommerce IF NOT EXISTS;

--SET search_path TO ecommere -É usado para mudar o schema padrão de public para ecommerce evitando ter que sinalizar onde está a tabela exemplo: ecommerce.pedido
--TABELAS
CREATE TABLE ecommerce.produto (
	id_produto INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	nome_produto TEXT NOT NULL,
	preco NUMERIC (16,4) NOT NULL,
	estoque_disponivel INT NOT NULL,
	imagem_url TEXT NOT NULL
);

CREATE TABLE ecommerce.cliente(
	id_cliente INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	email TEXT NOT NULL,
	senha TEXT NOT NULL,
	telefone TEXT NOT NULL,
	data_cadastro TIMESTAMPTZ
);

CREATE TABLE ecommerce.pedido(
	id_pedido INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	id_cliente INT NOT NULL REFERENCES ecommerce.cliente(id_cliente),
	data_pedido TIMESTAMPTZ,
	valor_total NUMERIC (16,4) NOT NULL,
	status TEXT NOT NULL
);

CREATE TABLE ecommerce.pagamento(
	id_pagamentos INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	id_pedido INT REFERENCES ecommerce.pedido(id_pedido),
	forma_pagamento TEXT NOT NULL,
	status TEXT NOT NULL,
	data_pagamento TIMESTAMPTZ
);

CREATE TABLE ecommerce.item_do_produto(
	id_item_do_produto INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	id_produto INT REFERENCES ecommerce.produto(id_produto),
	id_pedido INT REFERENCES ecommerce.pedido(id_pedido),
	quantidade INT NOT NULL
);