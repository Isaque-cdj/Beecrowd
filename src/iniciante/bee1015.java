package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1015 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble(), y1 = sc.nextDouble();
		double x2 = sc.nextDouble(), y2 = sc.nextDouble();
		double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.printf("%.4f%n", distancia);

		sc.close();
	}
}
