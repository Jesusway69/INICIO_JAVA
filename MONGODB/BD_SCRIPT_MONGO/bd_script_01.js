print("START");

conexion = new Mongo("localhost"); // Host donde esta nuestra base de datos
db = conexion.getDB("tienda"); // Nombre de la base de datos que vamos a utilizar
db.dropDatabase(); // Limpiamos la base de datos por si existe algo antes
db.createCollection("empleado"); // Colección que tendrá nuestra base de datos
print('COLECCION: ', db.getCollectionNames()); // Imprimir el nombre de la colección
db.empleado.createIndex({"idEmpleado": 1}, {unique: true}) // Clave primaria para nuestra colección

print("CREANDO EMPLEADO");

empleado1 = {
    "idEmpleado": 1,
    "nombre": "Miguel",
    "edad": 22,
    "sueldo": 1200,
    "direccion": {"Calle": "De La Sierva", "numero": 123, "ciudad": "Trujillo"},
    "telefono": "634649847",
    "jobis": ["Futbol", "Televisión"]
};

empleado2 = {
    "idEmpleado": 2,
    "nombre": "Carlos",
    "edad": 24,
    "sueldo": 1100,
    "direccion": {"Calle": "Juan Cipriani", "numero": 534, "ciudad": "Piura"},
    "telefono": "635645557",
    "jobis": ["Juegos", "Cartas", "Series"]
};

empleado3 = {
    "idEmpleado": 3,
    "nombre": "Carmen",
    "edad": 21,
    "sueldo": 1000,
    "direccion": {"Calle": "Guillermo Marconi", "numero": 353, "ciudad": "Tumbes"},
    "telefono": "635645557",
    "jobis": ["Peliculas", "Tenis"]
};

empleado4 = {
    "idEmpleado": 4,
    "nombre": "Arturo",
    "edad": 20,
    "sueldo": 1000,
    "direccion": {"Calle": "Mendez Pelayo", "numero": 343, "ciudad": "Trujillo"},
    "telefono": "635645557",
    "jobis": ["Lectura", "Baile", "Conciertos Playa"]
};

empleado5 = {
    "idEmpleado": 5,
    "nombre": "Carmen",
    "edad": 26,
    "sueldo": 1000,
    "direccion": {"Calle": "Sipion LLonar", "numero": 143, "ciudad": "Trujillo"},
    "telefono": "635645444",
    "jobis": ["Baile", "Juegos", "Conciertos Playa"]
};

empleado6 = {
    "idEmpleado": 6,
    "nombre": "Carmen",
    "edad": 27,
    "sueldo": 1000,
    "direccion": {"Calle": "Marconi LLonar", "numero":2143, "ciudad": "Trujillo"},
    "telefono": "635645333",
    "jobis": ["Baile", "Juegos"]
};

print("GRABANDO EMPLEADO");

db.empleado.insert(empleado1);
db.empleado.insert(empleado2);
db.empleado.insert(empleado3);
db.empleado.insert(empleado4);
db.empleado.insert(empleado5);
db.empleado.insert(empleado6);

print("END");