CREATE TABLE IF NOT EXISTS tb_tpativos (
    id_tpativo SERIAL PRIMARY KEY,
    tp_ativo VARCHAR(4) UNIQUE,
    nm_ativo VARCHAR(20),
    tx_conversao NUMERIC(12,8)
);

INSERT INTO tb_tpativos (tp_ativo, nm_ativo, tx_conversao) VALUES
    ('BRL', 'Real', 1),
    ('USD', 'Dolar', 0.17),
    ('EUR', 'Euro', 0.16),
    ('JPY', 'Ienes', 26.50),
    ('BTC', 'Bitcoin', 0.00000216),
    ('BNB', 'BNB', 0.000275),
    ('ETH', 'Ether', 0.000057),
    ('DOGE', 'Dogecoin', 0.83)
ON CONFLICT (tp_ativo) DO NOTHING;

CREATE TABLE IF NOT EXISTS tb_ativos (
    id_ativo SERIAL PRIMARY KEY,
    id_tpativo INT REFERENCES tb_tpativos(id_tpativo),
    vl_ativos NUMERIC(12,8),
    vl_real NUMERIC(10,2)
);

CREATE TABLE IF NOT EXISTS tb_transacoes (
    id_transacoes SERIAL PRIMARY KEY,
    id_ativo INT REFERENCES tb_ativos(id_ativo),
    vl_transacao NUMERIC(12,8),
    vl_realT NUMERIC(10,2)
);

-- Sequência:

-- cd C:\Program Files\PostgreSQL\17\bin

-- psql -U postgres

-- Senha para o usuário postgres: root

-- \c niloinvest;