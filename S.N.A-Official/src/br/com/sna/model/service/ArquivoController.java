/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model.service;

import br.com.sna.model.dao.Arquivo;
import java.util.List;

/**
 *
 * @author Danilo
 */
public interface ArquivoController {
    /**
     * 
     * @param arquivo Crud do arquivo 
     */
     public void save(Arquivo arquivo);
     public void update(Arquivo arquivo);
     public void delete(Arquivo arquivo);
     public List<Arquivo> arquivo(Integer numero, String ano, String mes);
}
