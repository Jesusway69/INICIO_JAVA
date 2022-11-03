print("START");

conexion = new Mongo("localhost"); // Host donde esta nuestra base de datos
db = conexion.getDB("instituto"); // Nombre de la base de datos que vamos a utilizar
db.dropDatabase(); // Limpiamos la base de datos por si existe algo antes
db.createCollection("alumno"); // Colección que tendrá nuestra base de datos
print('COLECCION: ', db.getCollectionNames());

print("CREANDO ALUMNO");

alumno1 = {_id: "A1", nombre: "Luis", edad: 22, estatura: 1.70, direccion: {calle: "Ejercito 123", ciudad: "Sevilla", comunidad: "Andalucia"}}
alumno2 = {_id: "A2", nombre: "Miguel", edad: 23, estatura: 1.62, direccion: {calle: "América 491", ciudad: "Valencia", comunidad: "Valencia"}}
alumno3 = {_id: "A3", nombre: "Carlos", edad: 21, estatura: 1.72, direccion: {calle: "Marconi 456", ciudad: "Cadiz", comunidad: "Andalucia"}}
alumno4 = {_id: "A4", nombre: "María", edad: 20, estatura: 1.65, direccion: {calle: "Pardo 213", ciudad: "Jaen", comunidad: "Andalucia"}}
alumno5 = {_id: "A5", nombre: "Carmen", edad: 22, estatura: 1.70, direccion: {calle: "Mansiche 134", ciudad: "Trujillo", comunidad: "Extremadura"}}

print("GRABANDO ALUMNO");

db.alumno.insert(alumno1);
db.alumno.insert(alumno2);
db.alumno.insert(alumno3);
db.alumno.insert(alumno4);
db.alumno.insert(alumno5);

print("END");