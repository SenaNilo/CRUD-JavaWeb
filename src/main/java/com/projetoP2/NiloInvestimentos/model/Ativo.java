package com.projetoP2.NiloInvestimentos.model;

import java.math.BigDecimal;

public class Ativo {
    
    private int id_ativo;
    private int id_tpAtivo; /* Fk */
    private BigDecimal vl_ativos;
    private BigDecimal vl_real;
    
    //Precisou fazer isso pois o spring nao estava conseguindo atualizar sem ter um contrutor de referencia *eu não entendi o por que foi com isso
    public Ativo(){}

    public Ativo(int id_ativo, int id_tpAtivo, BigDecimal vl_ativos, BigDecimal vl_real) {
        this.id_ativo = id_ativo;
        this.id_tpAtivo = id_tpAtivo;
        this.vl_ativos = vl_ativos;
        this.vl_real = vl_real;
    }
    public Ativo(int id_tpAtivo, BigDecimal vl_ativos, BigDecimal vl_real) {
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
    public BigDecimal getVl_ativos() {
        return vl_ativos;
    }
    public void setVl_ativos(BigDecimal vl_ativos) {
        this.vl_ativos = vl_ativos;
    }
    public BigDecimal getVl_real() {
        return vl_real;
    }
    public void setVl_real(BigDecimal vl_real) {
        this.vl_real = vl_real;
    }
}
