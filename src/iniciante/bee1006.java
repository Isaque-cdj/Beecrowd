package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1006 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble();

		double media = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / (2.0 + 3.0 + 5.0);

		
		System.out.printf("MEDIA = %.1f%n", media);
		sc.close();
	}

}
