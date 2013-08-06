/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.teste;

import br.com.sna.model.service.ProducaoImplements;
import br.com.sna.model.dao.Producao;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Danilo
 */
public class TesteProducao {

    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dataEntrada = new java.util.Date(15/01/2014) ;
        java.util.Date dataDigitacao = new java.util.Date(28/03/2014); 
        
        Producao p = new Producao();
        p.setPrestador_nome("HSA");
        p.setProfisional_nome("Danilo Caldas");
        p.setProcedimento_nome("RADIO");
        p.setData_digitacao(Date.valueOf(formato.format(dataDigitacao)));
        p.setData_entrada(Date.valueOf(formato.format(dataEntrada)));
        p.setQuantidade(10);
        p.setId(1);
        
        ProducaoImplements pi =  new ProducaoImplements();
        pi.update(p);
        
        
        
        
        
        
    }
}
