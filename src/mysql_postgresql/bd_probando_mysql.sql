-- 1. CREAR UNA BASE DATOS

DROP DATABASE IF EXISTS PROBANDO;
CREATE DATABASE PROBANDO;

-- 2. USAR UNA BASE DE DATOS

USE PROBANDO;

-- 3. CREAR UNA TABLA

CREATE TABLE IF NOT EXISTS Alumno (
  idAlumno VARCHAR(4)  NOT NULL,
  nombre   VARCHAR(20) NOT NULL,
  edad     INT         NOT NULL,
  estatura DOUBLE      NOT NULL,
  escasado BOOLEAN     NOT NULL,
           PRIMARY KEY (idAlumno)
)ENGINE = InnoDB;

-- 4. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SHOW TABLES;

-- 5. DESCRBIR UNA TABLE

DESCRIBE Alumno;

-- 6. INSERTAR REGISTRO EN UNA TABLA

INSERT INTO Alumno(idAlumno,nombre,edad,estatura,escasado) VALUES('A1','Luis',23,1.70,0);
INSERT INTO Alumno(idAlumno,nombre,edad,estatura,escasado) VALUES('A2','Miguel',21,1.65,1);
INSERT INTO Alumno(idAlumno,nombre,edad,estatura,escasado) VALUES('A3','Carlos',20,1.50,0);
INSERT INTO Alumno(idAlumno,nombre,edad,estatura,escasado) VALUES('A4','Arturo',22,1.72,1);
INSERT INTO Alumno(idAlumno,nombre,edad,estatura,escasado) VALUES('A5','Carlos',19,1.55,0);

INSERT INTO Alumno(idAlumno,nombre,edad,estatura,escasado) VALUES('A6','María',19,1.55,false);
INSERT INTO Alumno(idAlumno,nombre,edad,estatura,escasado) VALUES('A7','Isabel',20,1.70,true);

-- 7. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Alumno;
