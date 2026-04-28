-- init.sql
CREATE DATABASE IF NOT EXISTS smartphones;

USE smartphones;

CREATE TABLE IF NOT EXISTS smartphones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    modelo VARCHAR(50) NOT NULL,
    anio INT NOT NULL,
    procesador VARCHAR(50) NOT NULL,
    almacenamiento VARCHAR(5) NOT NULL,
    ram VARCHAR(5) NOT NULL,
);