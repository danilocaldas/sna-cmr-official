/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.control;

import br.com.sna.model.service.PrestadorImplements;
import br.com.sna.model.dao.Prestador;
import br.com.sna.view.PrestadorFrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class PrestadorActionControl implements ControlInterface, ActionListener {

    List<Prestador> prestadores;
    private PrestadorFrm frm;
    private PrestadorImplements prestadorImplements;

    public PrestadorActionControl(PrestadorFrm frm) {
        this.frm = frm;
        prestadorImplements = new PrestadorImplements();
        attachListener();
    }

    @Override
    public void attachListener() {
        frm.getBtIncluirPrestador().addActionListener(this);
        frm.getBtPrepararAlterarPrestador().addActionListener(this);
        frm.getBtExcluirPrestador().addActionListener(this);
        frm.getBtSalvarPrestador().addActionListener(this);
        frm.getBtAlterarPrestador().addActionListener(this);
        frm.getBtFinalizarPrestador().addActionListener(this);
        frm.getBtPesquisarPrestador().addActionListener(this);
        frm.getBtLimpar().addActionListener(this);
    }

    @Override
    public void enableButtonsToSaveAction() {
        enableDisableButtonsToEdit(true);
    }

    @Override
    public void disableButtonsToSaveAction() {
        enableDisableButtonsToEdit(false);
    }

    @Override
    public void enableDisableButtonsToEdit(boolean enabled) {
        frm.getBtIncluirPrestador().setEnabled(!enabled);
        frm.getBtPrepararAlterarPrestador().setEnabled(!enabled);
        frm.getBtExcluirPrestador().setEnabled(!enabled);
        frm.getBtFinalizarPrestador().setEnabled(enabled);
    }

    @Override
    public void limparCampos() {
        frm.getTxtNomePrestador().setText("");
        frm.getFtxtCnes().setText("");
        frm.getLabelId().setText("");
    }

    @Override
    public void desabilitarCampoDoFrm() {
        frm.getTxtNomePrestador().setEnabled(false);
        frm.getFtxtCnes().setEnabled(false);
    }

    @Override
    public void habilitarCamposDoFrm() {
        frm.getTxtNomePrestador().setEnabled(true);
        frm.getFtxtCnes().setEnabled(true);
    }

    @Override
    public void prepararAlterar() {
        if (frm.getTbPrestador().getSelectedRow() != -1) {
            enableButtonsToSaveAction();
            habilitarCamposDoFrm();
            habilitarBtAlterar();
            desabilitarBtSalvar();
        } else {
            JOptionPane.showMessageDialog(frm, "Selecione um registro!",
                    "Alterar", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void preparaInserir() {
        enableButtonsToSaveAction();
        habilitarCamposDoFrm();
        habilitarBtSalvar();
        desabilitarBtAlterar();
    }

    public void habilitarBtSalvar() {
        frm.getBtSalvarPrestador().setEnabled(true);
    }

    public void desabilitarBtSalvar() {
        frm.getBtSalvarPrestador().setEnabled(false);
    }

    public void habilitarBtAlterar() {
        frm.getBtAlterarPrestador().setEnabled(true);
    }

    public void desabilitarBtAlterar() {
        frm.getBtAlterarPrestador().setEnabled(false);
    }

    @Override
    public void alterar() {
        if (verificarCampos()) {
            prestadorImplements.update(formToPrestador());
            JOptionPane.showMessageDialog(frm, "Prestador Alterado", "Alterar", JOptionPane.INFORMATION_MESSAGE);
            disableButtonsToSaveAction();
            limparCampos();
            desabilitarCampoDoFrm();
            limparTabela(prestadores);
            frm.searchPrestadores();
        }
    }

    @Override
    public void salvar() {
        if (verificarCampos()) {
            prestadorImplements.save(formToPrestador());
            JOptionPane.showMessageDialog(frm, "Prestador Salvo", "Salvar", JOptionPane.INFORMATION_MESSAGE);
            disableButtonsToSaveAction();
            limparCampos();
            desabilitarCampoDoFrm();
            limparTabela(prestadores);
            frm.searchPrestadores();
        }
    }

    @Override
    public void excluir() {
        if (frm.getTbPrestador().getSelectedRow() != -1) {
            prestadorImplements.delete(formToPrestador());
            JOptionPane.showMessageDialog(frm, "Prestador excluido", "Excluir", JOptionPane.INFORMATION_MESSAGE);
            disableButtonsToSaveAction();
            limparCampos();
            desabilitarCampoDoFrm();
            limparTabela(prestadores);
            frm.searchPrestadores();
        } else {
            JOptionPane.showMessageDialog(frm, "Selecione um registro!");
        }
    }

    public void limparTabela(List<Prestador> prestadores) {
        while (frm.tmPrestador.getRowCount() > 0) {
            frm.tmPrestador.removeRow(0);
        }
    }

    public Prestador formToPrestador() {
        Prestador prestador = new Prestador();

        if (!"".equals(frm.getLabelId().getText())) {
            prestador.setId(Long.parseLong(frm.getLabelId().getText()));
        }
        prestador.setNome(frm.getTxtNomePrestador().getText());
        prestador.setCnes(Integer.parseInt(String.valueOf(frm.getFtxtCnes().getText())));
        
        return prestador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Incluir")) {
            preparaInserir();
        } else if (e.getActionCommand().equals("Modificar")) {
            prepararAlterar();
        } else if (e.getActionCommand().equals("Excluir")) {
            excluir();
        } else if (e.getActionCommand().equals("Salvar")) {
            salvar();
            desabilitarBtSalvar();
        } else if (e.getActionCommand().equals("Alterar")) {
            alterar();
            desabilitarBtAlterar();
        } else if (e.getActionCommand().equals("Limpar")) {
            limparTabela(prestadores);
        } else if (e.getActionCommand().equals("Finalizar")) {
            desabilitarBtAlterar();
            desabilitarBtSalvar();
            disableButtonsToSaveAction();
            limparCampos();
            desabilitarCampoDoFrm();
        }
    }

    private boolean verificarCampos() {
        if (!frm.getTxtNomePrestador().getText().equals("") && !frm.getFtxtCnes().getText().equals("")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(frm, "Falta preencher algum campo no formulário!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
