-- Script para crear las tablas en Oracle Autonomous Database

CREATE TABLE ACTORES (
    codigo_actor INTEGER PRIMARY KEY,
    nombre VARCHAR2(255),
    apellido VARCHAR2(255),
    otros_datos VARCHAR2(255)
);

CREATE TABLE CINTAS (
    codigo_cinta INTEGER PRIMARY KEY,
    estanteria INTEGER,
    estante INTEGER,
    fila INTEGER
);

CREATE TABLE PELICULAS (
    codigo_pelicula INTEGER PRIMARY KEY,
    titulo VARCHAR2(255),
    director_principal VARCHAR2(255),
    tema VARCHAR2(255)
);

CREATE TABLE CINTA_PELICULA (
    codigo_cinta INTEGER NOT NULL,
    codigo_pelicula INTEGER NOT NULL,
    PRIMARY KEY (codigo_cinta, codigo_pelicula),
    FOREIGN KEY (codigo_cinta) REFERENCES CINTAS(codigo_cinta),
    FOREIGN KEY (codigo_pelicula) REFERENCES PELICULAS(codigo_pelicula)
);

CREATE TABLE PELICULA_ACTOR (
    codigo_pelicula INTEGER NOT NULL,
    codigo_actor INTEGER NOT NULL,
    PRIMARY KEY (codigo_pelicula, codigo_actor),
    FOREIGN KEY (codigo_pelicula) REFERENCES PELICULAS(codigo_pelicula),
    FOREIGN KEY (codigo_actor) REFERENCES ACTORES(codigo_actor)
);

COMMIT;
