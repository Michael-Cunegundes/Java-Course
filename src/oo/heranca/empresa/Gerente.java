package oo.heranca.empresa;

public class Gerente extends Funcionario {


    public Gerente(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    double calcularPagamento(double bonus) {
        return super.calcularPagamento(bonus);
    }
}
