// 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

package IBMRJava;

import java.util.Scanner;

public class EX007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o valor do quadrado: ");
		int n = sc.nextInt();
		
		
		double qua = Math.pow(n, 2.0);
		
		
		System.out.printf("O valor da área do quadro é: "+ qua +" e o dobro dessa área é: " + qua*2);
		

	}

}
