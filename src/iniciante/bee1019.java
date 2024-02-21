package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1019{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int n = a;
		
		int horas = n  / 3600;
		n %= 3600; 
		int minutos = n / 60;
		n %= 60;
		int segundos = n % 60;

		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

		sc.close();
	}
}
