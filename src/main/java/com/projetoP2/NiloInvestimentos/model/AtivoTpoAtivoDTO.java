package com.projetoP2.NiloInvestimentos.model;

import java.math.BigDecimal;

public class AtivoTpoAtivoDTO {
    private String tpAtivo;
    private String nmAtivo;
    private BigDecimal vlAtivos;
    private BigDecimal vlReal;
    // private double vlAtivosD;
    // private double vlRealD;
    private int idAtivo;

    // Getters, Setters e Construtor
    public AtivoTpoAtivoDTO(String tpAtivo, String nmAtivo, BigDecimal vlAtivos, BigDecimal vlReal, int idAtivo) {
        this.tpAtivo = tpAtivo;
        this.nmAtivo = nmAtivo;
        this.vlAtivos = vlAtivos;
        this.vlReal = vlReal;
        this.idAtivo = idAtivo;
    }

    // Getters e Setters
    public String getTpAtivo() {
        return tpAtivo;
    }

    public void setTpAtivo(String tpAtivo) {
        this.tpAtivo = tpAtivo;
    }

    public String getNmAtivo() {
        return nmAtivo;
    }

    public void setNmAtivo(String nmAtivo) {
        this.nmAtivo = nmAtivo;
    }

    public BigDecimal getVlAtivos() {
        return vlAtivos;
    }

    public void setVlAtivos(BigDecimal vlAtivos) {
        this.vlAtivos = vlAtivos;
    }

    public BigDecimal getVlReal() {
        return vlReal;
    }

    public void setVlReal(BigDecimal vlReal) {
        this.vlReal = vlReal;
    }

    public int getIdAtivo() {
        return idAtivo;
    }

    public void setIdAtivo(int idAtivo) {
        this.idAtivo = idAtivo;
    }
}
