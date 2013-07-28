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
         procedimento.setCodigo(4269429);
         
         ProcedimentoImplements pi = new ProcedimentoImplements();
      //   pi.save(procedimento);
         
         Procedimento procedimento2 = new Procedimento();
         procedimento2.setNome("RADIO");
         procedimento2.setCodigo(3248763);
         procedimento2.setId(1);
//         pi.save(procedimento2);
//         pi.update(procedimento2);
//         pi.delete(procedimento2);
     }
}
