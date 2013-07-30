/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.view.funcionario;

import br.com.sna.controller.implement.FuncionarioImplements;
import br.com.sna.model.Funcionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class FuncionarioActionControl implements ActionListener {

    private FuncionarioFrm frm;
    private FuncionarioImplements funcionarioImplements;

    public FuncionarioActionControl(FuncionarioFrm frm) {
        this.frm = frm;
        funcionarioImplements = new FuncionarioImplements();
        attachListener();
    }

    public void attachListener() {
        frm.getBtPrepararAlterarFuncionario().addActionListener(this);
        frm.getBtAlterar().addActionListener(this);
        frm.getBtIncluirFuncionario().addActionListener(this);
        frm.getBtExcluirFuncionario().addActionListener(this);
        frm.getBtFinalizarFuncionario().addActionListener(this);
        frm.getBtSalvarFuncionario().addActionListener(this);
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
        frm.getBtIncluirFuncionario().setEnabled(!enabled);
        frm.getBtPrepararAlterarFuncionario().setEnabled(!enabled);
        frm.getBtExcluirFuncionario().setEnabled(!enabled);
        frm.getBtAlterar().setEnabled(enabled);
        frm.getBtSalvarFuncionario().setEnabled(enabled);
        frm.getBtFinalizarFuncionario().setEnabled(enabled);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("Incluir")) {
            preparaInserirFuncionario();
        } else if (event.getActionCommand().equals("Modificar")) {
            prepararAlterarFuncionario();
        } else if (event.getActionCommand().equals("Excluir")) {
            excluir();
        } else if (event.getActionCommand().equals("Salvar")) {
            salvar();
        } else if (event.getActionCommand().equals("Alterar")) {
            alterar();
        } else if (event.getActionCommand().equals("Limpar")) {
           
        } else if (event.getActionCommand().equals("Finalizar")) {
            disableButtonsToSaveAction();
            limparCampos();
            desabilitarCampoDoFrm();
        }
    }
    
    private void limparCampos() {
        frm.getTxtNomeFuncionario().setText("");
        frm.getPtxtSenhaFuncionario().setText("");
        frm.getLabelId().setText("");
    }

    private void desabilitarCampoDoFrm() {
        frm.getTxtNomeFuncionario().setEnabled(false);
        frm.getPtxtSenhaFuncionario().setEnabled(false);
    }

    private void habilitarCamposDoFrm() {
        frm.getTxtNomeFuncionario().setEnabled(true);
        frm.getPtxtSenhaFuncionario().setEnabled(true);
    }

    private void prepararAlterarFuncionario() {
        if (frm.getTbFuncionario().getSelectedRow() != -1) {
            enableButtonsToSaveAction();
            habilitarCamposDoFrm();
        } else {
            JOptionPane.showMessageDialog(frm, "Selecione um registro!", "Modificar", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void preparaInserirFuncionario() {
        enableButtonsToSaveAction();
        habilitarCamposDoFrm();
    }

    private void alterar() {
        funcionarioImplements.update(formToFuncionario());
        JOptionPane.showMessageDialog(frm, "Funcionario Alterado", "Alterar", JOptionPane.INFORMATION_MESSAGE);
        disableButtonsToSaveAction();
        limparCampos();
        desabilitarCampoDoFrm();
    }

    private void salvar() {
        funcionarioImplements.save(formToFuncionario());
        JOptionPane.showMessageDialog(frm, "Funcionario salvo", "Salvar", JOptionPane.INFORMATION_MESSAGE);
        disableButtonsToSaveAction();
        limparCampos();
        desabilitarCampoDoFrm();
    }

    private void excluir() {
        if (frm.getTbFuncionario().getSelectedRow() != -1) {
            funcionarioImplements.delete(formToFuncionario());
            JOptionPane.showMessageDialog(frm, "Funcionario excluido", "Excluir", JOptionPane.INFORMATION_MESSAGE);
            disableButtonsToSaveAction();
            limparCampos();
            desabilitarCampoDoFrm();
        }else {
            JOptionPane.showMessageDialog(frm, "Selecione um registro!", "Excluir", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private Funcionario formToFuncionario() {

        Funcionario funcionario = new Funcionario();
        if (!"".equals(frm.getLabelId().getText())) {
            funcionario.setId(Long.parseLong(frm.getLabelId().getText()));
        }
        funcionario.setNome(frm.getTxtNomeFuncionario().getText());
        funcionario.setSenha(frm.getPtxtSenhaFuncionario().getText());

        return funcionario;
    }
    /**
     * private void searchFuncionario() { if(frm.getTxtPesquisar().equals("")){
     * JOptionPane.showMessageDialog(null, "Campo necessário para a pesquisa!");
     * }else{ funcionarios = funcionarioImplements.listaFuncionario("%" +
     * frm.getTxtNomeFuncionario().getText().trim() + "%");
     * mostrarProfissionais(funcionarios); } }
     *
     * private void mostrarProfissionais(List<Funcionario> funcionarios) { while
     * (tmFuncionario.getRowCount() < 0) { tmFuncionario.removeRow(0); } if
     * (funcionarios.size() == 0) { JOptionPane.showMessageDialog(null, "Não foi
     * encontrado nenhum registro!"); } else { String[] campos = new
     * String[]{null, null, null}; for (int i = 0; i < funcionarios.size(); i++)
     * { tmFuncionario.addRow(campos);
     * tmFuncionario.setValueAt(funcionarios.get(i).getId(), i, 0);
     * tmFuncionario.setValueAt(funcionarios.get(i).getNome(), i, 1);
     * tmFuncionario.setValueAt(funcionarios.get(i).getSenha(), i, 2); } } }
     */
}
