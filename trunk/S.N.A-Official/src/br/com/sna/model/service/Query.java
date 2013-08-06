/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.model.service;

/**
 *
 * @author Danilo
 */
public class Query {
    //CRUD FUNCIONARIO
    String cadastraFuncionario = "INSERT INTO FUNCIONARIO (NOME, SENHA) VALUES (?, ?)";
    String consultaFuncionario = "SELECT * FROM FUNCIONARIO ORDER BY NOME ASC";
    String excluirFuncionario = "DELETE FROM FUNCIONARIO WHERE ID LIKE ?";
    String updateFuncionario = "UPDATE FUNCIONARIO SET NOME = ? ,SENHA = ? WHERE ID = ?";
    //CRUD PROCEDIMENTO
    String cadastraProcedimento = "INSERT INTO PROCEDIMENTO (CODIGO, NOME) VALUES (?, ?)";
    String consultaProcedimento = "SELECT * FROM PROCEDIMENTO ORDER BY NOME ASC";
    String excluirProcedimento = "DELETE FROM PROCEDIMENTO WHERE CODIGO LIKE ?";
    String updateProcedimento = "UPDATE PROCEDIMENTO SET NOME = ?,CODIGO = ? WHERE ID = ?";
    //CRUD PRESTADOR
    String cadastraPrestador = "INSERT INTO PRESTADOR (CNES, NOME) VALUES (?, ?)";
    String consultaPrestador = "SELECT * FROM PRESTADOR ORDER BY NOME ASC";
    String excluirPrestador = "DELETE FROM PRESTADOR WHERE CNES LIKE ?";
    String updatePrestador = "UPDATE PRESTADOR SET NOME = ?,CNES = ? WHERE ID = ?";
    //CRUD PRODUCAO
    String cadastraProducao = "INSERT INTO PRODUCAO (PROCEDIMENTO_NOME,PRESTADOR_NOME, FUNCIONARIO_NOME, DATA_DIGITACAO, DATA_ENTRADA, QUANTIDADE) VALUES (?, ?, ?, ?, ?, ?)";
    String consultaProducao = "SELECT * FROM FUNCIONARIO WHERE NOME LIKE ? AND NOME_PROFISSIONAL LIKE ?";
    String excluirProducao = "DELETE FROM PRODUCAO WHERE ID LIKE ? AND NOME_PROFISSIONAL LIKE ?";
    String updateProducao = "UPDATE PRODUCAO SET PROCEDIMENTO_NOME = ?,PRESTADOR_NOME = ?,FUNCIONARIO_NOME = ? ,DATA_DIGITACAO = ?,"
            + "DATA_ENTRADA = ?,QUANTIDADE = ? WHERE ID = ?";
    //CRUD ARQUIVO
    String cadastraArquivo = "INSERT INTO CAIXA (NUMERO, ANO, MES, COR, PRESTADOR_NOME, PROCEDIMENTO_NOME) VALUES(?, ?, ?, ?, ?, ?)";
    String consultaArquivo = "SELECT * FROM CAIXA WHERE NUMERO LIKE ?, ANO LIKE = ? AND MES LIKE = ?";
    String excluirCaixa = "DELETE FROM CAIXA WHERE NUMERO LIKE ? AND ANO LIKE ?";
    String updateArquivo = "UPDATE CAIXA SET ANO = ?,MES = ?,COR = ?,PRESTADOR_NOME = ?,PROCEDIMENTO_NOME = ? WHERE NUMERO = ?" ;
    //SOMA PRODUCAO
    String somaProducao = "SELECT SUM(quantidade) FROM PRODUCAO GROUP BY NOME_PROFISSIONAL LIKE ?";
}
