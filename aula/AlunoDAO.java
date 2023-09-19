package aula2808;

import java.util.List;

public interface AlunoDAO {
    boolean salvaAluno(Aluno aluno);
    List<Aluno> retornaListaAluno();
    boolean atualizaAluno(Aluno aluno);
    boolean deletaAluno(int id);
}
