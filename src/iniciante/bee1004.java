package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
* Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.   
* Entrada
* O arquivo de entrada contém 2 valores inteiros.
*/

public class bee1004 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int PROD = a * b;

		System.out.println("PROD = " + PROD);
		sc.close();
	}

}
