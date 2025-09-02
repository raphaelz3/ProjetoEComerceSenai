
--DML
INSERT INTO ecommerce.produto(nome_produto, preco, estoque_disponivel, imagem_url) VALUES ('mouse', 60.00, 50, 'https://bancodeimagens.techmarket.com/img/15687Gakre?inf=14587');

INSERT INTO ecommerce.produto(nome_produto, preco, estoque_disponivel, imagem_url) VALUES ('Teclado', 200.00, 60, 'https://bancodeimagens.techmarket.com/img/15687Gakre?inf=141478');

INSERT INTO ecommerce.cliente(email, senha, telefone) VALUES ('Jorge egroj','jorginho@jj.com','jshddkajJSJSHdDQ', 11987654321);

INSERT INTO ecommerce.cliente(nome, email, senha, telefone) VALUES ('fulania silva','Micon@jj.com','1561jshddkajJSJSHdDQ', 11987654158);

INSERT INTO ecommerce.pedido(id_cliente, data_pedido, valor_total, status) VALUES (1,'2025-05-08', 250.00, 'Entregue');

INSERT INTO ecommerce.pedido(id_cliente, data_pedido, valor_total, status) VALUES (2,'2025-09-01', 250.00, 'Em Preparacao');