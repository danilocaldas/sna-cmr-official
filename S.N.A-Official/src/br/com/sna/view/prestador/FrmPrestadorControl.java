/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.view.prestador;

import br.com.sna.controller.implement.PrestadorImplements;
import br.com.sna.model.Prestador;
/**
 *
 * @author ritacosta
 */
public class FrmPrestadorControl {
    FrmPrestador frmPrestador;
    PrestadorImplements prestadorImplements;
    Prestador prestador;

    public FrmPrestadorControl() {
        frmPrestador = new FrmPrestador();
        prestadorImplements = new PrestadorImplements();
        prestador = new Prestador();
    }
    
    public void insertPrestador(){
        prestador.setNome(frmPrestador.getTxtNomePrestadot().getText());
        prestador.setCnes(Integer.parseInt(String.valueOf(frmPrestador.getTxtCnes().getValue())));
        prestadorImplements.save(prestador);
    }
    
}
