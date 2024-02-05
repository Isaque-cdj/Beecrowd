package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1010 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int codPeca1 = sc.nextInt(), unidadePeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		
		int codPeca2 = sc.nextInt(), unidadePeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		double total = (valorPeca1 * unidadePeca1) +(valorPeca2 * unidadePeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		sc.close();
	}
}
