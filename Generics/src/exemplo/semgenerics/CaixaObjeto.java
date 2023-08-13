/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.semgenerics;

/**
 *
 * @author Eduardo
 */
public class CaixaObjeto {
	private Object coisa;

	public void guardar(Object coisa) {
		this.coisa = coisa;	
	}

	public Object abrir() {
		return coisa;
	}

	
}
