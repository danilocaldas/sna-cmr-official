/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model;

/**
 *
 * @author Danilo
 */
public class Funcionario extends Cadastro{

    private String senha;

    public Funcionario() {
    }

    public Funcionario(long id, String nome) {
        super(id, nome);
    }
    
    public Funcionario(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "senha=" + senha + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.senha != null ? this.senha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if ((this.senha == null) ? (other.senha != null) : !this.senha.equals(other.senha)) {
            return false;
        }
        return true;
    }

}
