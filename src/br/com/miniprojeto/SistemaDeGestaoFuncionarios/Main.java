package br.com.miniprojeto.SistemaDeGestaoFuncionarios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Funcionario funcionarioCLT = new FuncionarioCLT("João", "Tools", 1500.00);
        Funcionario funcionarioPJ = new FuncionarioPJ("Raul", "Opers", 1500.00);
        Funcionario estagiario = new Estagiario("Ravi", "Tools", 1300.00);

        empresa.adicionarFuncionario(funcionarioCLT);
        empresa.adicionarFuncionario(funcionarioPJ);
        empresa.adicionarFuncionario(estagiario);

        empresa.mostrarFuncionarios();


    }
}
