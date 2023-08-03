package map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
 * 1. Número para String Binária... 6 => "110"
 * 2. Inverter a String... "110" => "011"
 * 3. Converter de volta para Inteiro => "011" => 3
 * */

public class DesafioMap {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		UnaryOperator<String> inverterStr = (str) -> {
			return new StringBuilder(str).reverse().toString();
		};

		Function<String, Integer> convInt = (n) -> {
			return Integer.parseInt(n);
		};

		nums.stream().map(Integer::toBinaryString).map(inverterStr).map(convInt).forEach(System.out::println);
	}

}
