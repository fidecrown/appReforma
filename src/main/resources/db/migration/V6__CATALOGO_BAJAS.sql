DELETE FROM catalogo_bajas;

ALTER SEQUENCE catalogo_bajas_bajaid_seq restart 1;

INSERT INTO catalogo_bajas (bajaid, descripcion) VALUES (1, 'No se autorizo crédito');
INSERT INTO catalogo_bajas (bajaid, descripcion) VALUES (2, 'No Encontro firma de aval');
INSERT INTO catalogo_bajas (bajaid, descripcion) VALUES (3, 'El Dinero no Es del Socio');
INSERT INTO catalogo_bajas (bajaid, descripcion) VALUES (4, 'Cambio de Ciudad');
INSERT INTO catalogo_bajas (bajaid, descripcion) VALUES (5, 'No puede seguir ahorrando');
INSERT INTO catalogo_bajas (bajaid, descripcion) VALUES (6, 'Cancela para Liquidar Pmo.');
INSERT INTO catalogo_bajas (bajaid, descripcion) VALUES (7, 'Fallecio el Socio');
INSERT INTO catalogo_bajas (bajaid, descripcion) VALUES (8, 'BAJAS DE COBRANZA');
INSERT INTO catalogo_bajas (bajaid, descripcion) VALUES (9, 'Cambio la cta a socio mayor');
INSERT INTO catalogo_bajas (bajaid, descripcion) VALUES (10, 'YA EXISTIA EL SOCIO');
INSERT INTO catalogo_bajas (bajaid, descripcion) VALUES (11, 'Socio Moroso');
INSERT INTO catalogo_bajas (bajaid, descripcion) VALUES (12, 'Cuentas sin Movimiento');

SELECT SETVAL('catalogo_bajas_bajaid_seq',(SELECT MAX(bajaid) FROM catalogo_bajas));
