package finallY;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Informe um numero:");
			Integer num = entrada.nextInt();
			num = 7 / num;

			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalmente...");
			entrada.close();
		}

		System.out.println("Fim");
	}
}
