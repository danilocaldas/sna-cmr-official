/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model.service;

import br.com.sna.model.dao.Procedimento;
import java.util.List;

/**
 *
 * @author Danilo
 */
public interface ProcedimentoController {
    /**
     * 
     * @param procedimento Crud do procedimento 
     */
    public void save (Procedimento procedimento);
    public void update(Procedimento procedimento);
    public void delete(Procedimento procedimento);
    public List<Procedimento>  procedimento();
}