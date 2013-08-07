/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.control;

import br.com.sna.view.FuncionarioFrm;
import br.com.sna.view.PrestadorFrm;
import br.com.sna.view.Principal;
import br.com.sna.view.ProcedimentoFrm;
import br.com.sna.view.ProducaoFrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Danilo
 */
public class PrincipalActionControl implements ActionListener {

    private Principal frm;

    public PrincipalActionControl(Principal frm) {
        this.frm = frm;
        attachListener();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getActionCommand().equals("Funcionários")){
            abrirFuncionario();
        }else if(event.getActionCommand().equals("Prestadores")){
            abrirPrestador();
        }else if(event.getActionCommand().equals("Procedimentos")){
            abrirProcedimentos();
        }else if (event.getActionCommand().equals("Produção")){
            abrirProducao();
        }
    }

    private void attachListener() {
        frm.getMenuFuncionarios().addActionListener(this);
        frm.getMenuPrestadores().addActionListener(this);
        frm.getMenuProcedimentos().addActionListener(this);
        frm.getMenuProducao().addActionListener(this);
    }
    
    private void abrirProcedimentos(){
        ProcedimentoFrm procedimentoFrm = new ProcedimentoFrm();
        procedimentoFrm.setVisible(true);
        procedimentoFrm.setLocationRelativeTo(null);
        procedimentoFrm.setResizable(false);
    }
    
    private void abrirPrestador(){
        PrestadorFrm prestadorFrm = new PrestadorFrm();
        prestadorFrm.setVisible(true);
        prestadorFrm.setLocationRelativeTo(null);
        prestadorFrm.setResizable(false);
    }
    
    private void abrirFuncionario(){
        FuncionarioFrm funcionarioFrm = new FuncionarioFrm();
        funcionarioFrm.setVisible(true);
        funcionarioFrm.setLocationRelativeTo(null);
        funcionarioFrm.setResizable(false);
    }
    
    private void abrirProducao(){
        ProducaoFrm producaoFrm = new ProducaoFrm();
        producaoFrm.setVisible(true);
        producaoFrm.setLocationRelativeTo(null);
        producaoFrm.setResizable(false);
    }
}
