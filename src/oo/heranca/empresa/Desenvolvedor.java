package oo.heranca.empresa;

public class Desenvolvedor extends Funcionario {


    String linguagem = "Java";

    public Desenvolvedor( String nome ,double salario){
        this.nome = nome;
        this.salario = salario;

    }

    @Override
    double calcularPagamento(double bonus) {
        return super.calcularPagamento(bonus);
    }
}
