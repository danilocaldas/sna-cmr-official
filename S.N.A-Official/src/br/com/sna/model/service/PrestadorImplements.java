/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model.service;

import br.com.sna.connection.ConnectionfactoryMYSQL;
import br.com.sna.model.service.PrestadorController;
import br.com.sna.model.dao.Prestador;
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
public class PrestadorImplements implements PrestadorController {

    ConnectionfactoryMYSQL bdConnection = new ConnectionfactoryMYSQL();
    Query query = new Query();
    PreparedStatement pstmt;
    ResultSet rset;

    @Override
    public void save(Prestador prestador) {
        int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.cadastraPrestador);
            pstmt.setInt(++index, prestador.getCnes());
            pstmt.setString(++index, prestador.getNome());
            pstmt.executeUpdate();
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(PrestadorImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Prestador prestador) {
        //int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.updatePrestador);
            pstmt.setString(1, prestador.getNome());
            pstmt.setInt(2, prestador.getCnes());
            pstmt.setLong(3, prestador.getId());
            pstmt.executeUpdate();
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(PrestadorImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Prestador prestador) {
        //int index = 0;
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.excluirPrestador);
            pstmt.setInt(1, prestador.getCnes());
            pstmt.executeUpdate();
            bdConnection.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(PrestadorImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Prestador> listaPrestador() {
        List<Prestador> prestadores = new ArrayList<Prestador>();
        try {
            pstmt = bdConnection.conectar().prepareStatement(query.consultaPrestador);
            //pstmt.setString(1, nome);
            rset = pstmt.executeQuery();
            Prestador pres;
            while (rset.next()) {
                pres = new Prestador();
                pres.setId(rset.getLong("id"));
                pres.setNome(rset.getString("nome"));
                pres.setCnes(rset.getInt("cnes"));
                prestadores.add(pres);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrestadorImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prestadores;
    }
}
