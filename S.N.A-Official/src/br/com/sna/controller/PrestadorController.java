/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.controller;

import br.com.sna.model.Prestador;
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
    public List<Prestador> prestador(String nome);
}
