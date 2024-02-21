package iniciante;

import java.io.IOException;
import java.util.Scanner;

/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.*/
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
