CREATE TABLE Alumno (
  idAlumno INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre   VARCHAR(20) NOT NULL,
  edad     INTEGER     NOT NULL
);

INSERT INTO Alumno(nombre,edad) VALUES('Luis',21);
INSERT INTO Alumno(nombre,edad) VALUES('Miguel',23);
INSERT INTO Alumno(nombre,edad) VALUES('Carlos',22);
INSERT INTO Alumno(nombre,edad) VALUES('María',19);
INSERT INTO Alumno(nombre,edad) VALUES('Arturo',23);

SELECT * FROM Alumno;




