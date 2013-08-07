/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model.service;

import br.com.sna.connection.ConnectionfactoryMYSQL;
import br.com.sna.model.dao.Procedimento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danilo
 */
public class ProcedimentoImplements implements ProcedimentoController {

    ConnectionfactoryMYSQL bdConnection = new ConnectionfactoryMYSQL();
    Query query = new Query();
    PreparedStatement pstmt;
    ResultSet rset;

    /**
     * Salvar listarProcedimento na base de dados
     *
     * @param listarProcedimento
     */
    @Override
    public void save(Procedimento procedimento) {
        int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.cadastraProcedimento);
            pstmt.setInt(++index, procedimento.getCodigo());
            pstmt.setString(++index, procedimento.getNome());
            pstmt.executeUpdate();
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ProcedimentoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Procedimento procedimento) {
        int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.updateProcedimento);
            pstmt.setString(++index, procedimento.getNome());
            pstmt.setInt(++index, procedimento.getCodigo());
            pstmt.setLong(++index, procedimento.getId());
            pstmt.executeUpdate();
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ProcedimentoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Procedimento procedimento) {
        int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.excluirProcedimento);
            pstmt.setInt(++index, procedimento.getCodigo());
            pstmt.executeUpdate();
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ProcedimentoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Fazer pesquisa no banco retornando o Codigo do listarProcedimento e nome
     *
     * @param nome usado para efetuar a pesquisa
     * @return
     */
    @Override
    public List<Procedimento> listarProcedimento() {
        List<Procedimento> procedimentos = new ArrayList<Procedimento>();
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.consultaProcedimento);
            //pstmt.setString(1, nome);
            rset = pstmt.executeQuery();
            Procedimento pro;
            while (rset.next()) {
                pro = new Procedimento();
                pro.setId(rset.getLong("id"));
                pro.setCodigo(rset.getInt("codigo"));
                pro.setNome(rset.getString("nome"));
                procedimentos.add(pro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProcedimentoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
        return procedimentos;
    }

    @Override
    public List<Procedimento> listProcedimento(String nome) {
        List<Procedimento> procedimentos = new ArrayList<Procedimento>();
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.listaProcedimento);
            pstmt.setString(1, nome);
            rset = pstmt.executeQuery();
            Procedimento pro;
            while (rset.next()) {
                pro = new Procedimento();
                pro.setNome(rset.getString("nome"));
                procedimentos.add(pro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProcedimentoImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
        return procedimentos;
    }
}
