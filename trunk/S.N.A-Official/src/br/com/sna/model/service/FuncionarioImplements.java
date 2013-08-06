/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model.service;

import br.com.sna.connection.ConnectionfactoryMYSQL;
import br.com.sna.model.dao.Funcionario;
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
public class FuncionarioImplements implements FuncionarioController {

    ConnectionfactoryMYSQL bdConnection = new ConnectionfactoryMYSQL();
    Query query = new Query();
    PreparedStatement pstmt;
    ResultSet rset;
    private Funcionario funcionario;

    @Override
    public void save(Funcionario funcionario) {
        int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.cadastraFuncionario);
            pstmt.setString(++index, funcionario.getNome());
            pstmt.setString(++index, funcionario.getSenha());
            pstmt.executeUpdate();
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioImplements.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Funcionario funcionario) {
     int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.updateFuncionario);
            pstmt.setString(++index, funcionario.getNome());
            pstmt.setString(++index, funcionario.getSenha());
            pstmt.setLong(++index, funcionario.getId());
            pstmt.executeUpdate();
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Funcionario funcionario) {
     int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.excluirFuncionario);
            pstmt.setLong(++index, funcionario.getId());
            pstmt.executeUpdate();
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Funcionario> listaFuncionario() {
        List<Funcionario> fucionarios = new ArrayList();
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.consultaFuncionario);
            rset = pstmt.executeQuery();
            Funcionario fun;
            while (rset.next()) {
                fun = new Funcionario();
                fun.setId(rset.getLong("id"));
                fun.setNome(rset.getString("nome"));
                fun.setSenha(rset.getString("senha"));
                fucionarios.add(fun);
            }
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioImplements.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fucionarios;
        
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
