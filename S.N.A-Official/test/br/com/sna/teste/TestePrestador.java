/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.teste;

import br.com.sna.controller.implement.PrestadorImplements;
import br.com.sna.model.Prestador;

/**
 *
 * @author Danilo
 */
public class TestePrestador {
     public static void main(String[] args){
         Prestador prestador = new Prestador();
         prestador.setNome("HSA");
         prestador.setCnes(4400);
         //prestador.setId(4);
         
         Prestador prestador2 = new Prestador();
         prestador2.setNome("HAM");
         prestador2.setCnes(5800);
         //prestador2.setId(4);
         
         Prestador prestador3 = new Prestador();
         prestador3.setNome("HJM");
         prestador3.setCnes(2222);
         prestador3.setId(6);
         
         PrestadorImplements pi = new PrestadorImplements();
         pi.save(prestador);
        // pi.save(prestador2);
        // pi.update(prestador3);
        // pi.delete(prestador3);
         
         
     }
}
