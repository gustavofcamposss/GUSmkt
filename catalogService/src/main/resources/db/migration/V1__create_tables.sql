-- V1: create produto and funcionario tables

CREATE TABLE IF NOT EXISTS produto (
  ean VARCHAR(13) NOT NULL,
  name VARCHAR(120),
  price DOUBLE,
  is_over18 BOOLEAN,
  image VARCHAR(200),
  PRIMARY KEY (ean)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS funcionario (
  registration VARCHAR(13) NOT NULL,
  name VARCHAR(120),
  PRIMARY KEY (registration)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
