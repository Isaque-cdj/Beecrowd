package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1020 {
	public static void main(String[] args) throws IOException {
		 
		Scanner sc = new Scanner(System.in);
	       
	       int a = sc.nextInt();
	       
	       int ano = a / 365;
	       a %= 365;
	       int mes = a / 30;
	       a %= 30;
	       int dia = a;
	       
	       System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", ano, mes, dia);
	        sc.close();
	    }
}
