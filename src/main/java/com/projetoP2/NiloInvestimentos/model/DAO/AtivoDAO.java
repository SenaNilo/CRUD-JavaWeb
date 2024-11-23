package com.projetoP2.NiloInvestimentos.model.DAO;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.projetoP2.NiloInvestimentos.model.Ativo;
import com.projetoP2.NiloInvestimentos.model.AtivoTool;

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

    public List<Map<String,Object>> obterListaAtivosValores(){
        // String sql = "select t.tp_ativo, t.nm_ativo, TO_CHAR(a.vl_ativos, '0D00000000') as vl_ativos, TO_CHAR(a.vl_real, 'FM9999999D00') as vl_real, a.id_ativo from tb_ativos as a inner join tb_tpativos as t on (t.id_tpativo = a.id_tpativo);"; era pra formatação
        String sql = "select t.tp_ativo, t.nm_ativo, a.vl_ativos, a.vl_real, a.id_ativo from tb_ativos as a inner join tb_tpativos as t on (t.id_tpativo = a.id_tpativo);";
        return jdbc.queryForList(sql);
    }

    public Ativo obterAtivo(int id){
        String sql = "select * from tb_ativos where id_ativo = ?;";
        return AtivoTool.converterTipo(jdbc.queryForMap(sql, id));
    }

    public void atualizarAtivo(int idAtivo, Ativo atv){
        String sql = "update tb_ativos set ";
        sql += "id_tpativo = ?, vl_ativos = ?, vl_real = ? where id_ativo = ?;";
        jdbc.update(sql, atv.getId_tpAtivo(), atv.getVl_ativos(), atv.getVl_real(), idAtivo);
    }

    public void deletarAtivo(int id){
        String sql = "delete from tb_ativos where id_ativo = ?;";
        jdbc.update(sql, id);

    }

}