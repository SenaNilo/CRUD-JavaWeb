package com.projetoP2.NiloInvestimentos.model.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoP2.NiloInvestimentos.model.Ativo;
import com.projetoP2.NiloInvestimentos.model.DAO.AtivoDAO;

@Service
public class AtivoService {

    @Autowired
    AtivoDAO adao;
    
    public void inserir(Ativo atv){
        adao.inserir(atv);
    }

    public List<Map<String,Object>> obterListaAtivosValores(){
        return adao.obterListaAtivosValores();
    }

    //apenas um
    public Ativo obterAtivo(int id){
        return adao.obterAtivo(id);
    }

    public void atualizarAtivo(int id, Ativo atv){
        adao.atualizarAtivo(id, atv);
    }

    public void deletarAtivo(int id){
        adao.deletarAtivo(id);
    }

}