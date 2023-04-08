// 13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
// Para homens: (72.7*h) - 58
// Para mulheres: (62.1*h) - 44.7

package IBMRJava;

import java.util.Scanner;

public class EX013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Você é home ou mulher?: ");
		String nome = sc.next();
		
		System.out.print("Qual sua altura? ");
		double altura = sc.nextDouble();
		
		if (nome.equals("homem")) {
			double peso_homem = (72.7 * altura) - 58;
		
			System.out.printf("Seu peso ideal é: %.2f", peso_homem);
			
		} else if (nome.equals("mulher")) {
			double peso_mulher = (62.1 * altura) - 58;
			
			System.out.printf("Seu peso ideal é: %.2f", peso_mulher);
		}
	}

}
