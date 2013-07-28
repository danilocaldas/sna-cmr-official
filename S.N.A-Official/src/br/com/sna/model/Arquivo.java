/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model;

/**
 *
 * @author Danilo
 */
public class Arquivo {
    private Integer numero;
    private String ano;
    private String mes;
    private String cor;
    private String prestador;
    private String procedimento;

    public Arquivo() {
    }

    public Arquivo(Integer numero, String ano, String mes, String cor, String prestador, String procedimento) {
        this.numero = numero;
        this.ano = ano;
        this.mes = mes;
        this.cor = cor;
        this.prestador = prestador;
        this.procedimento = procedimento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPrestador() {
        return prestador;
    }

    public void setPrestador(String prestador) {
        this.prestador = prestador;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    @Override
    public String toString() {
        return "Arquivo{" + "numero=" + numero + ", ano=" + ano + ", mes=" + mes + ", cor=" + cor + ", prestador=" + prestador + ", procedimento=" + procedimento + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 73 * hash + (this.ano != null ? this.ano.hashCode() : 0);
        hash = 73 * hash + (this.mes != null ? this.mes.hashCode() : 0);
        hash = 73 * hash + (this.cor != null ? this.cor.hashCode() : 0);
        hash = 73 * hash + (this.prestador != null ? this.prestador.hashCode() : 0);
        hash = 73 * hash + (this.procedimento != null ? this.procedimento.hashCode() : 0);
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
        final Arquivo other = (Arquivo) obj;
        if (this.numero != other.numero && (this.numero == null || !this.numero.equals(other.numero))) {
            return false;
        }
        if ((this.ano == null) ? (other.ano != null) : !this.ano.equals(other.ano)) {
            return false;
        }
        if ((this.mes == null) ? (other.mes != null) : !this.mes.equals(other.mes)) {
            return false;
        }
        if ((this.cor == null) ? (other.cor != null) : !this.cor.equals(other.cor)) {
            return false;
        }
        if ((this.prestador == null) ? (other.prestador != null) : !this.prestador.equals(other.prestador)) {
            return false;
        }
        if ((this.procedimento == null) ? (other.procedimento != null) : !this.procedimento.equals(other.procedimento)) {
            return false;
        }
        return true;
    }
    
    
}
