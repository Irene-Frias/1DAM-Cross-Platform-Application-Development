-- 1
CREATE OR REPLACE PROCEDURE actualizaPreciosFabricante (codigoFab IN VARCHAR2,
    porcentaje IN NUMBER)    
IS
BEGIN 
    UPDATE producto
    SET precio = precio + (precio * (porcentaje / 100))
    WHERE id_fab = codigoFab;
END actualizaPreciosFabricante;

CALL actualizaPreciosFabricante('rei', 10);

/* Actualiza los precios de dicho fabricante cogiendo el nombre y el 
 * porcentaje */
 
UPDATE producto
SET precio = precio + (precio * (porcentaje / 100))
WHERE id_fab = codigoFab;


-- 2 
SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE cambiaEmpleados (origen IN NUMBER, 
    destino IN NUMBER)
IS 
    vOrigen NUMBER;
    vDestino NUMBER;
BEGIN
    SELECT COUNT(*) INTO vOrigen FROM oficina WHERE oficina = origen;
    SELECT COUNT(*) INTO vDestino FROM oficina WHERE oficina = destino;
    
    IF (vOrigen = 1) AND (vDestino = 1) THEN 
        UPDATE empleado 
        SET oficina = destino 
        WHERE oficina = origen;
        DBMS_OUTPUT.PUT_LINE ('Cambio de oficina realizado con éxito');
    ELSE 
        DBMS_OUTPUT.PUT_LINE ('No es posible realizar ese cambio');        
    END IF;
END cambiaEmpleados;
    
CALL cambiaEmpleados(1, 14);
CALL cambiaEmpleados(12, 28);


-- 3
CREATE OR REPLACE PROCEDURE copiaSeguridad
IS 
BEGIN 
    EXECUTE IMMEDIATE 'CREATE TABLE clienteBackup AS (SELECT * FROM cliente)';
    EXECUTE IMMEDIATE 'CREATE TABLE empleadoBackup AS (SELECT * FROM empleado)';
    EXECUTE IMMEDIATE 'CREATE TABLE oficinaBackup AS (SELECT * FROM oficina)';
    EXECUTE IMMEDIATE 'CREATE TABLE pedidoBackup AS (SELECT * FROM pedido)';
    EXECUTE IMMEDIATE 'CREATE TABLE productoBackup AS (SELECT * FROM producto)';
END copiaSeguridad;
    
EXEC copiaSeguridad;
    
    
-- 4 
SET SERVEROUTPUT ON;

CREATE OR REPLACE FUNCTION nuevoClienteID
    RETURN NUMBER
AS
    vNextFree NUMBER;
BEGIN     
    SELECT nvl(MAX(numclie),0) INTO vNextFree FROM cliente;
   -- DBMS_OUTPUT.PUT_LINE ('El siguiente número de usuario: ' || (vNextFree + 1));      
    RETURN (vNextFree + 1);
END nuevoClienteID;

BEGIN 
    DBMS_OUTPUT.PUT_LINE ('El siguiente número de usuario: ' || nuevoClienteID); 
END;


-- 5
CREATE OR REPLACE PROCEDURE altaCliente (nomCliente IN VARCHAR2, comercial 
    IN NUMBER, limiteCredito IN NUMBER)
IS
    vEmpleado NUMBER;
BEGIN
    SELECT COUNT(*) INTO vEmpleado FROM empleado WHERE numempl = comercial;
    
    IF (vEmpleado = 1) THEN
        INSERT INTO cliente VALUES (nuevoClienteID, nomCliente, comercial, limite);
    END IF;    
END altaCliente;

CALL altaCliente ('Irene Frías', 110, 500);
CALL altaCliente ('Irene Frías', 210, 200);

