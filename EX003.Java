// 3. Faça um Programa que peça dois números e imprima a soma.

package IBMRJava;

import java.util.Scanner;

public class EX003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	
		
		System.out.println("Digite dois números: ");
		System.out.print("Número 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Número 2: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("A soma dos dois números é: " + soma);
		
		
	}

}
