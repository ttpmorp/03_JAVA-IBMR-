// 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

package IBMRJava;

import java.util.Scanner;
import java.util.Locale;

public class EX006 {
  public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
	
		// Fórmula da área: area = π . raio2
		// Considere o valor de π = 3.14159
	  
		System.out.print("Digite o valor do raio de um círculo: ");
		Double raio_de_um_circulo = sc.nextDouble();
		
		double pi = 3.14159;
		double area = Math.pow(raio_de_um_circulo, 2.0);
		
		System.out.printf("O valor do raio desse círculo é: %.4f%n", pi * area);
		
		

	}

}
