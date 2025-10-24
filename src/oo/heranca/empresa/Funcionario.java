package oo.heranca.empresa;

public class Funcionario {

    String nome;
    double salario;

    public Funcionario() {
    }

    double calcularPagamento(double bonus){
        salario = salario + bonus;
        return salario;

    }
}
