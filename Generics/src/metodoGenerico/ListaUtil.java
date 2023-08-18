/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoGenerico;

import java.util.List;

/**
 *
 * @author Eduardo
 */
public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}

	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
}
