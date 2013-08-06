/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model.dao;

/**
 *
 * @author Danilo
 */
public class Prestador extends Cadastro{
    
    private int cnes;
    
    public Prestador() {
    }
    

    public Prestador(long id, String nome) {
        super(id, nome);
    }
    
    public Prestador(int cnes) {
        this.cnes = cnes;
    }

    public int getCnes() {
        return cnes;
    }

   

    public void setCnes(int cnes) {
        this.cnes = cnes;
    }

    @Override
    public String toString() {
        return "Prestador{" + "cnes=" + cnes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.cnes;
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
        final Prestador other = (Prestador) obj;
        if (this.cnes != other.cnes) {
            return false;
        }
        return true;
    }
    
    
}
