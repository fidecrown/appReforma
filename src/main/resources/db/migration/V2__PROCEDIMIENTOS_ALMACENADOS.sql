-- Function: spsmodclientes_numero_cliente()

-- DROP FUNCTION spsmodclientes_numero_cliente();

CREATE OR REPLACE FUNCTION spsmodclientes_numero_cliente()
  RETURNS TABLE(numerocliente text) AS
$BODY$
DECLARE

	_CONSECUTIVO 		INT;
	_PREFIJOSUCURSAL 	TEXT;

BEGIN

	SELECT
		COALESCE(CAST(MAX(SUBSTR(TRIM(BOTH '-' FROM NUMERO_CLIENTE),5,5)) AS INT4),0)+1
	INTO _CONSECUTIVO
	FROM CLIENTES;

	--#DESCOMENTAR PARA CONCATENAR EL PREFIJO DE LA TABLA ENTIDAD EJEMPLO : "DOL-"
	--SELECT PREFIJOCLIENTE INTO _PREFIJOSUCURSAL FROM ENTIDAD;
	--# _PREFIJOSUCURSAL||LPAD(CAST(_CONSECUTIVO AS TEXT),5,'0')

	NUMEROCLIENTE = 'SUC-'||LPAD(CAST(_CONSECUTIVO AS TEXT),5,'0');
	RETURN NEXT;

RETURN;

	/*--------------------------------------------- CREADO POR: CROWN CR --------------------------------------------*/
END;

$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100
  ROWS 1000;
ALTER FUNCTION spsmodclientes_numero_cliente()
  OWNER TO postgres;
