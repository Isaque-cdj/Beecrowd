package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1016 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int distanciaKm = sc.nextInt();
		int minutos = distanciaKm * 2;

		System.out.println(minutos + " minutos");

		sc.close();
	}
}
