package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class bee1036 {
	
	/*
	 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de
	 * Bhaskara. Se não for possível calcular as raízes, mostre a mensagem
	 * correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de
	 * numero negativo.
	 * 
	 * Entrada Leia três valores de ponto flutuante (double) A, B e C.
	 * 
	 * Saída Se não houver possibilidade de calcular as raízes, apresente a mensagem
	 * "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5
	 * dígitos após o ponto, com uma mensagem correspondente conforme exemplo
	 * abaixo. Imprima sempre o final de linha após cada mensagem.
	 */
	public static void main(String[] args) throws IOException {
		Locale.setDefault(new Locale("en", "US")); 
		Scanner sc = new Scanner(System.in);
		 
		 double  a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		 double delta = Math.pow(b , 2) - (4 * a * c);
		 
		 double r1 = (- b + Math.sqrt(delta)) / (2 * a);
		 double r2 = (- b - Math.sqrt(delta)) / (2 * a);
		  
		 if(delta < 0 || a == 0) {
			 System.out.println("Impossivel calcular");
		 } else {
			 System.out.printf("R1 = %.5f%nR2 = %.5f%n", r1, r2);
		 }
		 sc.close();
    }

}
