/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.controller.implement;

import br.com.sna.connection.ConnectionfactoryMYSQL;
import br.com.sna.controller.FuncionarioController;
import br.com.sna.model.Funcionario;
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
    public List<Funcionario> funcionario(String nome) {
        List<Funcionario> fucionarios = new ArrayList<Funcionario>();
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.consultaFuncionario);
            pstmt.setString(1, nome);
            rset = pstmt.executeQuery();
            Funcionario fun;
            while (rset.next()) {
                fun = new Funcionario();
                fun.setNome("nome");
                fun.setSenha("senha");
                fucionarios.add(fun);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioImplements.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fucionarios;
    }
}
