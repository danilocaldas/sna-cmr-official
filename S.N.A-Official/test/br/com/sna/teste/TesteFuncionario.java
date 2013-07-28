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
         //pi.save(funcionario);
         
         Funcionario funcionario4 = new Funcionario();
         //funcionario4.setNome("Joana Evangelista");
         //funcionario4.setSenha("joana2407");
         funcionario4.setId(4);
         //pi.save(funcionario4);
         
         Funcionario funcionario3 = new Funcionario();
         funcionario3.setNome("Jurandir Santos");
         funcionario3.setSenha("jura1234");
         funcionario3.setId(2);
         //pi.update(funcionario3);
         pi.delete(funcionario4);
         
         
         
     }
}
