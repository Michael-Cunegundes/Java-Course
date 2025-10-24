package oo.heranca.empresa;

public class EmpresaTest {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Pedro", 3.000);

        System.out.println("Salario do " +gerente.nome + " " + gerente.salario);
        gerente.calcularPagamento(2.000);
        System.out.println("Salario doo " +gerente.nome + " + bonus:  " + gerente.salario);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Joao", 2.600);
        System.out.println("\nSalario do " + desenvolvedor.nome + " que trabalha com " + desenvolvedor.linguagem + " : " + desenvolvedor.salario);

        desenvolvedor.calcularPagamento(1.800);
        System.out.println("Salario do " + desenvolvedor.nome + " que trabalha com " + desenvolvedor.linguagem + " + bonus : " + desenvolvedor.salario);


    }
}
