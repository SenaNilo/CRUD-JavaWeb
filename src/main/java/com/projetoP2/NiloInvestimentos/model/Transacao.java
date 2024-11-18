package com.projetoP2.NiloInvestimentos.model;

public class Transacao {

    private int id_transacoes;
    private int id_ativo; /* Char */
    private double vl_transacao;
    private double vl_realT;


    public Transacao(int id_transacoes, int id_ativo, double vl_transacao, double vl_realT) {
        this.id_transacoes = id_transacoes;
        this.id_ativo = id_ativo;
        this.vl_transacao = vl_transacao;
        this.vl_realT = vl_realT;
    }
    public Transacao(int id_ativo, double vl_transacao, double vl_realT) {
        this.id_ativo = id_ativo;
        this.vl_transacao = vl_transacao;
        this.vl_realT = vl_realT;
    }


    public int getId_transacoes() {
        return id_transacoes;
    }
    public void setId_transacoes(int id_transacoes) {
        this.id_transacoes = id_transacoes;
    }
    public int getId_ativo() {
        return id_ativo;
    }
    public void setId_ativo(int id_ativo) {
        this.id_ativo = id_ativo;
    }
    public double getVl_transacao() {
        return vl_transacao;
    }
    public void setVl_transacao(double vl_transacao) {
        this.vl_transacao = vl_transacao;
    }
    public double getVl_realT() {
        return vl_realT;
    }
    public void setVl_realT(double vl_realT) {
        this.vl_realT = vl_realT;
    }

}
