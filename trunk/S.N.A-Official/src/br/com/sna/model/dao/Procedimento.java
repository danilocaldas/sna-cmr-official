/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model.dao;

/**
 *
 * @author Danilo
 */
public class Procedimento extends Cadastro{

    private int codigo;
    
    public Procedimento() {
    }

    public Procedimento(long id, String nome) {
        super(id, nome);
    }

    public Procedimento(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Procedimento{" + "codigo=" + codigo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.codigo;
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
        final Procedimento other = (Procedimento) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
}
