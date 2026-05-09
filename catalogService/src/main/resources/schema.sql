CREATE TABLE IF NOT EXISTS produto (
                                       ean VARCHAR(13) NOT NULL,
    name VARCHAR(120),
    price DOUBLE,
    is_over18 BOOLEAN,
    image VARCHAR(200),
    PRIMARY KEY (ean)
    );

CREATE TABLE IF NOT EXISTS funcionario (
                                           registration VARCHAR(13) NOT NULL,
    name VARCHAR(120),
    PRIMARY KEY (registration)
    );
