/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model.service;

import br.com.sna.model.dao.Producao;
import java.util.Date;

import java.util.List;

/**
 *
 * @author Danilo
 */
public interface ProducaoController {
    
    /**
     * 
     * @param ListarProducao Crud da ListarProducao
     */
    public void save(Producao producao);
    public void update(Producao producao);
    public void delete(Producao producao);
    public List<Producao> ListarProducao(Date data_digitacao, String nome_profissional);
    public List<Producao> listProducao();
}
