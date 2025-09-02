--DQL TechMarket

SELECT * FROM ecommerce.cliente;
SELECT * FROM ecommerce.produto;
SELECT * FROM ecommerce.pedido;

SELECT id_pedido, nome FROM ecommerce.pedido JOIN ecommerce.cliente ON ecommerce.pedido.id_cliente = ecommerce.cliente.id_cliente;