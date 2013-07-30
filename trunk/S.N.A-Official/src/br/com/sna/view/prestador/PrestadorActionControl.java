/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.view.prestador;

import br.com.sna.controller.implement.PrestadorImplements;
import br.com.sna.model.Prestador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ritacosta
 */
public class PrestadorActionControl implements ActionListener{

    private FrmPrestador frm;
    private PrestadorImplements prestadorImplements;
    
    public PrestadorActionControl(FrmPrestador frm) {
        this.frm = frm;
        prestadorImplements = new PrestadorImplements();
        attackListener();
    }
    
    
    public void attackListener(){
        frm.getBtAlterarPrestador().addActionListener(this);
        frm.getBtSalvarPrestador().addActionListener(this);
        frm.getBtIncluirPrestador().addActionListener(this);
        frm.getBtExcluirPrestadot().addActionListener(this);
        frm.getBtFinalizarPrestador().addActionListener(this);
        frm.getBtPrepararAlterarPrestador().addActionListener(this);
        frm.getBtPesquisar().addActionListener(this);
        frm.getBtLimpar().addActionListener(this);
    }
    
    private void enableButtonsToSaveAction() {
        enableDisableButtonsToEdit(true);
    }

    private void disableButtonsToSaveAction() {
        enableDisableButtonsToEdit(false);
    }
    
    private void enableDisableButtonsToEdit(boolean enabled) {
        frm.getBtIncluirPrestador().setEnabled(!enabled);
        frm.getBtPrepararAlterarPrestador().setEnabled(!enabled);
        frm.getBtExcluirPrestadot().setEnabled(!enabled);
        frm.getBtAlterarPrestador().setEnabled(enabled);
        frm.getBtSalvarPrestador().setEnabled(enabled);
        frm.getBtFinalizarPrestador().setEnabled(enabled);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("Incluir")) {
            preparaInserirPrestador();
        } else if (event.getActionCommand().equals("Modificar")) {
            prepararAlterarPrestador();
        } else if (event.getActionCommand().equals("Excluir")) {
            excluir();
        } else if (event.getActionCommand().equals("Salvar")) {
            salvar();
        } else if (event.getActionCommand().equals("Alterar")) {
            alterar();
        } else if (event.getActionCommand().equals("Finalizar")) {
            disableButtonsToSaveAction();
            limparCampos();
            desabilitarCampoDoFrm();
        }
    }
    
    private void limparCampos() {
        frm.getTxtNomePrestadot().setText("");
        frm.getTxtCnes().setText("");
        frm.getLabelId().setText("");
    }

    private void desabilitarCampoDoFrm() {
        frm.getTxtNomePrestadot().setEnabled(false);
        frm.getTxtCnes().setEnabled(false);
    }

    private void habilitarCamposDoFrm() {
        frm.getTxtNomePrestadot().setEnabled(true);
        frm.getTxtCnes().setEnabled(true);
    }

    private void prepararAlterarPrestador() {
        if (frm.getTbPrestador().getSelectedRow() != -1) {
            enableButtonsToSaveAction();
            habilitarCamposDoFrm();
        } else {
            JOptionPane.showMessageDialog(frm, "Selecione um registro!", "Modificar", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void preparaInserirPrestador() {
        enableButtonsToSaveAction();
        habilitarCamposDoFrm();
    }

    private void alterar() {
        prestadorImplements.update(formToPrestador());
        JOptionPane.showMessageDialog(frm, "Prestador Alterado", "Alterar", JOptionPane.INFORMATION_MESSAGE);
        disableButtonsToSaveAction();
        limparCampos();
        desabilitarCampoDoFrm();
    }

    private void salvar() {
        prestadorImplements.save(formToPrestador());
        JOptionPane.showMessageDialog(frm, "Prestador salvo", "Salvar", JOptionPane.INFORMATION_MESSAGE);
        disableButtonsToSaveAction();
        limparCampos();
        desabilitarCampoDoFrm();
    }

    private void excluir() {
        if (frm.getTbPrestador().getSelectedRow() != -1) {
            prestadorImplements.delete(formToPrestador());
            JOptionPane.showMessageDialog(frm, "Prestador excluido", "Excluir", JOptionPane.INFORMATION_MESSAGE);
            disableButtonsToSaveAction();
            limparCampos();
            desabilitarCampoDoFrm();
        }else {
            JOptionPane.showMessageDialog(frm, "Selecione um registro!", "Excluir", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private Prestador formToPrestador() {

        Prestador prestador = new Prestador();
        if (!"".equals(frm.getLabelId().getText())) {
            prestador.setId(Long.parseLong(frm.getLabelId().getText()));
        }
        prestador.setNome(frm.getTxtNomePrestadot().getText());
        prestador.setCnes(Integer.parseInt(String.valueOf(frm.getTxtCnes().getText())));

        return prestador;
    }
    
   }
