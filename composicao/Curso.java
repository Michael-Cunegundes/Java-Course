<<<<<<< HEAD:src/oo/composicao/Curso.java
package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String nome;
    final List<Aluno>alunos = new ArrayList<>();

    Curso (String nome){
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

=======
package oo.composicao;

import colecoes.alunos;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String nome;
    final List<Aluno>alunos = new ArrayList<>();

    Curso (String nome){
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

>>>>>>> 79c0e9ce57b4a3d3003ee70b04c845f06244bcf7:composicao/Curso.java
}