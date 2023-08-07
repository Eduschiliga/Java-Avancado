package minMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import filter.Aluno;

public class MinMax {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Eduardo", 10.0);
		Aluno a2 = new Aluno("Guilherme", 5.8);
		Aluno a3 = new Aluno("Bruna", 8.5);
		Aluno a4 = new Aluno("Luana", 9.7);
		Aluno a5 = new Aluno("Thiago", 7.3);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if (aluno1.getNota() > aluno2.getNota()) {
				return 1;
			}
			if (aluno1.getNota() < aluno2.getNota()) {
				return -1;
			}
			return 0;
		};
		
		System.out.println("Melhor nota\n" + alunos.stream().max(melhorNota).get());
		System.out.println("\nPior nota\n" + alunos.stream().min(melhorNota).get());
	}
}
