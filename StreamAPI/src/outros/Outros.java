package outros;

import java.util.Arrays;
import java.util.List;

import filter.Aluno;

public class Outros {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("Eduardo", 10.0);
		Aluno a2 = new Aluno("Guilherme", 5.8);
		Aluno a3 = new Aluno("Bruna", 8.5);
		Aluno a4 = new Aluno("Luana", 9.7);
		Aluno a5 = new Aluno("Thiago", 7.3);
		Aluno a6 = new Aluno("Luna", 10.0);
		Aluno a7 = new Aluno("Thiago", 7.3);
		Aluno a8 = new Aluno("Victoria", 6.7);
		Aluno a9 = new Aluno("Luana", 9.7);
		Aluno a10 = new Aluno("Bruna", 8.5);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);

		System.out.println("Distinct");
		alunos.stream().distinct().forEach(System.out::println);
		;

		System.out.println("\nSkip/Limit");
		alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);

		System.out.println("\nTakeWhile");
		alunos.stream().distinct().skip(2).takeWhile(a -> a.getNota() >= 6).forEach(System.out::println);

	}
}
