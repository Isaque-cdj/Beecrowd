package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1007 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
		int diferenca = (A * B) - (C * D);
		
		System.out.println("DIFERENCA = " + diferenca);
		sc.close();
	}
}
