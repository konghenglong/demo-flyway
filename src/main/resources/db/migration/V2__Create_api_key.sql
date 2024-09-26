CREATE TABLE tb_api_key (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    client_name VARCHAR(255) NOT NULL UNIQUE,
    hashed_secret_key VARCHAR(255) NOT NULL
);