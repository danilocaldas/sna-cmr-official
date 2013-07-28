/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.controller;

import br.com.sna.model.Producao;
import java.util.Date;

import java.util.List;

/**
 *
 * @author Danilo
 */
public interface ProducaoController {
    
    /**
     * 
     * @param producao Crud da producao
     */
    public void save(Producao producao);
    public void update(Producao producao);
    public void delete(Producao producao);
    public List<Producao> producao(Date data_digitacao, String nome_profissional);
}
