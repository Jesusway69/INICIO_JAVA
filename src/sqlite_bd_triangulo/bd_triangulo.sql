CREATE TABLE IF NOT EXISTS Triangulo (
  idTriangulo INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  cateto1     DOUBLE  NOT NULL,
  cateto2     DOUBLE  NOT NULL
);

INSERT INTO Triangulo(cateto1,cateto2) VALUES(12.1,10.5);

SELECT * FROM Triangulo;

SELECT * FROM sqlite_master WHERE type = "table";

PRAGMA table_info(Triangulo);
