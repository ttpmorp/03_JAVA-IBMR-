// 8. Faça um Programa que pergunte quanto você ganha por hora e 
// o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

package IBMRJava;

import java.util.Scanner;

public class EX008 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

		
		System.out.print("Você trabalha por quantas horas?: ");
		int h = sc.nextInt();
		
		System.out.print("Salário recebido por hora: ");
		double s = sc.nextDouble();
		
		double salario = h * s;
		
		System.out.printf("Salário: R$ %.2f%n", salario);
		
		
		

	}

}
