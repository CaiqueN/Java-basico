package org.exercicio6;// Turma.java
import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno adicionado: " + aluno.getNome());
    }

    public void removerAluno(Aluno aluno) {
        if (alunos.remove(aluno)) {
            System.out.println("Aluno removido: " + aluno.getNome());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void listarAlunos() {
        System.out.println("\nLista de alunos da turma:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public static void main(String[] args) {
        Turma turmaA = new Turma();

        Aluno a1 = new Aluno("Caique", "001");
        Aluno a2 = new Aluno("Shirley", "002");
        Aluno a3 = new Aluno("Kaue", "003");
        Aluno a4 = new Aluno("Sir Cassio", "004");
        Aluno a5 = new Aluno("Rafa", "005");


        turmaA.adicionarAluno(a1);
        turmaA.adicionarAluno(a2);
        turmaA.adicionarAluno(a3);
        turmaA.adicionarAluno(a4);
        turmaA.adicionarAluno(a5);

        turmaA.listarAlunos();

        turmaA.removerAluno(a4);
        turmaA.removerAluno(a5);

        turmaA.listarAlunos();
        turmaA.adicionarAluno(a4);
        turmaA.adicionarAluno(a5);

        turmaA.listarAlunos();
    }
}

