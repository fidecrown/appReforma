DELETE FROM catalogo_clientes;

ALTER SEQUENCE catalogo_clientes_catalogoclienteid_seq restart 1;

INSERT INTO catalogo_clientes (catalogoclienteid, descripcion) VALUES (3, 'SOCIO INTERNO');
INSERT INTO catalogo_clientes (catalogoclienteid, descripcion) VALUES (5, 'PROCAMPO');
INSERT INTO catalogo_clientes (catalogoclienteid, descripcion) VALUES (1, 'Socio Menor');
INSERT INTO catalogo_clientes (catalogoclienteid, descripcion) VALUES (4, 'Socio Moral');
INSERT INTO catalogo_clientes (catalogoclienteid, descripcion) VALUES (2, 'Socio Mayor');
INSERT INTO catalogo_clientes (catalogoclienteid, descripcion) VALUES (6, 'Cliente');

SELECT SETVAL('catalogo_clientes_catalogoclienteid_seq',(SELECT MAX(catalogoclienteid) FROM catalogo_clientes));