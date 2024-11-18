package com.projetoP2.NiloInvestimentos.model.DAO;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.projetoP2.NiloInvestimentos.model.Ativo;

import jakarta.annotation.PostConstruct;

@Repository
public class AtivoDAO {
 
    @Autowired
    DataSource dataSource;

    JdbcTemplate jdbc;

    @PostConstruct
    private void initialize(){
        jdbc = new JdbcTemplate(dataSource);
    }

    public void inserir(Ativo atv){
        String sql = "Insert into tb_ativos (id_tpativo, vl_ativos, vl_real) values (?,?,?);";
        Object[] parametros = new Object[3]; //?
        parametros[0] = atv.getId_tpAtivo();
        parametros[1] = atv.getVl_ativos();
        parametros[2] = atv.getVl_real();
        
        jdbc.update(sql,parametros);
        
    }

}