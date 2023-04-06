// 10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

package IBMRJava;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double c = sc.nextDouble();
		
		double f = c * 9 / 5 + 32;
		
		System.out.print(" O temperatura em Fahrenheit é: " + f);

	}

}
