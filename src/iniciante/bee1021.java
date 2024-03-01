package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class bee1021 {
	public static void main(String[] args) throws IOException {

		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();

		double nota100 = n / 100;
		n %= 100;
		double n100 = Math.floor(nota100);

		double nota50 = n / 50;
		n %= 50;
		double n50 = Math.floor(nota50);

		double nota20 = n / 20;
		n %= 20;
		double n20 = Math.floor(nota20);

		double nota10 = n / 10;
		n %= 10;
		double n10 = Math.floor(nota10);

		double nota5 = n / 5;
		n %= 5;
		double n5 = Math.floor(nota5);

		double nota2 = n / 2;
		double n2 = Math.floor(nota2);

// Moedas 
		double moed1 = n / 1;
		n %= 1;
		double m1 = Math.floor(moed1);

		double moed50 = n / 0.50;
		n %= 0.50;
		double m50 = Math.floor(moed50);

		double moed25 = n / 0.25;
		n %= 0.25;
		double m25 = Math.floor(moed25);

		double moed10 = n / 0.10;
		n %= 0.10;
		double m10 = Math.floor(moed10);

		double moed5 = n / 0.05;
		n %= 0.05;
		double m5 = Math.floor(moed5);

		double moed1c = n / 0.01;
		double m1c = Math.floor(moed1c);

		System.out.printf("NOTAS:%n" + "%.0f nota(s) de R$ 100.00%n" + "%.0f nota(s) de R$ 50.00%n"
				+ "%.0f nota(s) de R$ 20.00%n" + "%.0f nota(s) de R$ 10.00%n" + "%.0f nota(s) de R$ 5.00%n"
				+ "%.0f nota(s) de R$ 2.00%n" + "MOEDAS:%n" + "%.0f moeda(s) de R$ 1.00%n"
				+ "%.0f moeda(s) de R$ 0.50%n" + "%.0f moeda(s) de R$ 0.25%n" + "%.0f moeda(s) de R$ 0.10%n"
				+ "%.0f moeda(s) de R$ 0.05%n" + "%.0f moeda(s) de R$ 0.01%n", n100, n50, n20, n10, n5, n2, m1, m50,
				m25, m10, m5, m1c);

		sc.close();
	}

}
