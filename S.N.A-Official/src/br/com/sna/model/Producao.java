/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model;

import java.sql.Date;

/**
 *
 * @author Danilo
 */
public class Producao {
    private long id;
    private String nome_prestador;
    private String nome_profisional;
    private String nome_procedimento;
    private Date data_digitacao;
    private Date data_entrada;
    private Integer quantidade;

    public Producao() {
    }

    public Producao(long id, String nome_prestador, String nome_profisional, String nome_procedimento, Date data_digitacao, Date data_entrada, Integer quantidade) {
        this.id = id;
        this.nome_prestador = nome_prestador;
        this.nome_profisional = nome_profisional;
        this.nome_procedimento = nome_procedimento;
        this.data_digitacao = data_digitacao;
        this.data_entrada = data_entrada;
        this.quantidade = quantidade;
    }

    public Producao(String nome_prestador, String nome_profisional, String nome_procedimento) {
        this.nome_prestador = nome_prestador;
        this.nome_profisional = nome_profisional;
        this.nome_procedimento = nome_procedimento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_prestador() {
        return nome_prestador;
    }

    public void setNome_prestador(String nome_prestador) {
        this.nome_prestador = nome_prestador;
    }

    public String getNome_profisional() {
        return nome_profisional;
    }

    public void setNome_profisional(String nome_profisional) {
        this.nome_profisional = nome_profisional;
    }

    public String getNome_procedimento() {
        return nome_procedimento;
    }

    public void setNome_procedimento(String nome_procedimento) {
        this.nome_procedimento = nome_procedimento;
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
        return "Producao{" + "id=" + id + ", nome_prestador=" + nome_prestador + ", nome_profisional=" + nome_profisional + ", nome_procedimento=" + nome_procedimento + ", data_digitacao=" + data_digitacao + ", data_entrada=" + data_entrada + ", quantidade=" + quantidade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 47 * hash + (this.nome_prestador != null ? this.nome_prestador.hashCode() : 0);
        hash = 47 * hash + (this.nome_profisional != null ? this.nome_profisional.hashCode() : 0);
        hash = 47 * hash + (this.nome_procedimento != null ? this.nome_procedimento.hashCode() : 0);
        hash = 47 * hash + (this.data_digitacao != null ? this.data_digitacao.hashCode() : 0);
        hash = 47 * hash + (this.data_entrada != null ? this.data_entrada.hashCode() : 0);
        hash = 47 * hash + (this.quantidade != null ? this.quantidade.hashCode() : 0);
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
        if ((this.nome_prestador == null) ? (other.nome_prestador != null) : !this.nome_prestador.equals(other.nome_prestador)) {
            return false;
        }
        if ((this.nome_profisional == null) ? (other.nome_profisional != null) : !this.nome_profisional.equals(other.nome_profisional)) {
            return false;
        }
        if ((this.nome_procedimento == null) ? (other.nome_procedimento != null) : !this.nome_procedimento.equals(other.nome_procedimento)) {
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
