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
    private String prestador_nome;
    private String procedimento_nome;

    public Arquivo() {
    }

    public Arquivo(Integer numero, String ano, String mes, String cor, String prestador_nome, String procedimento_nome) {
        this.numero = numero;
        this.ano = ano;
        this.mes = mes;
        this.cor = cor;
        this.prestador_nome = prestador_nome;
        this.procedimento_nome = procedimento_nome;
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

    public String getPrestador_nome() {
        return prestador_nome;
    }

    public void setPrestador_nome(String prestador_nome) {
        this.prestador_nome = prestador_nome;
    }

    public String getProcedimento_nome() {
        return procedimento_nome;
    }

    public void setProcedimento_nome(String procedimento_nome) {
        this.procedimento_nome = procedimento_nome;
    }

    @Override
    public String toString() {
        return "Arquivo{" + "numero=" + numero + ", ano=" + ano + ", mes=" + mes + ", cor=" + cor + ", prestador_nome=" + prestador_nome + ", procedimento_nome=" + procedimento_nome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 73 * hash + (this.ano != null ? this.ano.hashCode() : 0);
        hash = 73 * hash + (this.mes != null ? this.mes.hashCode() : 0);
        hash = 73 * hash + (this.cor != null ? this.cor.hashCode() : 0);
        hash = 73 * hash + (this.prestador_nome != null ? this.prestador_nome.hashCode() : 0);
        hash = 73 * hash + (this.procedimento_nome != null ? this.procedimento_nome.hashCode() : 0);
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
        if ((this.prestador_nome == null) ? (other.prestador_nome != null) : !this.prestador_nome.equals(other.prestador_nome)) {
            return false;
        }
        if ((this.procedimento_nome == null) ? (other.procedimento_nome != null) : !this.procedimento_nome.equals(other.procedimento_nome)) {
            return false;
        }
        return true;
    }
    
    
}
