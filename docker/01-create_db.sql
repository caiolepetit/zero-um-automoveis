CREATE TABLE IF NOT EXISTS veiculo
(
    id                         SERIAL      NOT NULL,
    data_hora_ultima_alteracao TIMESTAMP   NOT NULL,
    preco                      DECIMAL     NOT NULL,
    ano                        INTEGER     NOT NULL,
    cor                        VARCHAR(30) NOT NULL,
    modelo                     VARCHAR(50) NOT NULL,
    marca                      VARCHAR(50) NOT NULL,
    vendido                    BOOLEAN     NOT NULL,
    PRIMARY KEY (id)
);

CREATE SEQUENCE veiculo_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE IF NOT EXISTS venda
(
    id              SERIAL       NOT NULL,
    cpf             VARCHAR(11)  NOT NULL,
    veiculo_id      BIGINT       NOT NULL,
    data_hora_venda TIMESTAMP(6) NOT NULL,
    PRIMARY KEY (id)
);

CREATE SEQUENCE venda_seq START WITH 1 INCREMENT BY 50;
