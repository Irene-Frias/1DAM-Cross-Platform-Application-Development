# 1
SELECT p.nombre, p.localidad 
FROM proveedor p 
WHERE p.cod_jefe IN (SELECT cod_jefe FROM proveedor 
					WHERE nombre = 'ERNESTO' 
                    OR nombre = 'ADOLFO');

SELECT p.nombre, p.localidad 
FROM proveedor p
WHERE p.cod_jefe = (SELECT cod_jefe FROM proveedor 
					WHERE nombre = 'ERNESTO')
   OR p.cod_jefe = (SELECT cod_jefe FROM proveedor
					WHERE nombre = 'ADOLFO');

SELECT p.nombre, p.localidad 
FROM proveedor p
WHERE p.cod_jefe = 18 
OR p.cod_jefe = 11;

# 2
SELECT DISTINCT p1.nombre, p1.localidad
FROM proveedor p1
JOIN proveedor p2 ON p1.localidad = p2.localidad
WHERE p2.cod_jefe = 11;

SELECT nombre, localidad
FROM proveedor
WHERE localidad IN (SELECT p.localidad FROM proveedor p
					WHERE p.cod_jefe = 11);


# 3
SELECT p.nombre, p.localidad
FROM proveedor p
WHERE p.cod_jefe = (SELECT p.cod_jefe FROM proveedor p
					WHERE p.nombre = 'ADOLFO')
AND p.localidad = (SELECT p.localidad FROM proveedor p
					WHERE p.codigo = 12);


# 4
SELECT a.codigo, a.denominacion, p2.codigo, p2.nombre
FROM articulo a
JOIN provart p1 ON a.codigo = p1.codigo_articulo
JOIN proveedor p2 ON p1.codigo_proveedor = p2.codigo
WHERE a.precio > (SELECT MAX(precio) FROM articulo a
				  JOIN provart p1 ON  a.codigo = p1.codigo_articulo  
				  JOIN proveedor p2 on p1.codigo_proveedor = p2.codigo 
				  WHERE nombre LIKE 'ADOLFO')
				  AND p2.nombre NOT IN ('EDUARDO','MANUEL');


# 5
SELECT AVG(precio) AS 'Media de artículos'
FROM articulo
WHERE precio < (SELECT AVG(precio) FROM articulo);

# 6
SELECT denominacion, precio, 
ROUND((precio * 0.8), 2) AS 'Rebajado un 20%'
FROM articulo;

# 7
SELECT COUNT(*) AS 'Número de proveedores'
FROM proveedor;

# 8
SELECT AVG(precio) AS 'Precio Medio sin ZODIAC'
FROM articulo
WHERE NOT denominacion LIKE 'ZODIAC';

SELECT AVG(precio) AS 'Precio Medio sin ZODIAC'
FROM (SELECT * FROM articulo 
		WHERE denominacion NOT LIKE 'ZODIAC') AS A2;
        
        