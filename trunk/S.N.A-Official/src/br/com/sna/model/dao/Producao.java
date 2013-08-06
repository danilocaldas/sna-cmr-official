/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model.dao;

import java.sql.Date;

/**
 *
 * @author Danilo
 */
public class Producao {
    private long id;
    private String prestador_nome;
    private String profisional_nome;
    private String procedimento_nome;
    private Date data_digitacao;
    private Date data_entrada;
    private Integer quantidade;

    public Producao() {
    }

    public Producao(String prestador_nome, String profisional_nome, String procedimento_nome, Date data_digitacao, Date data_entrada, Integer quantidade) {
        this.prestador_nome = prestador_nome;
        this.profisional_nome = profisional_nome;
        this.procedimento_nome = procedimento_nome;
        this.data_digitacao = data_digitacao;
        this.data_entrada = data_entrada;
        this.quantidade = quantidade;
    }
    

    public Producao(long id, String prestador_nome, String profisional_nome, String procedimento_nome, Date data_digitacao, Date data_entrada, Integer quantidade) {
        this.id = id;
        this.prestador_nome = prestador_nome;
        this.profisional_nome = profisional_nome;
        this.procedimento_nome = procedimento_nome;
        this.data_digitacao = data_digitacao;
        this.data_entrada = data_entrada;
        this.quantidade = quantidade;
    }

    public Producao(String prestador_nome, String profisional_nome, String procedimento_nome) {
        this.prestador_nome = prestador_nome;
        this.profisional_nome = profisional_nome;
        this.procedimento_nome = procedimento_nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrestador_nome() {
        return prestador_nome;
    }

    public void setPrestador_nome(String prestador_nome) {
        this.prestador_nome = prestador_nome;
    }

    public String getProfisional_nome() {
        return profisional_nome;
    }

    public void setProfisional_nome(String profissional_nome) {
        this.profisional_nome = profissional_nome;
    }

    public String getProcedimento_nome() {
        return procedimento_nome;
    }

    public void setProcedimento_nome(String procedimento_nome) {
        this.procedimento_nome = procedimento_nome;
    }

    public Date getData_digitacao() {
        return data_digitacao;
    }

    public void setData_digitacao(Date data_digitacao) {
        this.data_digitacao = data_digitacao;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Producao{" + "id=" + id + ", prestador_nome=" + prestador_nome + ", profisional_nome=" + profisional_nome + ", procedimento_nome=" + procedimento_nome + ", data_digitacao=" + data_digitacao + ", data_entrada=" + data_entrada + ", quantidade=" + quantidade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + (this.prestador_nome != null ? this.prestador_nome.hashCode() : 0);
        hash = 97 * hash + (this.profisional_nome != null ? this.profisional_nome.hashCode() : 0);
        hash = 97 * hash + (this.procedimento_nome != null ? this.procedimento_nome.hashCode() : 0);
        hash = 97 * hash + (this.data_digitacao != null ? this.data_digitacao.hashCode() : 0);
        hash = 97 * hash + (this.data_entrada != null ? this.data_entrada.hashCode() : 0);
        hash = 97 * hash + (this.quantidade != null ? this.quantidade.hashCode() : 0);
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
        final Producao other = (Producao) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.prestador_nome == null) ? (other.prestador_nome != null) : !this.prestador_nome.equals(other.prestador_nome)) {
            return false;
        }
        if ((this.profisional_nome == null) ? (other.profisional_nome != null) : !this.profisional_nome.equals(other.profisional_nome)) {
            return false;
        }
        if ((this.procedimento_nome == null) ? (other.procedimento_nome != null) : !this.procedimento_nome.equals(other.procedimento_nome)) {
            return false;
        }
        if (this.data_digitacao != other.data_digitacao && (this.data_digitacao == null || !this.data_digitacao.equals(other.data_digitacao))) {
            return false;
        }
        if (this.data_entrada != other.data_entrada && (this.data_entrada == null || !this.data_entrada.equals(other.data_entrada))) {
            return false;
        }
        if (this.quantidade != other.quantidade && (this.quantidade == null || !this.quantidade.equals(other.quantidade))) {
            return false;
        }
        return true;
    }
}
