package com.projetoP2.NiloInvestimentos.model;

public class TipoAtivo {

    private int id_tpAtivo;
    private String tp_ativo; /* Char */
    private String nm_ativo;
    private double tx_conversao;
    public TipoAtivo(int id_tpAtivo, String tp_ativo, String nm_ativo, double tx_conversao) {
        this.id_tpAtivo = id_tpAtivo;
        this.tp_ativo = tp_ativo;
        this.nm_ativo = nm_ativo;
        this.tx_conversao = tx_conversao;
    }
    public TipoAtivo(String tp_ativo, String nm_ativo, double tx_conversao) {
        this.tp_ativo = tp_ativo;
        this.nm_ativo = nm_ativo;
        this.tx_conversao = tx_conversao;
    }

    public int getId_tpAtivo() {
        return id_tpAtivo;
    }
    public void setId_tpAtivo(int id_tpAtivo) {
        this.id_tpAtivo = id_tpAtivo;
    }
    public String getTp_Ativo() {
        return tp_ativo;
    }
    public void setTp_Ativo(String tp_ativo) {
        this.tp_ativo = tp_ativo;
    }
    public String getNm_ativo() {
        return nm_ativo;
    }
    public void setNm_ativo(String nm_ativo) {
        this.nm_ativo = nm_ativo;
    }
    public double getTx_conversao() {
        return tx_conversao;
    }
    public void setTx_conversao(double tx_conversao) {
        this.tx_conversao = tx_conversao;
    }

}
