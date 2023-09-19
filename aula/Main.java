package aula2808;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlunoDAO gerenciador = new GerenciadorAluno();

        // Salva um aluno
        Aluno aluno1 = new Aluno(1, "João", 20);
        gerenciador.salvaAluno(aluno1);

        // Retorna a lista de alunos
        List<Aluno> listaDeAlunos = gerenciador.retornaListaAluno();
        for (Aluno aluno : listaDeAlunos) {
            System.out.println(aluno.getNome());
        }

        // Atualiza um aluno
        Aluno alunoAtualizado = new Aluno(1, "José", 21);
        gerenciador.atualizaAluno(alunoAtualizado);

        // Deleta um aluno
        gerenciador.deletaAluno(1);
    }
}
