CREATE DATABASE Fisioterapia;
USE Fisioterapia;

-- Tabla de Profesionales
CREATE TABLE Profesionales (
    numero_trabajador INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    apellidos VARCHAR(100),
    telefono VARCHAR(15),
    especialidad VARCHAR(50)
);

-- Tabla de Fisioterapeutas (hereda de Profesionales)
CREATE TABLE Fisioterapeutas (
    numero_trabajador_fisio INT PRIMARY KEY,
    estado ENUM('Trabajando', 'De baja', 'Suspendido'),
    hora_inicio TIME,
    hora_fin TIME,
    FOREIGN KEY (numero_trabajador_fisio) REFERENCES Profesionales(numero_trabajador)
);

-- Tabla de Pacientes
CREATE TABLE Pacientes (
    id_paciente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    apellidos VARCHAR(100),
    telefono VARCHAR(15),
    fecha_nacimiento DATE
);

-- Tabla de Citas
CREATE TABLE Citas (
    id_cita INT PRIMARY KEY AUTO_INCREMENT,
    id_paciente INT,
    numero_trabajador_fisio INT,
    fecha DATE,
    hora TIME,
    duracion INT CHECK (duracion <= 120),  -- Máximo 120 minutos por cita
    FOREIGN KEY (id_paciente) REFERENCES Pacientes(id_paciente),
    FOREIGN KEY (numero_trabajador_fisio) REFERENCES Fisioterapeutas(numero_trabajador_fisio)
);

-- Tabla de Pagos
CREATE TABLE Pagos (
    id_pago INT PRIMARY KEY AUTO_INCREMENT,
    id_paciente INT,
    monto DECIMAL(10,2),
    fecha_pago DATE,
    metodo_pago ENUM('Efectivo', 'Tarjeta', 'Transferencia'),
    FOREIGN KEY (id_paciente) REFERENCES Pacientes(id_paciente)
);

-- Profesionales
INSERT INTO Profesionales (nombre, apellidos, telefono, especialidad) VALUES
('Carlos', 'Fernández López', '600123456', 'Fisioterapia deportiva'),
('María', 'Gómez Sánchez', '611987654', 'Rehabilitación neurológica'),
('José', 'Martínez Pérez', '622456789', 'Terapia manual'),
('Laura', 'Hernández Ruiz', '633654321', 'Osteopatía'),
('Ana', 'Rodríguez Díaz', '644321987', 'Fisioterapia geriátrica');

-- Fisioterapeutas (asociados a los profesionales)
INSERT INTO Fisioterapeutas (numero_trabajador_fisio, estado, hora_inicio, hora_fin) VALUES
(1, 'Trabajando', '08:00:00', '14:00:00'),
(2, 'Trabajando', '09:00:00', '15:00:00'),
(3, 'De baja', '10:00:00', '16:00:00'),
(4, 'Trabajando', '11:00:00', '17:00:00'),
(5, 'Suspendido', '12:00:00', '18:00:00');

-- Pacientes
INSERT INTO Pacientes (nombre, apellidos, telefono, fecha_nacimiento) VALUES
('Pedro', 'López Martín', '655987321', '1980-05-12'),
('Sofía', 'García Blanco', '677654123', '1992-09-25'),
('Miguel', 'Torres Fernández', '688321654', '1975-03-17'),
('Isabel', 'Jiménez Romero', '699123987', '2001-07-08'),
('Lucía', 'Navarro Pérez', '600654321', '1999-12-30');

-- Citas
INSERT INTO Citas (id_paciente, numero_trabajador_fisio, fecha, hora, duracion) VALUES
(1, 1, '2024-03-26', '09:00:00', 60),
(2, 2, '2024-03-27', '10:30:00', 90),
(3, 4, '2024-03-28', '11:00:00', 120),
(4, 1, '2024-03-29', '12:30:00', 60),
(5, 2, '2024-03-30', '14:00:00', 30);

-- Pagos
INSERT INTO Pagos (id_paciente, monto, fecha_pago, metodo_pago) VALUES
(1, 50.00, '2024-03-26', 'Efectivo'),
(2, 80.00, '2024-03-27', 'Tarjeta'),
(3, 100.00, '2024-03-28', 'Transferencia'),
(4, 50.00, '2024-03-29', 'Efectivo');

-- Insertar más fisioterapeutas activos
INSERT INTO Profesionales (nombre, apellidos, telefono, especialidad) VALUES
('Fernando', 'Molina Díaz', '655789123', 'Fisioterapia deportiva'),
('Carmen', 'Santos López', '677321987', 'Terapia manual');

INSERT INTO Fisioterapeutas (numero_trabajador_fisio, estado, hora_inicio, hora_fin) VALUES
(6, 'Trabajando', '07:00:00', '13:00:00'),
(7, 'Trabajando', '13:00:00', '19:00:00');

-- Insertar más pacientes
INSERT INTO Pacientes (nombre, apellidos, telefono, fecha_nacimiento) VALUES
('Raúl', 'Sánchez Moreno', '611234567', '1985-02-15'),
('Elena', 'Castro Fernández', '622765432', '1990-06-20');

-- Insertar más citas
INSERT INTO Citas (id_paciente, numero_trabajador_fisio, fecha, hora, duracion) VALUES
(6, 6, '2024-04-01', '08:00:00', 45),
(7, 7, '2024-04-02', '15:30:00', 90),
(1, 3, '2024-04-03', '10:00:00', 120),  -- Fisioterapeuta de baja
(2, 4, '2024-04-04', '11:15:00', 60),
(3, 5, '2024-04-05', '12:45:00', 30);  -- Fisioterapeuta suspendido

-- Insertar más pagos (incluyendo casos con NULL en método de pago o fecha de pago)
INSERT INTO Pagos (id_paciente, monto, fecha_pago, metodo_pago) VALUES
(6, 60.00, '2024-04-01', 'Efectivo'),
(7, 75.00, NULL, NULL),  -- Pago pendiente
(1, 90.00, '2024-04-03', 'Tarjeta'),
(2, 110.00, NULL, 'Transferencia'),  -- Pago sin fecha
(3, 0.00, NULL, NULL);  -- No ha pagado nada aún
