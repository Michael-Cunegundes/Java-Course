package exercicios2;

import java.util.Scanner;

public class Aluno1 {

    private String nomeAluno;
    private Double nota;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Aluno1(String nomeAluno, double nota) {
        this.nomeAluno = nomeAluno;
        this.nota = nota;
    }

    public String isAprovado(){
        if (nota >= 6){
            return nomeAluno + " esta Aprovado";
        } else {
            return nomeAluno + " esta reprovado";
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o nome do aluno?: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Qual a nota do aluno: ");
        Double nota = scanner.nextDouble();

        Aluno1 aluno1 = new Aluno1(nomeAluno,nota);

        System.out.print(aluno1.isAprovado());

        scanner.close();
    }
}
