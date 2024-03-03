package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.*/

public class bee1021 {
	public static void main(String[] args) throws IOException {

		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();
		int[]  notas = {100, 50, 20, 10, 5, 2};
		int[] moedas = {100, 50, 25, 10, 5, 1};
		
		System.out.println("NOTAS:");
		for (int i = 0; i < notas.length; i++) {
		    int quantidadeNotas = (int) (n / notas[i]);
		    System.out.println(quantidadeNotas+ " nota(s) de R$ " + notas[i] + ".00");
		    n -= quantidadeNotas * notas[i];
		}
		double restante = n * 100;
		
		System.out.println("MOEDAS:");
		for (int i = 0; i < moedas.length; i++) {
		    int quantidadeMoedas = (int) (restante / moedas[i]);
		    System.out.println(quantidadeMoedas + " moeda(s) de R$ " + String.format("%.2f", moedas[i] / 100.0));
		    restante -= quantidadeMoedas * moedas[i];
		}

		sc.close();
	}

}
