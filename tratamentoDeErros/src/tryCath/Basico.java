package tryCath;

import assets.Aluno;

public class Basico {
	public static void main(String[] args) {
		Aluno a1 = null;

		try {
			imprimirNomeAluno(a1);
		} catch (Exception e) {
			System.out.println(":( Ocorreu um erro no momento de IMPRIMIR o NOME do USER!!!");
		}

		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println(":( Ocorreu o erro: " + e.getMessage());
		}

		System.out.println("Fim :)");
	}

	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.getNome());
	}
}
