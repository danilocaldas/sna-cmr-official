/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.teste;

import br.com.sna.controller.implement.FuncionarioImplements;
import br.com.sna.model.Funcionario;

/**
 *
 * @author Danilo
 */
public class TesteFuncionario {
     public static void main(String[] args){
         Funcionario funcionario = new Funcionario();
         funcionario.setNome("Danilo Caldas");
         funcionario.setSenha("dan1501");
         
         FuncionarioImplements pi = new FuncionarioImplements();
         pi.save(funcionario);
     }
}
