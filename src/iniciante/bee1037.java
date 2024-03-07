package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
/*
Você deve fazer um programa que leia um valor qualquer e apresente uma 
mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, 
deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

Entrada
O arquivo de entrada contém um número com ponto flutuante qualquer.

Saída
A saída deve ser uma mensagem conforme exemplo abaixo.

*/

public class bee1037 {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();

		String msg;
        if (n >= 0 && n <= 25) {
            msg = "Intervalo [0,25]";
        } else if (n > 25 && n <= 50) {
            msg = "Intervalo (25,50]";
        } else if (n > 50 && n <= 75) {
            msg = "Intervalo (50,75]";
        } else if (n > 75 && n <= 100) {
            msg = "Intervalo (75,100]";
        } else {
            msg = "Fora de intervalo";
        }

        System.out.println(msg);


		sc.close();
	}

}
