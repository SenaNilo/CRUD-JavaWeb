package com.projetoP2.NiloInvestimentos.model;

public class Ativo {
    
    private int id_ativo;
    private int id_tpAtivo; /* Char */
    private double vl_ativos;
    private double vl_real;
    
    public Ativo(int id_ativo, int id_tpAtivo, double vl_ativos, double vl_real) {
        this.id_ativo = id_ativo;
        this.id_tpAtivo = id_tpAtivo;
        this.vl_ativos = vl_ativos;
        this.vl_real = vl_real;
    }
    public Ativo(int id_tpAtivo, double vl_ativos, double vl_real) {
        this.id_tpAtivo = id_tpAtivo;
        this.vl_ativos = vl_ativos;
        this.vl_real = vl_real;
    }
    
    public int getId_ativo() {
        return id_ativo;
    }
    public void setId_ativo(int id_ativo) {
        this.id_ativo = id_ativo;
    }
    public int getId_tpAtivo() {
        return id_tpAtivo;
    }
    public void setId_tpAtivo(int id_tpAtivo) {
        this.id_tpAtivo = id_tpAtivo;
    }
    public double getVl_ativos() {
        return vl_ativos;
    }
    public void setVl_ativos(double vl_ativos) {
        this.vl_ativos = vl_ativos;
    }
    public double getVl_real() {
        return vl_real;
    }
    public void setVl_real(double vl_real) {
        this.vl_real = vl_real;
    }
}
