package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import filter.Aluno;

public class Reduce3 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Eduardo", 10.0);
		Aluno a2 = new Aluno("Guilherme", 5.8);
		Aluno a3 = new Aluno("Bruna", 8.5);
		Aluno a4 = new Aluno("Luana", 9.7);
		Aluno a5 = new Aluno("Thiago", 7.3);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

		Predicate<Aluno> aprovado = a -> a.getNota() >= 7.5;
		Function<Aluno, Double> getNota = a -> a.getNota();
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

		Media media = alunos.stream().filter(aprovado).map(getNota).reduce(new Media(), calcularMedia, combinarMedia);
	
		System.out.println("Media dos alunos aprovados: " + media.getValor());
	}
}
