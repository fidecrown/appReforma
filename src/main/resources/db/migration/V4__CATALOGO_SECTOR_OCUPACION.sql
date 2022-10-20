DELETE FROM catalogo_sector_ocupacion;

ALTER SEQUENCE catalogo_sector_ocupacion_sector_ocupacionid_seq restart 1;

INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (1, 1, 'TRABAJADORES EN ACTIVIDADES AGRÍCOLAS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (2, 20, 'TRABAJADORES EN ACTIVIDADES GANADERAS Y EN LA CRÍA DE OTROS ANIMALES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (4, 21, 'TRABAJADORES EN ACTIVIDADES SILVÍCOLAS Y FORESTALES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (5, 22, 'TRABAJADORES EN ACTIVIDADES DE CAZA, TRAMPERÍA Y SIMILARES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (6, 23, 'TRABAJADORES EN ACTIVIDADES PESQUERAS Y DE ACUACULTURA');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (7, 26, 'TRABAJADORES EN ACTIVIDADES DE BENEFICIO DE PRODUCTOS AGROPECUARIOS Y PESQUEROS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (8, 26, 'TRABAJADORES DE CONTROL DE LAS ACTIVIDADES AGROPECUARIAS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (9, 26, 'TRABAJADORES DE CONTROL DE LAS ACTIVIDADES SILVÍCOLAS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (10, 26, 'TRABAJADORES DE CONTROL DE LAS ACTIVIDADES PESQUERAS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (11, 27, 'JEFES, SUPERVISORES Y SIMILARES EN LA EXTRACCIÓN EN MINAS, CANTERAS Y POZOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (12, 27, 'TRABAJADORES EN MINAS Y CANTERAS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (13, 27, 'OPERADORES DE MÁQUINAS Y EQUIPOS PARA LA EXTRACCIÓN EN MINAS, CANTERAS Y POZOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (14, 27, 'AYUDANTES, PEONES Y SIMILARES EN LA EXTRACIÓN DE MINAS, CANTERA Y POZOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (15, 28, 'JEFES, SUPERVISORES Y OTROS TRABAJADORES DE CONTROL EN LA FABRICACIÓN DE PRODUCTOS DE CERÁMICA, VIDRIO Y OTROS MINERALES NO METÁLICOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (16, 28, 'ARTESANOS Y TRABAJADORES FABRICACIÓN DE PRODUCTOS DE CERÁMICA, VIDRIO Y OTROS MINERALES NO METÁLICOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (17, 28, 'OPERADORES DE MÁQUINAS Y EQUIPOS EN LA FABRICACIÓN DE PRODUCTOS DE CERÁMICA, VIDRIO Y OTROS MINERALES NO METÁLICOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (18, 28, 'AYUDANTES, PEONES O SIMILARES EN LA FABRICACIÓN DE PRODUCTOS DE CERÁMICA, VIDRIO Y OTROS MINERALES NO METÁLICOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (19, 28, 'JEFES, SUPERVISORES Y OTROS TRABAJADORES DE CONTROL EN LA FABRICACIÓN INDUSTRIAL');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (20, 28, 'TRABAJADORES EN LA FABRICACIÓN INDUSTRIAL');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (21, 28, 'OPERADORES EN LA FABRICACIÓN INDUSTRIAL');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (22, 28, 'AYUDANTES, PEONES O SIMILARES EN LA FABRICACIÓN INDUSTRIAL');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (23, 28, 'JEFES, SUPERVISORES Y OTROS TRABAJADORES DE CONTROL EN ACTIVIDADES DE REPARACIÓN Y MANTENIMIENTO');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (24, 28, 'TRABAJADORES EN ACTIVIDADES DE REPARACIÓN Y MANTENIMIENTO');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (25, 28, 'JEFES, SUPERVISORES Y OTROS TRABAJADORES EN LA FABRICACIÓN DE QUÍMICOS, PETROQUÍMICA, HULE, CAUCHO Y PLÁSTICO');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (26, 28, 'TRABAJADORES EN LA FABRICACIÓN DE QUÍMICOS, PETROQUÍMICA, HULE, CAUCHO, PLÁSTICO');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (27, 28, 'OPERADORES DE MÁQUINAS Y EQUIPOS EN LA FABRICACIÓN DE QUÍMICOS , TRATAMIENTO DE AGUA, PETROQUÍMICA, HULE Y PLÁSTICO');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (28, 28, 'AYUDANTES, PEONES O SIMILARES EN LA FABRICACIÓN DE QUÍMICOS, PETROQUÍMICA, HULE, CAUCHO Y PLÁSTICO');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (29, 29, 'JEFES, SUPERVISORES Y OTROS TRABAJADORES EN LA CONSTRUCCIÓN RESIDENCIAL Y NO RESIDENCIAL');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (30, 29, 'JEFES, SUPERVISORES Y OTROS TRABAJADORES EN CONSTRUCCIONES PARA EL SECTOR PÚBLICO');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (31, 29, 'TRABAJADORES EN LA CONSTRUCCIÓN');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (32, 29, 'OPERADORES DE EQUIPO PORTATIL ESPECIALIZADO PARA LA CONSTRUCCIÓN (PERFORADORA, BARRENADORA, COMPRESORA, ETC.)');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (33, 29, 'AYUDANTES, PEONES Y SIMILARES EN LA CONSTRUCCIÓN');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (34, 29, 'JEFES, SUPERVISORES Y OTROS TRABAJADORES EN INSTALACIONES ESPECIALES PARA EL FUNCIONAMIENTO DE INMUEBLES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (35, 29, 'TRABAJADORES EN LA INSTALACIONES ESPECIALES PARA EL FUNCIONAMIENTO DE INMUEBLES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (36, 29, 'JEFES, SUPERVISORES Y OTROS TRABAJADORES EN MANTENIMIENTO Y ACABADOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (37, 29, 'TRABAJADORES EN MANTENIMIENTO Y ACABADOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (38, 29, 'JEFES, SUPERVISORES Y OTROS TRABAJADORES EN LA GENERACIÓN DE ENERGÍA ELÉCTRICA');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (39, 29, 'OPERADORES DE MÁQUINAS E INSTALACIONES PARA LA GENERACIÓN DE ENERGÍA Y EQUIPOS DE BOMBEO Y REFRIGERACIÓN');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (40, 29, 'AYUDANTES, PEONES Y SIMILARES EN LA GENERACIÓN DE ENERGÍA');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (41, 29, 'JEFES, SUPERVISORES Y OTROS TRABAJADORES EN LA INSTALACIÓN, REPARACIÓN Y MANTENIMIENTO DE EQUIPO ELÉCTRICO');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (42, 29, 'TRABAJADORES EN LA INSTALACIÓN Y REPARACIÓN DE EQUIPOS ELÉCTRICOS Y ELECTRÓNICOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (43, 29, 'JEFES, SUPERVISORES Y OTROS TRABAJADORES EN LA INSTALACIÓN, REPARACIÓN Y MANTENIMIENTO DE TELECOMUNICACIONES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (44, 29, 'TRABAJADORES EN LA INSTALACIÓN, REPARACIÓN Y MANTENIMIENTO DE TELECOMUNICACIONES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (46, 30, 'COMERCIANTES, EMPLEADOS DE COMERCIO Y AGENTE DE VENTAS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (47, 30, 'VENDEDORES AMBULANTES Y TRABAJADORES AMBULANTES EN SERVICIOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (48, 31, 'PROFESIONISTAS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (49, 31, 'TÉCNICOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (50, 31, 'TRABAJADORES DE LA EDUCACIÓN');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (51, 31, 'TRABAJADORES DEL ARTE, ESPECTÁCULOS Y DEPORTES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (52, 31, 'FUNCIONARIOS Y DIRECTIVOS EN ACTIVIDADES ADMINISTRATIVAS Y DE SERVICIOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (53, 31, 'JEFES DE DEPARTAMENTO, COORDINADORES Y SUPERVISORES EN ACTIVIDADES ADMINISTRATIVAS Y DE SERVICIOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (54, 31, 'TRABAJADORES DE APOYO EN ACTIVIDADES ADMINISTRATIVAS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (55, 31, 'TRABAJADORES EN SERVICIOS PERSONALES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (56, 31, 'TRABAJADORES EN SERVICIOS DE ALQUILER DE BIENES MUEBLES (AUTOS, VAJILLAS, MESAS, LONAS, ETC.)');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (57, 31, 'TRABAJADORES DE APOYO PARA LA REALIZACIÓN DE ESPECTÁCULOS, TURISMO, DEPORTES, Y EN CUIDADOS PERSONALES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (58, 31, 'TRABAJADORES EN SERVICIOS DOMÉSTICOS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (59, 31, 'TRABAJADORES EN SERVICIOS DE PROTECCIÓN Y VIGILANCIA Y FUERZAS ARMADAS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (60, 32, 'CONDUCTORES DE MAQUINARIA MÓVIL');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (61, 32, 'CONDUCTORES DE TRANSPORTE EN VÍAS FÉRREAS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (62, 32, 'AYUDANTES DE CONDUCTORES DE TRANSPORTE EN VÍAS FÉRREAS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (63, 32, 'CONDUCTORES DE TRANSPORTE TERRESTRE CON MOTOR');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (64, 32, 'AYUDANTES DE CONDUCTORES DE TRANSPORTE TERRESTRE CON MOTOR');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (65, 32, 'CONDUCTORES DE TRANSPORTE AÉREO');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (66, 32, 'CONDUCTORES Y AYUDANTES DE CONDUCTORES DE TRANSPORTE MARÍTIMO');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (67, 32, 'CONDUCTORES DE VEHÍCULOS DE TRANSPORTE DE TRACCIÓN HUMANA Y ANIMAL');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (69, 34, 'NO LUCRATIVAS');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (70, 41, 'SECRETARIA DE AGRICULTURA, GANADERIA, DESARROLLO RURAL, PESCA Y ALIMENTACION');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (71, 41, 'SECRETARÍA DE COMUNICACIONES Y TRANSPORTES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (72, 41, 'SECRETARÍA DE DESARROLLO SOCIAL');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (73, 41, 'SECRETARÍA DE ECONOMÍA');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (74, 41, 'SECRETARÍA DE EDUCACIÓN PÚBLICA');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (75, 41, 'SECRETARÍA DE ENERGÍA');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (76, 41, 'SECRETARÍA DE GOBERNACIÓN');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (77, 41, 'SECRETARÍA DE HACIENDA Y CRÉDITO PÚBLICO');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (78, 41, 'SECRETARÍA DE LA DEFENSA NACIONAL');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (79, 41, 'SECRETARÍA DE LA FUNCIÓN PÚBLICA');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (81, 41, 'SECRETARÍA DE LA REFORMA AGRARIA');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (82, 41, 'SECRETARÍA DE MARINA');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (83, 41, 'SECRETARÍA DE MEDIO AMBIENTE Y RECURSOS NATURALES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (84, 41, 'SECRETARÍA DE RELACIONES EXTERIORES');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (85, 41, 'SECRETARÍA DE SALUD');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (86, 41, 'SECRETARÍA DE SEGURIDAD PÚBLICA');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (87, 41, 'SECRETARÍA DE TURISMO');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (88, 41, 'SECRETARÍA DEL TRABAJO Y PREVISIÓN SOCIAL');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (89, 41, 'PROCURADURÍA GENERAL DE LA REPÚBLICA');
INSERT INTO catalogo_sector_ocupacion (sector_ocupacionid, sectorid, descripcion) VALUES (90, 1, 'TRABAJADORES QUE COMBINAN ACTIVIDADES AGRÍCOLAS CON GANADERAS');


SELECT SETVAL('catalogo_sector_ocupacion_sector_ocupacionid_seq',(SELECT MAX(sector_ocupacionid) FROM catalogo_sector_ocupacion));
