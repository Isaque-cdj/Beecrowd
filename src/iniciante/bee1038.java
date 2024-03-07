package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1038 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt(), quantity = sc.nextInt();
		double dog = 4.00, salada = 4.5, bacon = 5.0, torrada = 2.0, refri = 1.5;

		switch (cod) {
		case 1:
			double preco1 = (dog * quantity);
			System.out.printf("Total: R$ %.2f%n", preco1);
			break;
		case 2:
			double preco2 = (salada * quantity);
			System.out.printf("Total: R$ %.2f%n", preco2);
			break;
		case 3:
			double preco3 = (bacon * quantity);
			System.out.printf("Total: R$ %.2f%n", preco3);
			break;
		case 4:
			double preco4 = (torrada * quantity);
			System.out.printf("Total: R$ %.2f%n", preco4);
			break;
		case 5:
			double preco5 = (refri * quantity);
			System.out.printf("Total: R$ %.2f%n", preco5);
			break;
		}

		sc.close();
	}
}
