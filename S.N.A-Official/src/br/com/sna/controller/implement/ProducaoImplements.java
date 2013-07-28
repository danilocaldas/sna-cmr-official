/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.controller.implement;

import br.com.sna.connection.ConnectionfactoryMYSQL;
import br.com.sna.controller.ProducaoController;
import br.com.sna.model.Producao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danilo
 */
public class ProducaoImplements implements ProducaoController {

    ConnectionfactoryMYSQL bdConnection = new ConnectionfactoryMYSQL();
    Query query = new Query();
    PreparedStatement pstmt;
    ResultSet rset;

    @Override
    public void save(Producao producao) {
        int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.cadastraProducao);
            pstmt.setString(++index, producao.getNome_profisional());
            pstmt.setString(++index, producao.getNome_prestador());
            pstmt.setString(++index, producao.getNome_procedimento());
            pstmt.setDate(++index, producao.getData_digitacao());
            pstmt.setDate(++index, producao.getData_entrada());
            pstmt.setInt(++index, producao.getQuantidade());
            pstmt.executeUpdate();
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ProducaoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Producao producao) {
        int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.updateProducao);
            pstmt.setString(++index, producao.getNome_profisional());
            pstmt.setString(++index, producao.getNome_prestador());
            pstmt.setString(++index, producao.getNome_procedimento());
            pstmt.setDate(++index, producao.getData_digitacao());
            pstmt.setDate(++index, producao.getData_entrada());
            pstmt.setInt(++index, producao.getQuantidade());
            pstmt.setLong(++index, producao.getId());
            pstmt.executeUpdate();
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ProducaoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Producao producao) {
        int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.excluirProducao);
            pstmt.setString(++index, producao.getNome_profisional());
            pstmt.setLong(++index, producao.getId());
            pstmt.executeUpdate();
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ProducaoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Producao> producao(Date data_digitacao, String nome_profissional) {
        List<Producao> producoes = new ArrayList<Producao>();
        int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.cadastraProducao);
            pstmt.setDate(++index, (java.sql.Date) data_digitacao);
            pstmt.setString(++index, nome_profissional);
            rset = pstmt.executeQuery();
            Producao pro;
            while (rset.next()) {
                pro = new Producao();
                pro.setId(0);
                pro.setNome_profisional("nome_profissional");
                pro.setNome_procedimento("nome_procedimento");
                pro.setNome_prestador("nome_prestador");
                pro.setData_digitacao(null);
                pro.setData_entrada(null);
                producoes.add(pro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProducaoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
        return producoes;
    }
}
