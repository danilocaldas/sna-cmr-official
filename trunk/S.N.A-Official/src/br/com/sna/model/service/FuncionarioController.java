/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model.service;

import br.com.sna.model.dao.Funcionario;
import java.util.List;

/**
 *
 * @author Danilo
 */
public interface FuncionarioController {
    
    /**
     * 
     * @param funcionario crud do Funcionario 
     */
    public void save(Funcionario funcionario);
    public void update(Funcionario funcionario);
    public void delete(Funcionario funcionario);
    public List<Funcionario> listaFuncionario();
    
}
