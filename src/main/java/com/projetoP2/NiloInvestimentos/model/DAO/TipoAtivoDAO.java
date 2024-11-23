package com.projetoP2.NiloInvestimentos.model.DAO;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.projetoP2.NiloInvestimentos.model.TipoAtivo;
import com.projetoP2.NiloInvestimentos.model.TipoAtivoDTO;

import jakarta.annotation.PostConstruct;

@Repository
public class TipoAtivoDAO {

    @Autowired
    DataSource dataSource;

    JdbcTemplate jdbc;

    @PostConstruct
    private void initializa(){
        jdbc = new JdbcTemplate(dataSource);
    }

    public TipoAtivo obterTaxa(int id){
        String sql = "Select * from tb_tpativos where id_tpativo = ?";
        return TipoAtivoDTO.converterTipo(jdbc.queryForMap(sql, id));
    }
    
}