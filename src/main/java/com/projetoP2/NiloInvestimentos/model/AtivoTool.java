package com.projetoP2.NiloInvestimentos.model;

import java.math.BigDecimal;
import java.util.Map;

public class AtivoTool {
    
    public static Ativo converterTipo(Map<String,Object> registro){
        //Como registro.get retorna Object, devemos usar o polimorfismo
        //de subtipos (downcast) para recuperar os tipos originais.
        return new Ativo((int) registro.get("id_ativo")
                          ,(int) registro.get("id_tpativo")
                          ,(BigDecimal) registro.get("vl_ativos")
                          ,(BigDecimal) registro.get("vl_real"));
    }

}
