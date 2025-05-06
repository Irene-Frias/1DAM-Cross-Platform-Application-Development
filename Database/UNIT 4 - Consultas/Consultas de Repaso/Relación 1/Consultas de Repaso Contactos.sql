# 1
SELECT nivelAcademico, COUNT(desempleado) AS 'Número desempleados'
FROM contactos
WHERE desempleado = 1
GROUP BY nivelAcademico;

# 2
SELECT apellidos, nombre, FLOOR(DATEDIFF(CURRENT_DATE, STR_TO_DATE(fechaNacimiento, '%Y-%m-%d')) / 365) AS 'Edad'
FROM contactos
ORDER BY apellidos, nombre;

# 3
SELECT apellidos, nombre
FROM contactos
WHERE desempleado = 1 
AND (aficion1 LIKE 'TV%' OR aficion2 LIKE 'TV%')
ORDER BY apellidos, nombre;

# 4
SELECT COUNT(poblacion) AS 'Número de población', poblacion 
FROM contactos
GROUP BY poblacion 
HAVING poblacion >= 20
ORDER BY 'Número de población' desc, poblacion asc;

# 5
SELECT poblacion, COUNT(*) AS 'Total población'
FROM contactos
WHERE desempleado = 1
AND FLOOR(DATEDIFF(CURRENT_DATE, STR_TO_DATE(fechaNacimiento, '%Y-%m-%d')) / 365) > 25 
GROUP BY poblacion;

# 6
SELECT apellidos, nombre 
FROM contactos
WHERE sexualidad LIKE 'Heterosexual' 
AND poblacion LIKE 'Tarragona%'
AND (aficion1 LIKE 'Cine%' OR aficion1 LIKE 'Música%') 
OR (aficion2 LIKE 'Música%' OR aficion2 LIKE 'Cine%')
AND (FLOOR(DATEDIFF(CURRENT_DATE, STR_TO_DATE(fechaNacimiento, '%Y-%m-%d'))) <= 27);

# 7
SELECT AVG(FLOOR(DATEDIFF(CURRENT_DATE, STR_TO_DATE(fechaNacimiento, '%Y-%m-%d')))) AS 'Edad Media'
FROM contactos
WHERE cabello LIKE 'Calvo' 
AND sexo LIKE 'Hombre';

# 8
SELECT COUNT(*)
FROM contactos
WHERE email LIKE '%terra.es';

# 9
SELECT AVG(ingresosMensuales) AS 'Ahorros 15000 y 25000'
FROM contactos
WHERE ahorros BETWEEN 15000 AND 25000;

# 10
SELECT apellidos, nombre
FROM contactos
WHERE movil IS NOT NULL 
AND telefono IS NULL;

# 11
SELECT COUNT(*) AS 'Personas solteras'
FROM contactos
WHERE poblacion LIKE 'Madrid'
AND estadoCivil LIKE 'Solter%'
AND hijos >= 1
AND (ingresosMensuales * 12) >= 20000;

# 12
SELECT FLOOR(DATEDIFF(CURRENT_DATE, STR_TO_DATE(fechaNacimiento, '%Y-%m-%d')) / 365) AS 'Edad', 
AVG(ingresosMensuales) AS 'Ingreso Medio' 
FROM contactos 
GROUP BY Edad 
HAVING AVG(ingresosMensuales) > 1000;

