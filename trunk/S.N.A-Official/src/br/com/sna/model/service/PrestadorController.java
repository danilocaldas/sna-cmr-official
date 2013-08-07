/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model.service;

import br.com.sna.model.dao.Prestador;
import java.util.List;

/**
 *
 * @author Danilo
 */
public interface PrestadorController {
    
    /**
     * 
     * @param prestador crud do prestador 
     */
    public void save (Prestador prestador);
    public void update(Prestador prestador);
    public void delete(Prestador prestador);
    public List<Prestador> listaPrestador();
    public List<Prestador> listPrestador(String nome);
}
