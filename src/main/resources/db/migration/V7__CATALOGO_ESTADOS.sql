DELETE FROM catalogo_estados;

ALTER SEQUENCE catalogo_estados_estadoid_seq restart 1;

INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (1, 'AGUASCALIENTES', 'AS');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (2, 'BAJA CALIFORNIA', 'BC');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (3, 'BAJA CALIFORNIA SUR', 'BS');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (4, 'CAMPECHE', 'CC');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (5, 'COAHUILA DE ZARAGOZA', 'CL');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (6, 'COLIMA', 'CM');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (7, 'CHIAPAS', 'CS');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (8, 'CHIHUAHUA', 'CH');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (9, 'DISTRITO FEDERAL', 'DF');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (10, 'DURANGO', 'DG');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (11, 'GUANAJUATO', 'GT');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (12, 'GUERRERO', 'GR');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (13, 'HIDALGO', 'HG');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (14, 'JALISCO', 'JC');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (15, 'MÉXICO', 'MC');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (16, 'MICHOACÁN DE OCAMPO', 'MN');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (17, 'MORELOS', 'MS');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (18, 'NAYARIT', 'NT');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (19, 'NUEVO LEÓN', 'NL');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (20, 'OAXACA', 'OC');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (21, 'PUEBLA', 'PL');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (22, 'QUERÉTARO DE ARTEAGA', 'QT');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (23, 'QUINTANA ROO', 'QR');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (24, 'SAN LUÍS POTOSÍ', 'SP');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (25, 'SINALOA', 'SL');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (26, 'SONORA', 'SR');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (27, 'TABASCO', 'TC');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (28, 'TAMAULIPAS', 'TS');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (29, 'TLAXCALA', 'TL');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (30, 'VERACRUZ', 'VZ');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (31, 'YUCATÁN', 'YN');
INSERT INTO catalogo_estados (estadoid, nombreestado, claveestado) VALUES (32, 'ZACATECAS', 'ZS');

SELECT SETVAL('catalogo_estados_estadoid_seq',(SELECT MAX(estadoid) FROM catalogo_estados));
