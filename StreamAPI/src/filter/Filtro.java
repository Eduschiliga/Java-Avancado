package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtro {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana Beatriz", 7.8);
		Aluno a2 = new Aluno("Pedro Souza", 5.4);
		Aluno a3 = new Aluno("Julio Silva", 6.3);
		Aluno a4 = new Aluno("Maria de Oliveira", 7.1);
		Aluno a5 = new Aluno("Eduardo Schiliga", 10.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

		Predicate<Aluno> aprovado = (a) -> a.getNota() >= 7.5;
		Function<Aluno, String> saudacao = (a) -> "Parabens " + a.getNome() + " voce foi aprovado";

		alunos.stream().filter(aprovado).map(saudacao).forEach(System.out::println);
		;
	}
}
