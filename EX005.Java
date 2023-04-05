// 5. Faça um Programa que converta metros para centímetros.

package IBMRJava;


import EX005;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor em metros: ");
		int numero = input.nextInt();
		
		int n = numero * 100;
		
		System.out.printf("O valor em centimetro é igual a: %s", n);
		
	
		

	}

}
