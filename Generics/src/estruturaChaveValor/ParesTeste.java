/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaChaveValor;

/**
 *
 * @author Eduardo
 */
public class ParesTeste {

	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();

		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Jose");
		resultadoConcurso.adicionar(3, "Lucas");
		resultadoConcurso.adicionar(4, "Fernanda");
		resultadoConcurso.adicionar(2, "Eduardo");

		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
				System.out.println(resultadoConcurso.getValor(4));


	}

}
