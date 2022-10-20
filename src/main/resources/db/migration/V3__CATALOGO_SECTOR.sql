DELETE FROM catalogo_sector;

ALTER SEQUENCE catalogo_sector_sectorid_seq restart 1;

INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (1, 'AGRICULTURA', 0, 'PRIMARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (20, 'GANADERIA', 0, 'PRIMARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (21, 'SILVICULTURA', 0, 'PRIMARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (22, 'CAZA', 0, 'PRIMARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (23, 'PESCA Y ACUACULTURA', 0, 'PRIMARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (26, 'TRABAJADORES EN ACTIVIDADES DE CONTROL Y DE BENEFICIO DE PRODUCTOS AGROPECUARIOS, SILVÍCOLAS Y PESQUEROS', 0, 'PRIMARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (27, 'MINERÍA', 0, 'PRIMARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (28, 'INDUSTRIA MANUFACTURERA', 0, 'SECUNDARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (29, 'CONSTRUCCIÓN', 0, 'SECUNDARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (30, 'COMERCIO', 0, 'TERCIARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (31, 'SERVICIOS', 0, 'TERCIARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (32, 'TRANSPORTES', 0, 'TERCIARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (34, 'NO LUCRATIVAS', 1, 'NO LUCRATIVO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (40, 'AGRICULTURA', 0, 'PRIMARIO');
INSERT INTO catalogo_sector (sectorid, descripcion, nivelriesgo, sector) VALUES (41, 'POLÍTICA', 1, 'TERCIARIO');

SELECT SETVAL('catalogo_sector_sectorid_seq',(SELECT MAX(sectorid) FROM catalogo_sector));
