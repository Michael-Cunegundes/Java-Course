//package oo;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CursoAluno {
//
//    private final String nome;
//    private final List<AlunoCurso> alunos = new ArrayList<>();
//
//    public CursoAluno(String nome) {
//        this.nome = nome;
//    }
//
//    public void adicionarAluno(AlunoCurso aluno) {
//        if (aluno == null) return;
//        if (!alunos.contains(aluno)) {
//            alunos.add(aluno);
//        }
//        if (!aluno.getCursos().contains(this)) {
//            aluno.adicionarCurso(this);
//        }
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public List<AlunoCurso> getAlunos() {
//        return List.copyOf(alunos); // só leitura
//    }
//
//    @Override
//    public String toString() {
//        return "Curso{" + nome + ", alunos=" + alunos.stream()
//                .map(AlunoCurso::getNome).toList() + "}";
//    }
//
//
//    public static void main(String[] args) {
//        CursoAluno ads = new CursoAluno("ADS");
//        CursoAluno medicina = new CursoAluno("Medicina");
//
//        AlunoCurso michael = new AlunoCurso("Michael");
//        AlunoCurso naruto = new AlunoCurso("Naruto");
//
//        michael.adicionarCurso(ads);
//        michael.adicionarCurso(medicina);
//        medicina.adicionarAluno(naruto);
//
//        System.out.println(medicina);
//        System.out.println(michael);
//    }
//
//}
//
//
