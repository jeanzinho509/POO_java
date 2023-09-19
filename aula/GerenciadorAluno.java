package aula2808;

	import java.util.ArrayList;
	import java.util.List;

	public class GerenciadorAluno implements AlunoDAO {
	    private List<Aluno> listaDeAlunos;

	    public GerenciadorAluno() {
	        listaDeAlunos = new ArrayList<>();
	    }

	    @Override
	    public boolean salvaAluno(Aluno aluno) {
	        return listaDeAlunos.add(aluno);
	    }

	    @Override
	    public List<Aluno> retornaListaAluno() {
	        return listaDeAlunos;
	    }

	    @Override
	    public boolean atualizaAluno(Aluno aluno) {
	        for (int i = 0; i < listaDeAlunos.size(); i++) {
	            if (listaDeAlunos.get(i).getId() == aluno.getId()) {
	                listaDeAlunos.set(i, aluno);
	                return false;
	            }
	        }
			return false;
	    }

	    @Override
	    public boolean deletaAluno(int id) {
	        return listaDeAlunos.removeIf(aluno -> aluno.getId() == id);
	    }
	}
