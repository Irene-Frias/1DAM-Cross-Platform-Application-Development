CREATE DATABASE IF NOT EXISTS turismo CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci;

USE turismo;

CREATE TABLE IF NOT EXISTS lugares
(referencia		CHAR(100)		NOT NULL	PRIMARY KEY,
nombre			VARCHAR(50)		NOT NULL,
descripcion		VARCHAR(100)	NOT NULL,
curiosidades	VARCHAR(100)	NOT NULL,
codigoRuta		CHAR(50)		NOT NULL);

CREATE TABLE IF NOT EXISTS rutas
(codigo				CHAR(100)		NOT NULL	PRIMARY KEY,
nombre				VARCHAR(50)		NOT NULL,
distancia			DECIMAL(12,3)	NOT NULL,
categoria			VARCHAR(100)	NOT NULL,
recomendaciones		VARCHAR(50)		NOT NULL,
valoracion			DECIMAL(3,1)	NOT NULL,
nif_guia			CHAR(9)			NOT NULL);

CREATE TABLE IF NOT EXISTS guias
(nif				CHAR(9)			NOT NULL	PRIMARY KEY,
nombre				VARCHAR(50)		NOT NULL,
apellidos			VARCHAR(100)	NOT NULL,
fechNacimiento		DATE 			NOT NULL,
nacionalidad 		VARCHAR(50)		DEFAULT 'España',
fechAlta			DATE 			NOT NULL,
salario				DECIMAL(13,2)	NOT NULL,
titulacion			VARCHAR(50)		NOT NULL);

ALTER TABLE lugares ADD CONSTRAINT fk_lug_cog
FOREIGN KEY (codigoRuta) REFERENCES rutas(codigo)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE lugares ADD CONSTRAINT fk_lug_nif
FOREIGN KEY (codigoRuta) REFERENCES guias(nif)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE rutas ADD CONSTRAINT check_rut_dis
CHECK (distacia < 100 AND distancia > 5000);

ALTER TABLE guias DROP COLUMN apellidos;

ALTER TABLE guias ADD COLUMN apellido1
VARCHAR(50)		NOT NULL; 

ALTER TABLE guias ADD COLUMN apellido2
VARCHAR(50)		NOT NULL;

ALTER TABLE rutas ADD CONSTRAINT check_rut_val
CHECK (valoracion BETWEEN 0 AND 10);

ALTER TABLE guias ADD CONSTRAINT check_gui_fech
CHECK (fechAlta >= fechNacimiento);

ALTER TABLE rutas DROP CHECK check_rut_dis;

CREATE INDEX indx_lug_nom ON lugares(nombre);

ALTER TABLE guias RENAME COLUMN salario TO sueldo;

ALTER TABLE guias RENAME TO empleados;

DROP TABLE lugares;

