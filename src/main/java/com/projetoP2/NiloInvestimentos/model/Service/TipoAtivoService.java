package com.projetoP2.NiloInvestimentos.model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoP2.NiloInvestimentos.model.TipoAtivo;
import com.projetoP2.NiloInvestimentos.model.DAO.TipoAtivoDAO;

@Service
public class TipoAtivoService {

    @Autowired
    TipoAtivoDAO tadao;

    public TipoAtivo obterTaxa(int id){
        return tadao.obterTaxa(id);
    }
}