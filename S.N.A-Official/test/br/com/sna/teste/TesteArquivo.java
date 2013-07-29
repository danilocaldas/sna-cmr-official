/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.teste;

import br.com.sna.controller.implement.ArquivoImplements;
import br.com.sna.model.Arquivo;

/**
 *
 * @author Danilo
 */
public class TesteArquivo {

    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo(3, "2014", "Dezembro", "Verde", "HAM, HSA", "RADIO");
        Arquivo arquivo2 = new Arquivo(2, "2014", "Fevereiro", "Amarelo", "HSA", "ONCOLOGIA");
        ArquivoImplements ai = new ArquivoImplements();
        //ai.save(arquivo);
        //ai.save(arquivo2);
        //ai.update(arquivo);
        Arquivo arqui3 = new Arquivo();
        arqui3.setNumero(3);
        arqui3.setAno("2014");
        //ai.delete(arqui3);
    }
}
