package minMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import filter.Aluno;

public class MinMax {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Eduardo", 10.0);
		Aluno a2 = new Aluno("Guilherme", 5.8);
		Aluno a3 = new Aluno("Bruna", 8.5);
		Aluno a4 = new Aluno("Luana", 9.7);
		Aluno a5 = new Aluno("Thiago", 7.3);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

		Comparator<Aluno> melhorNota = (a1, a2) -> {
			if(a1.getNota() > a2.getNota()) return 1;
		};
	}
}
