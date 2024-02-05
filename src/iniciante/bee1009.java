package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1009 {
	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(System.in);
		 String name = sc.next();
		 double  salary = sc.nextDouble(), vendas = sc.nextDouble();
		 
		 System.out.printf("TOTAL = R$ %.2f%n", salary + (vendas * 0.15));
		 sc.close();
    }
}
