CREATE DATABASE IF NOT EXISTS reservaVacaciones CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci;

USE reservaVacaciones;

CREATE TABLE IF NOT EXISTS vivienda
(referencia			CHAR(9)			NOT NULL PRIMARY KEY,
direccion			VARCHAR(50)		NOT NULL,
localidad			VARCHAR(50)		NOT NULL,
provincia			VARCHAR(50)		NOT NULL,
numHabitaciones		TINYINT			NOT NULL,
numCamas			TINYINT			NOT NULL,
numAseos			TINYINT			NOT NULL,
metros				DECIMAL(12,2)	NOT NULL,
precioDia			DECIMAL(12,2)	NOT NULL,
cif_mantenimiento	CHAR(9)		NOT NULL,
dni_propietario		CHAR(9)			NOT NULL);

CREATE TABLE IF NOT EXISTS reserva
(refViv				CHAR(9)			NOT NULL,
dni_cliente			CHAR(9)			NOT NULL,
fechEntrada			DATE			NOT NULL,
fechSalida			DATE			NOT NULL,
precioTotal 		DECIMAL(6,2)	NOT NULL,
cantidadPersonas	TINYINT			NOT NULL,
CONSTRAINT PRIMARY KEY (refViv, dni_cliente, fechEntrada));

CREATE TABLE IF NOT EXISTS cliente
(dni				CHAR(9)			NOT NULL PRIMARY KEY,
nombre				VARCHAR(50)		NOT NULL,
apellidos			VARCHAR(50)		NOT NULL,
telefono			CHAR(9)			NOT NULL,
numTarjeta			CHAR(13)		NOT NULL,
fechNacimiento		DATE			NOT NULL);

CREATE TABLE IF NOT EXISTS mantenimiento
(cif				CHAR(10)		NOT NULL PRIMARY KEY,
nombre				VARCHAR(50)		NOT NULL,
responsable			VARCHAR(50)		NOT NULL,
numEmpleados		SMALLINT		NOT NULL,
razonSocial			VARCHAR(50)		NOT NULL);

CREATE TABLE IF NOT EXISTS propietario
(dni				CHAR(9)			NOT NULL PRIMARY KEY,
nombre				VARCHAR(50)		NOT NULL,
apellidos			VARCHAR(50)		NOT NULL,
numCuenta			VARCHAR(16)		NOT NULL,
beneficio			TINYINT			NOT NULL);

ALTER TABLE vivienda ADD CONSTRAINT fk_viv_man
FOREIGN KEY (cif_mantenimiento) REFERENCES mantenimiento(cif)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE vivienda ADD CONSTRAINT fk_viv_pro
FOREIGN KEY (dni_propietario) REFERENCES propietario(dni)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE reserva ADD CONSTRAINT fk_res_viv
FOREIGN KEY (refViv) REFERENCES vivienda(referencia)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE reserva ADD CONSTRAINT fk_res_clie
FOREIGN KEY (dni_cliente) REFERENCES cliente(dni)
ON UPDATE CASCADE ON DELETE CASCADE;


CREATE OR REPLACE VIEW viviendasAlmeria AS 
	SELECT * FROM vivienda 
    WHERE upper(provincia) LIKE 'ALMERÍA' OR 'ALMERIA';

ALTER TABLE propietario RENAME COLUMN numCuenta TO IBAN;

ALTER TABLE reserva ADD COLUMN fechaRes 
DATETIME 	NOT NULL	DEFAULT CURRENT_TIMESTAMP;

CREATE INDEX indx_man_nomb ON matenimiento(nombre);

CREATE USER "agente" IDENTIFIED BY "ag123";
SHOW GRANTS FOR agente;

