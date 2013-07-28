/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.controller.implement;

/**
 *
 * @author Danilo
 */
public class Query {
    //CRUD FUNCIONARIO
    String cadastraFuncionario = "INSERT INTO FUNCIONARIO (NOME, SENHA) VALUES (?, ?)";
    String consultaFuncionario = "SELECT * FROM FUNCIONARIO WHERE NOME LIKE ?";
    String excluirFuncionario = "DELETE FROM FUNCIONARIO WHERE ID LIKE ?";
    String updateFuncionario = "UPDATE FUNCIONARIO SET NOME = ? ,SENHA = ? WHERE ID = ?";
    //CRUD PROCEDIMENTO
    String cadastraProcedimento = "INSERT INTO PROCEDIMENTO (CODIGO, NOME) VALUES (?, ?)";
    String consultaProcedimento = "SELECT * FROM PROCEDIMENTO WHERE NOME LIKE ?";
    String excluirProcedimento = "DELETE FROM PROCEDIMENTO WHERE CODIGO LIKE ?";
    String updateProcedimento = "UPDATE PROCEDIMENTO SET NOME = ?,CODIGO = ? WHERE ID = ?";
    //CRUD PRESTADOR
    String cadastraPrestador = "INSERT INTO PRESTADOR (CNES, NOME) VALUES (?, ?)";
    String consultaPrestador = "SELECT * FROM PRESTADOR WHERE NOME LIKE ?";
    String excluirPrestador = "DELETE FROM PRESTADOR WHERE CNES LIKE ?";
    String updatePrestador = "UPDATE PRESTADOR SET NOME = ?,CNES = ? WHERE ID = ?";
    //CRUD PRODUCAO
    String cadastraProducao = "INSERT INTO PRODUCAO (NOME_PROFISSIONAL, NOME_PRESTADOR, NOME_PROCEDIMENTO, DATA_DIGITACAO, DATA_ENTRADA, QUANTIDADE) VALUES (?, ?, ?, ?, ?, ?)";
    String consultaProducao = "SELECT * FROM FUNCIONARIO WHERE NOME LIKE ? AND NOME_PROFISSIONAL LIKE ?";
    String excluirProducao = "DELETE FROM PRODUCAO WHERE ID LIKE ? AND NOME_PROFISSIONAL LIKE ?";
    String updateProducao = "UPDATE PRODUCAO SET NOME_PROFISSIONAL = ?,NOME_PRESTADOR = ?,NOME_PROCEDIMENTO = ?, SET DATA_DIGITACAO = ?,"
            + "DATA_ENTRADA = ?,QUANTIDADE = ? WHERE ID = ?";
    //CRUD ARQUIVO
    String cadastraArquivo = "INSERT INTO CAIXA (NUMERO, ANO, MES, COR, PRESTADOR, PROCEDIMENTO) VALUES(?, ?, ?, ?, ?, ?)";
    String consultaArquivo = "SELECT * FROM CAIXA WHERE NUMERO LIKE ?, ANO LIKE = ? AND MES LIKE = ?";
    String excluirCaixa = "DELETE FROM CAIXA WHERE NUMERO LIKE ? AND ANO LIKE ?";
    String updateArquivo = "UPDATE FROM CAIXA SET ANO = ?,MES = ?,COR = ?,PRESTADOR = ?,PROCEDIMENTO = ? WHERE NUMERO = ?" ;
    //SOMA PRODUCAO
    String somaProducao = "SELECT SUM(quantidade) FROM PRODUCAO GROUP BY NOME_PROFISSIONAL LIKE ?";
}
