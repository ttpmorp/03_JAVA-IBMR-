// 12. Tendo como dados de entrada a altura de uma pessoa, construa
// um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

package IBMRJava;

import java.util.Scanner;

public class EX012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		double peso = (72.2 * altura) - 58.;
		
		System.out.printf("O peso ideal para a sua altura é: %.2f ", peso);

	}

}
