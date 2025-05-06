-- Table structure for table cliente

DROP TABLE cliente CASCADE CONSTRAINTS;

CREATE TABLE cliente (
  numclie           NUMBER NOT NULL,
  nombre            VARCHAR2(50) NOT NULL,
  repclie           NUMBER NULL,
  limite_credito    NUMBER(19,4) NOT NULL,
  PRIMARY KEY (numclie)
);


-- Dumping data for table cliente

INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2101, 'Luis García Antón', 106, 65000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2102, 'Álvaro Rodríguez', 101, 65000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2103, 'Jaime Llorens', 105, 50000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2105, 'Antonio Canales', 101, 45000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2106, 'Juan Suárez', 102, 65000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2107, 'Julián López', 110, 35000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2108, 'Julia Antequera', 109, 55000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2109, 'Alberto Juanes', 103, 25000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2111, 'Cristóbal García', 103, 50000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2112, 'María Silva', 108, 50000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2113, 'Luisa Marón', 104, 20000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2114, 'Cristina Bulini', 102, 20000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2115, 'Vicente Martínez', 101, 20000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2117, 'Carlos Tena', 106, 35000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2118, 'Junípero Álvarez', 108, 60000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2119, 'Salomón Bueno', 109, 25000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2120, 'Juan Malo', 102, 50000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2121, 'Vicente Ríos', 103, 45000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2122, 'José Marchante', 105, 30000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2123, 'José Libros', 102, 40000);
INSERT INTO cliente (numclie, nombre, repclie, limite_credito) VALUES (2124, 'Juan Bolto', 107, 40000);


-- Table structure for table empleado

DROP TABLE empleado CASCADE CONSTRAINTS;

CREATE TABLE empleado (
  numempl       NUMBER NOT NULL,
  nombre        VARCHAR2(30) NOT NULL,
  edad          NUMBER NOT NULL,
  oficina       NUMBER NULL,
  titulo        VARCHAR2(25) NOT NULL,
  contrato      DATE NOT NULL,
  jefe          NUMBER NULL,
  cuota         NUMBER NULL,
  ventas        NUMBER NOT NULL,
  PRIMARY KEY (numempl)
);


-- Dumping data for table empleado

INSERT INTO empleado VALUES (101, 'Antonio Viguer', 45, 12, 'Representante', TO_DATE('2006-10-20', 'YYYY-MM-DD'), 104, 300000, 305000);
INSERT INTO empleado VALUES (102, 'Álvaro Jaumes', 48, 21, 'Representante', TO_DATE('2006-12-10', 'YYYY-MM-DD'), 108, 350000, 474000);
INSERT INTO empleado VALUES (103, 'Juan Rovira', 29, 12, 'Representante', TO_DATE('2007-03-01', 'YYYY-MM-DD'), 104, 275000, 286000);
INSERT INTO empleado VALUES (104, 'José González', 33, 12, 'Dir Ventas', TO_DATE('2007-05-19', 'YYYY-MM-DD'), 106, 200000, 143000);
INSERT INTO empleado VALUES (105, 'Vicente Pantall', 37, 13, 'Representante', TO_DATE('2008-01-12', 'YYYY-MM-DD'), 104, 350000, 368000);
INSERT INTO empleado VALUES (106, 'Luis Antonio', 52, 11, 'Dir General', TO_DATE('2008-06-14', 'YYYY-MM-DD'), NULL, 275000, 299000);
INSERT INTO empleado VALUES (107, 'Jorge Gutiérrez', 49, 22, 'Representante', TO_DATE('2008-11-14', 'YYYY-MM-DD'), 108, 300000, 186000);
INSERT INTO empleado VALUES (108, 'Ana Bustamante', 62, 21, 'Dir Ventas', TO_DATE('2009-10-12', 'YYYY-MM-DD'), 106, 350000, 361000);
INSERT INTO empleado VALUES (109, 'María Sunta', 31, 11, 'Representante', TO_DATE('2016-10-12', 'YYYY-MM-DD'), 106, 300000, 392000);
INSERT INTO empleado VALUES (110, 'Juan Victor', 41, NULL, 'Representante', TO_DATE('2010-01-13', 'YYYY-MM-DD'), 104, NULL, 760000);


-- Table structure for table oficina

DROP TABLE oficina CASCADE CONSTRAINTS;

CREATE TABLE oficina (
  oficina   NUMBER NOT NULL,
  ciudad    VARCHAR2(30) NOT NULL,
  region    VARCHAR2(30) NOT NULL,
  dir       NUMBER NULL,
  objetivo  NUMBER NOT NULL,
  ventas    NUMBER NULL,
  PRIMARY KEY (oficina)
);


-- Dumping data for table oficina

INSERT INTO oficina (oficina, ciudad, region, dir, objetivo, ventas) VALUES (11, 'Valencia', 'Este', 106, 575000, 693000);
INSERT INTO oficina (oficina, ciudad, region, dir, objetivo, ventas) VALUES (12, 'Alicante', 'Este', 104, 800000, 735000);
INSERT INTO oficina (oficina, ciudad, region, dir, objetivo, ventas) VALUES (13, 'Castellón', 'Este', 105, 350000, 368000);
INSERT INTO oficina (oficina, ciudad, region, dir, objetivo, ventas) VALUES (21, 'Badajoz', 'Oeste', 108, 725000, 836000);
INSERT INTO oficina (oficina, ciudad, region, dir, objetivo, ventas) VALUES (22, 'A Coruña', 'Oeste', 108, 300000, 186000);
INSERT INTO oficina (oficina, ciudad, region, dir, objetivo, ventas) VALUES (23, 'Madrid', 'Centro', 108, 0, 0);
INSERT INTO oficina (oficina, ciudad, region, dir, objetivo, ventas) VALUES (24, 'Madrid', 'Centro', 108, 250000, 150000);
INSERT INTO oficina (oficina, ciudad, region, dir, objetivo, ventas) VALUES (26, 'Pamplona', 'Norte', NULL, 0, NULL);
INSERT INTO oficina (oficina, ciudad, region, dir, objetivo, ventas) VALUES (28, 'Valencia', 'Este', NULL, 900000, NULL);


-- Table structure for table pedido

DROP TABLE pedido CASCADE CONSTRAINTS;

CREATE TABLE pedido (
  codigo        NUMBER NOT NULL,
  num_pedido    NUMBER NOT NULL,
  fecha_pedido  DATE NOT NULL,
  cliente       NUMBER NOT NULL,
  rep           NUMBER NOT NULL,
  fab           VARCHAR2(5) NOT NULL,
  producto      VARCHAR2(50) NOT NULL,
  cantidad      NUMBER NOT NULL,
  importe       NUMBER(19,4) NOT NULL,
  PRIMARY KEY (codigo)
);


-- Dumping data for table 'pedido'

INSERT INTO pedido VALUES (1, 110036, TO_DATE('2016-01-02', 'YYYY-MM-DD'), 2107, 110, 'aci', '4100z', 9, 22500);
INSERT INTO pedido VALUES (2, 110036, TO_DATE('2016-01-02', 'YYYY-MM-DD'), 2117, 106, 'rei', '2a44l', 7, 31500);
INSERT INTO pedido VALUES (3, 112963, TO_DATE('2016-05-10', 'YYYY-MM-DD'), 2103, 105, 'aci', '41004', 28, 3276);
INSERT INTO pedido VALUES (4, 112968, TO_DATE('2010-01-11', 'YYYY-MM-DD'), 2102, 101, 'aci', '41004', 34, 3978);
INSERT INTO pedido VALUES (5, 112975, TO_DATE('2016-02-11', 'YYYY-MM-DD'), 2111, 103, 'rei', '2a44g', 6, 2100);
INSERT INTO pedido VALUES (6, 112979, TO_DATE('2009-10-12', 'YYYY-MM-DD'), 2114, 108, 'aci', '4100z', 6, 15000);
INSERT INTO pedido VALUES (7, 112983, TO_DATE('2016-05-10', 'YYYY-MM-DD'), 2103, 105, 'aci', '41004', 6, 702);
INSERT INTO pedido VALUES (8, 112987, TO_DATE('2016-01-01', 'YYYY-MM-DD'), 2103, 105, 'aci', '4100y', 11, 27500);
INSERT INTO pedido VALUES (9, 112989, TO_DATE('2016-12-10', 'YYYY-MM-DD'), 2101, 106, 'fea', '114', 6, 1458);
INSERT INTO pedido VALUES (10, 112992, TO_DATE('2010-04-15', 'YYYY-MM-DD'), 2118, 108, 'aci', '41002', 10, 760);
INSERT INTO pedido VALUES (11, 112993, TO_DATE('2016-03-10', 'YYYY-MM-DD'), 2106, 102, 'rei', '2a45c', 24, 1896);
INSERT INTO pedido VALUES (12, 112997, TO_DATE('2016-04-04', 'YYYY-MM-DD'), 2124, 107, 'bic', '41003', 1, 652);
INSERT INTO pedido VALUES (13, 113003, TO_DATE('2016-02-05', 'YYYY-MM-DD'), 2108, 109, 'imm', '779', 3, 5625);
INSERT INTO pedido VALUES (14, 113007, TO_DATE('2016-01-01', 'YYYY-MM-DD'), 2112, 108, 'imm', '773c', 3, 2925);
INSERT INTO pedido VALUES (15, 113012, TO_DATE('2016-05-05', 'YYYY-MM-DD'), 2111, 105, 'aci', '41003', 35, 3745);
INSERT INTO pedido VALUES (16, 113013, TO_DATE('2016-08-06', 'YYYY-MM-DD'), 2118, 108, 'bic', '41003', 1, 652);
INSERT INTO pedido VALUES (17, 113024, TO_DATE('2016-07-04', 'YYYY-MM-DD'), 2114, 108, 'qsa', 'xk47', 20, 7100);
INSERT INTO pedido VALUES (18, 113027, TO_DATE('2016-02-05', 'YYYY-MM-DD'), 2103, 105, 'aci', '41002', 54, 4104);
INSERT INTO pedido VALUES (19, 113034, TO_DATE('2016-11-05', 'YYYY-MM-DD'), 2107, 110, 'rei', '2a45c', 8, 632);
INSERT INTO pedido VALUES (20, 113042, TO_DATE('2016-01-01', 'YYYY-MM-DD'), 2113, 101, 'rei', '2a44r', 5, 22500);
INSERT INTO pedido VALUES (21, 113045, TO_DATE('2016-07-02', 'YYYY-MM-DD'), 2112, 108, 'rei', '2a44r', 10, 45000);
INSERT INTO pedido VALUES (22, 113048, TO_DATE('2016-02-02', 'YYYY-MM-DD'), 2120, 102, 'imm', '779', 2, 3750);
INSERT INTO pedido VALUES (23, 113049, TO_DATE('2016-04-04', 'YYYY-MM-DD'), 2118, 108, 'qsa', 'xk47', 2, 776);
INSERT INTO pedido VALUES (24, 113051, TO_DATE('2016-07-06', 'YYYY-MM-DD'), 2118, 108, 'qsa', 'xk47', 4, 1420);
INSERT INTO pedido VALUES (25, 113055, TO_DATE('2010-04-01', 'YYYY-MM-DD'), 2108, 101, 'aci', '4100x', 6, 150);
INSERT INTO pedido VALUES (26, 113057, TO_DATE('2016-11-01', 'YYYY-MM-DD'), 2111, 103, 'aci', '4100x', 24, 600);
INSERT INTO pedido VALUES (27, 113058, TO_DATE('2009-07-04', 'YYYY-MM-DD'), 2108, 109, 'fea', '112', 10, 1480);
INSERT INTO pedido VALUES (28, 113062, TO_DATE('2016-07-04', 'YYYY-MM-DD'), 2124, 107, 'bic', '41003', 10, 2430);
INSERT INTO pedido VALUES (29, 113065, TO_DATE('2016-06-03', 'YYYY-MM-DD'), 2106, 102, 'qsa', 'xk47', 6, 2130);
INSERT INTO pedido VALUES (30, 113069, TO_DATE('2016-08-01', 'YYYY-MM-DD'), 2109, 107, 'imm', '773c', 22, 31350);


-- Table structure for table producto

DROP TABLE producto CASCADE CONSTRAINTS;

CREATE TABLE producto (
  id_fab        VARCHAR2(5) NOT NULL,
  id_producto   VARCHAR2(50) NOT NULL,
  descripcion   VARCHAR2(50) NOT NULL,
  precio        NUMBER(19,4) NOT NULL,
  existencias   NUMBER NOT NULL,
  PRIMARY KEY (id_fab, id_producto)
);


-- Dumping data for table 'producto'

INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('aci', '41001', 'arandela', 58, 277);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('aci', '41002', 'bisagra', 80, 167);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('aci', '41003', 'art t3', 112, 207);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('aci', '41004', 'art 14', 123, 139);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('aci', '4100x', 'junta', 26, 37);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('aci', '4100y', 'extractor', 2888, 25);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('aci', '4100z', 'mont', 2625, 28);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('bic', '41003', 'manivela', 652, 3);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('bic', '41089', 'rodamiento', 225, 78);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('bic', '41672', 'plato', 180, 0);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('fea', '112', 'cubo', 148, 115);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('fea', '114', 'cubo', 243, 15);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('imm', '773c', 'reostato', 975, 28);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('imm', '775', 'reostato 2', 1425, 5);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('imm', '779', 'reostato 3', 1875, 0);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('imm', '887h', 'caja clavos', 54, 223);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('imm', '887p', 'perno', 25, 24);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('imm', '887x', 'manivela', 475, 32);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('qsa', 'xk47', 'red', 355, 38);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('qsa', 'xk48', 'red', 134, 203);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('qsa', 'xk48a', 'red', 117, 37);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('rei', '2a44g', 'pas', 350, 14);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('rei', '2a44l', 'bomba l', 4500, 12);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('rei', '2a44r', 'bomba r', 4500, 12);
INSERT INTO producto (id_fab, id_producto, descripcion, precio, existencias) VALUES ('rei', '2a45c', 'junta', 79, 210);

-- Foreign Keys

ALTER TABLE cliente ADD CONSTRAINT fk_cliente_repclie FOREIGN KEY (repclie) REFERENCES empleado(numempl);

ALTER TABLE empleado ADD CONSTRAINT fk_empleado_oficina FOREIGN KEY (oficina) REFERENCES oficina(oficina);

ALTER TABLE pedido ADD CONSTRAINT fk_pedido_cliente FOREIGN KEY (cliente) REFERENCES cliente(numclie);

ALTER TABLE pedido ADD CONSTRAINT fk_pedido_rep FOREIGN KEY (rep) REFERENCES empleado(numempl);

ALTER TABLE pedido ADD CONSTRAINT fk_pedido_fab_producto FOREIGN KEY (fab,producto) REFERENCES producto(id_fab, id_producto);

ALTER TABLE oficina ADD CONSTRAINT fk_oficina_dir FOREIGN KEY (dir) REFERENCES empleado(numempl);

CREATE INDEX idx_cliente_nombre ON cliente(nombre);

CREATE INDEX idx_empleado_nombre ON empleado(nombre);

CREATE INDEX idx_oficina_ciudad ON oficina(ciudad);

CREATE INDEX idx_pedido_num ON pedido(num_pedido);

CREATE INDEX idx_pedido_cliente ON pedido(cliente);

