// 9. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
// C = 5 * ((F-32) / 9).

package IBMRJava;

import EX009;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Escreva a temperatura em Fahrenheit: ");
		int f = input.nextInt();
		
		int g = 5 * ((f - 32 ) / 9);
		
		System.out.printf("A temperatura em graus Celsius é: %sº", g);
		
		
	}

}
