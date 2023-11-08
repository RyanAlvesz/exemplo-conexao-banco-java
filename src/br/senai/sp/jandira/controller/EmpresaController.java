package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpresaController {

    public void consultarFuncionarios () throws SQLException {

        // Estabelecendo conexão com o banco
        Conexao conexao = new Conexao();

        // Representa a conexão com o banco de dados no Controller
        Connection objConnection = conexao.getConnection();

        // Responsável por executar o Query
        Statement statement = objConnection.createStatement();

        // Query
        String queryConsulta = "SELECT * FROM funcionario";

        // Armazena a resposta do Banco
        ResultSet resultSet = statement.executeQuery(queryConsulta);

        while (resultSet.next()){
            int idFuncionario = resultSet.getInt("id_funcionario");
            String nomeFuncionario = resultSet.getString("nome");
            String cargoFuncionario = resultSet.getString("cargo");
            Double salarioFuncionario = resultSet.getDouble("salario");
            String departamentoFuncionar = resultSet.getString("departamento");

            System.out.println(idFuncionario);
            System.out.println(nomeFuncionario);
            System.out.println(cargoFuncionario);
            System.out.println(salarioFuncionario);
            System.out.println(departamentoFuncionar);
            System.out.println("---------------------------------");
        }
    }

}
