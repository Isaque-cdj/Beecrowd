package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1008 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble(), salary = (horas * valorHora);
               
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", number, salary);
		 sc.close();
    }
}
