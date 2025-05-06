/* 
 *	Apartado A	 -	BD:	Motocicletas
*/

# 1
INSERT INTO modelo (bastidor, cilindrada, tipo, precio, fabricante) VALUES ('87GLD54KR44', '750', 'Deportiva', '15632.26', 'Suzuki');

# 2 
INSERT INTO venta (bastidor_modelo, codigo, fecha_hora, nif_cliente, nif_comercial) VALUES ('87GLD54KR44', '12', now(), '36985214G', '78945632D');
 
# 3
UPDATE venta SET precio = precio * 1.05
WHERE nif_comercial IN (SELECT nif FROM comercial
						WHERE c.nombre LIKE 'Ramiro'
                        AND c.apellidos LIKE 'Castillo');

# 4
-- BEGIN
	DELETE FROM venta 
	WHERE bastidor_modelo LIKE '87GLD54KR44';
-- COMMIT;

/* 
 *	Apartado B 	 -	BD:	Proveedores
*/

# 1
CREATE TABLE prov2 
SELECT *
FROM proveedor
WHERE cod_jefe = 0 OR cod_jefe = 11;

# 2
INSERT INTO prov2 (codigo, nombre, localidad, cod_jefe) VALUES ('19', 'SERGIO', 'MARBELLA', '11');

# 3
INSERT INTO prov2
SELECT *
FROM proveedor
WHERE cod_jefe = 18;

# 4
UPDATE prov2
SET cod_jefe = 0
WHERE nombre LIKE 'Antonio';

# 5
DELETE FROM prov2
WHERE nombre LIKE 'Ernesto';

