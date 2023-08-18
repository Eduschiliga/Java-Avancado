/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comHeranca;

/**
 *
 * @author Eduardo
 */
public class CaixaNumeroTeste {
	public static void main(String[] args) {
		CaixaNumero<Double> caixaA = new CaixaNumero<>();

		caixaA.guardar(456.78);

		System.out.println(caixaA.abrir());
	}
	
}
