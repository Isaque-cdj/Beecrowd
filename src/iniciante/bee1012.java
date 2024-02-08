package iniciante;

import java.io.IOException;
import java.util.Scanner;

/*
 * 	Escreva um programa que leia três valores com ponto flutuante 
 * 	de dupla precisão: A, B e C. Em seguida, calcule e mostre:
 * 
 * 	a) a área do triângulo retângulo que tem A por base e C por altura.
 * 	b) a área do círculo de raio C. (pi = 3.14159)
 * 	c) a área do trapézio que tem A e B por bases e C por altura.	
 * 	d) a área do quadrado que tem lado B.	
 * 	e) a área do retângulo que tem lados A e B.
 * 
 * 		Entrada
 * 
 * 	O arquivo de entrada contém três valores com um dígito após o ponto decimal.	
 * 
 * 	Saída
 * 
 * 	O arquivo de saída deverá conter 5 linhas de dados. 
 * 	Cada linha corresponde a uma das áreas descritas acima, 
 * 	sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. 
 * 	O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
*/
public class bee1012 {
	public static final double PI = 3.14159;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble(),
				b = sc.nextDouble(), 
				c = sc.nextDouble();
		
		double triangulo = (a * c) / 2;
		double circulo = PI * Math.pow(c, 2);
		double trapezio = ((a + b) * (c /2));
		double quadrado = Math.pow(b, 2);
		double retangulo = a * b;

		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",
				triangulo, circulo, trapezio, quadrado, retangulo);

		sc.close();
	}
}