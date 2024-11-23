package com.projetoP2.NiloInvestimentos.model;

import java.util.Map;

public class TipoAtivoDTO {
    
    public static TipoAtivo converterTipo(Map<String,Object> registro){
        //Como registro.get retorna Object, devemos usar o polimorfismo
        //de subtipos (downcast) para recuperar os tipos originais.
        return new TipoAtivo((String) registro.get("tp_ativo")
                          ,(String) registro.get("nm_ativo")
                          ,(double) registro.get("tx_conversao"));
    }

}
