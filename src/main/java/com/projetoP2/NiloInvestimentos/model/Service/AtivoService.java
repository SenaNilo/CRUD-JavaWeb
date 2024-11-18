package com.projetoP2.NiloInvestimentos.model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoP2.NiloInvestimentos.model.Ativo;
import com.projetoP2.NiloInvestimentos.model.DAO.AtivoDAO;

@Service
public class AtivoService {

    @Autowired
    AtivoDAO adao;
    
    public void inserir(Ativo atv){
        System.out.println("Chegou aqui");
        adao.inserir(atv);
    }
}