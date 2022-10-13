-- MOSTRAR QUE FORMA DE REPUBLICA TIENE UN PAIS

SELECT doc->'$.government.GovernmentForm' 
FROM countryinfo
WHERE doc->'$.Name' = 'Armenia';

+------------------------------------+
| doc->'$.government.GovernmentForm' |
+------------------------------------+
| "Republic"                         |
+------------------------------------+
1 row in set (0.00 sec)

SELECT doc->'$.government.GovernmentForm' 
FROM countryinfo
WHERE doc->'$.Name' = 'Spain';

+------------------------------------+
| doc->'$.government.GovernmentForm' |
+------------------------------------+
| "Constitutional Monarchy"          |
+------------------------------------+
1 row in set (0.00 sec)

-- MOSTRAR LA FORMA DE GOBIERNO DE TODOS LOS PAISES QUE INICIEN CON LA LETRA P

SELECT doc->'$.Name' AS PAIS, doc->'$.government.GovernmentForm' AS GOBIERNO
FROM countryinfo
WHERE doc->'$.Name' LIKE '_P%';

+--------------------+---------------------------------+
| PAIS               | GOBIERNO                        |
+--------------------+---------------------------------+
| "Pakistan"         | "Republic"                      |
| "Panama"           | "Republic"                      |
| "Pitcairn"         | "Dependent Territory of the UK" |
| "Peru"             | "Republic"                      |
| "Philippines"      | "Republic"                      |
| "Palau"            | "Republic"                      |
| "Papua New Guinea" | "Constitutional Monarchy"       |
| "Poland"           | "Republic"                      |
| "Puerto Rico"      | "Commonwealth of the US"        |
| "Portugal"         | "Republic"                      |
| "Paraguay"         | "Republic"                      |
| "Palestine"        | "Autonomous Area"               |
+--------------------+---------------------------------+
12 rows in set (0.00 sec)

-- CUANTAS REGIONES DISTINTAS MANEJA LA BASE DE DATOS (VALORES DISTINTOS DEL ATRIBUTO REGION)

SELECT DISTINCT doc->'$.geography.Region'
FROM countryinfo;

=

SELECT doc->'$.geography.Region'
FROM countryinfo
GROUP BY doc->'$.geography.Region';

+-----------------------------+
| doc->'$.geography.Region'   |
+-----------------------------+
| "Caribbean"                 |
| "Southern and Central Asia" |
| "Central Africa"            |
| "Southern Europe"           |
| "Middle East"               |
| "South America"             |
| "Polynesia"                 |
| "Antarctica"                |
| "Australia and New Zealand" |
| "Western Europe"            |
| "Eastern Africa"            |
| "Western Africa"            |
| "Eastern Europe"            |
| "Central America"           |
| "North America"             |
| "Southeast Asia"            |
| "Southern Africa"           |
| "Eastern Asia"              |
| "Nordic Countries"          |
| "Northern Africa"           |
| "Baltic Countries"          |
| "Melanesia"                 |
| "Micronesia"                |
| "British Islands"           |
| "Micronesia/Caribbean"      |
+-----------------------------+
25 rows in set (0.00 sec)

-- MOSTRAR LA CANTIDAD DE PAISE POR CADA REGION DISTINTA

SELECT doc->'$.geography.Region' AS REGION, COUNT(doc->'$.geography.Region') AS CANTIDAD_PAISES
FROM countryinfo
GROUP BY doc->'$.geography.Region'
ORDER BY CANTIDAD_PAISES;

+-----------------------------+-----------------+
| REGION                      | CANTIDAD_PAISES |
+-----------------------------+-----------------+
| "Micronesia/Caribbean"      |               1 |
| "British Islands"           |               2 |
| "Baltic Countries"          |               3 |
| "Antarctica"                |               5 |
| "Australia and New Zealand" |               5 |
| "North America"             |               5 |
| "Southern Africa"           |               5 |
| "Melanesia"                 |               5 |
| "Nordic Countries"          |               7 |
| "Northern Africa"           |               7 |
| "Micronesia"                |               7 |
| "Central America"           |               8 |
| "Eastern Asia"              |               8 |
| "Central Africa"            |               9 |
| "Western Europe"            |               9 |
| "Polynesia"                 |              10 |
| "Eastern Europe"            |              10 |
| "Southeast Asia"            |              11 |
| "Southern and Central Asia" |              14 |
| "South America"             |              14 |
| "Southern Europe"           |              15 |
| "Western Africa"            |              17 |
| "Middle East"               |              18 |
| "Eastern Africa"            |              20 |
| "Caribbean"                 |              24 |
+-----------------------------+-----------------+
25 rows in set (0.00 sec)

-- MOSTRAR LA CANTIDAD DE PAISES DE EUROPA

SELECT doc->'$.geography.Continent' AS CONTINENTE, COUNT(doc->'$.geography.Continent') AS CANTIDAD_PAISES
FROM countryinfo
GROUP BY doc->'$.geography.Continent'
HAVING CONTINENTE = 'Europe';

+------------+-----------------+
| CONTINENTE | CANTIDAD_PAISES |
+------------+-----------------+
| "Europe"   |              46 |
+------------+-----------------+
1 row in set (0.00 sec)

-- MOSTRAR EL CONTINENTE QUE TIENE LA MAYOR CANTIDAD DE PAISES

SELECT doc->'$.geography.Continent' AS CONTINENTE, COUNT(doc->'$.geography.Continent') AS CANTIDAD_PAISES
FROM countryinfo
GROUP BY doc->'$.geography.Continent'
ORDER BY CANTIDAD_PAISES DESC
LIMIT 1;

+------------+-----------------+
| CONTINENTE | CANTIDAD_PAISES |
+------------+-----------------+
| "Africa"   |              58 |
+------------+-----------------+
1 row in set (0.00 sec)

-- MOSTRAR EL NOMBRE DE LA CAPITAL DE ESPAÑA

(1) OBTENER EL CODIGO DE LA CAPITAL DE ESPAÑA
SELECT Capital FROM country WHERE name = 'spain'; --> 653

(2) OBTENER EL NOMBRE DE LA CAPITAL DE ESPAÑA
SELECT Name FROM city WHERE id = 653;

(3) SOLUCION

SELECT Name FROM city WHERE id = (SELECT Capital FROM country WHERE name = 'spain');

+--------+
| Name   |
+--------+
| Madrid |
+--------+
1 row in set (0.00 sec)

-- MOSTRAR EL LENGUAJE Y EL PAIS DE AQUELLOS PAISES QUE SU FORMA DE GOBIERNO SEAN "Constitutional Monarchy"

(1)

SELECT doc->'$.government.GovernmentForm' 
FROM countryinfo
WHERE doc->'$.Name' = 'Spain';

(2)

SELECT doc->'$.Code'
FROM countryinfo
WHERE doc->'$.government.GovernmentForm'  = 'Constitutional Monarchy';

(3)

SELECT Language
FROM CountryLanguage
WHERE CountryCode = 'ESP';

SELECT CountryCode
FROM COUNTRYLANGUAGE;

(4) FINAL

SELECT c.Code, c.Name, cl.Language
FROM country c, countrylanguage cl
WHERE c.Code=cl.CountryCode AND Code IN (SELECT SUBSTRING(doc->'$.Code',2,3)
FROM countryinfo
WHERE doc->'$.government.GovernmentForm'  = 'Constitutional Monarchy');

-- MOSTRAR TODAS LAS CIUDADES DE ESPAÑA (WORLD_Y)

SELECT Name
FROM city
WHERE CountryCode = (SELECT SUBSTRING(doc->'$.Code',2,3)
FROM countryinfo
WHERE doc->'$.Name' = 'Spain');

SUBCONSULTA

SELECT SUBSTRING(doc->'$.Code',2,3)
FROM countryinfo
WHERE doc->'$.Name' = 'Spain';

-- MOSTRAR EL NUMERO DE CIUDADES DE ESPAÑA

SELECT (SELECT Name
FROM country
WHERE Name = 'Spain') AS PAIS, Count(Name) AS NUMERO_CIUDADES
FROM city
WHERE CountryCode = (SELECT SUBSTRING(doc->'$.Code',2,3)
FROM countryinfo
WHERE doc->'$.Name' = 'Spain');

+-------+-----------------+
| PAIS  | NUMERO_CIUDADES |
+-------+-----------------+
| Spain |              59 |
+-------+-----------------+
1 row in set (0.04 sec)

SUBCONSULTA

SELECT Name
FROM country
WHERE Name = 'Spain';

+-------+
| Name  |
+-------+
| Spain |
+-------+
1 row in set (0.00 sec)

-- MOSTRAR EL NUMERO DE CIUDADES DE CADA PAIS ((WORLD_Y)

(1) SIN ORDENAR NUMERO DE LINEA

SYSTEM CLS;
SET @numero=0;
SELECT @numero:=@numero+1 AS N, ci.CountryCode, co.Name, COUNT(*) AS NUMERO_CIUDADES
FROM city ci, country co
WHERE co.Code=ci.CountryCode
GROUP BY ci.CountryCode
ORDER BY NUMERO_CIUDADES;

(2) ORDENAR NUMERO DE LINEA (TABLA TEMPORAL)

SYSTEM CLS;
SET @numero=0;
SELECT @numero:=@numero+1 AS N, TEMPORAL1.*
FROM (SELECT ci.CountryCode, co.Name, COUNT(*) AS NUMERO_CIUDADES
FROM city ci, country co
WHERE co.Code=ci.CountryCode
GROUP BY ci.CountryCode
ORDER BY NUMERO_CIUDADES) TEMPORAL1;

-- MOSTRAR TODOS LOS NOMBRES DE PAISES DE LA BASE DE DATOS

SELECT Name
FROM country
ORDER BY Name;



















