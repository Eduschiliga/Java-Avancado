/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semGenerics;

/**
 *
 * @author Eduardo
 */
public class CaixaObjetoTeste {

	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.5); // double -> Double

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Hello, World!");

		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);

		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);

	}

}
