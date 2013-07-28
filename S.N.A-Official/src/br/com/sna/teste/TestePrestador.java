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
         prestador.setNome("HAM");
         prestador.setCnes(3808);
         
         PrestadorImplements pi = new PrestadorImplements();
         pi.save(prestador);
     }
}
