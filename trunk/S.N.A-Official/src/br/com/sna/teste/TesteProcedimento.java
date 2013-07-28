/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.teste;

import br.com.sna.controller.implement.ProcedimentoImplements;
import br.com.sna.model.Procedimento;

/**
 *
 * @author Danilo
 */
public class TesteProcedimento {
     public static void main(String[] args){
         Procedimento procedimento = new Procedimento();
         procedimento.setNome("ONCOLOGIA");
         procedimento.setCodigo(05050105);
         
         ProcedimentoImplements pi = new ProcedimentoImplements();
         pi.save(procedimento);
     }
}
