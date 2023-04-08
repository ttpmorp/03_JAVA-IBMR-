// 17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área 
// a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida 
// em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
// Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
// comprar apenas latas de 18 litros;
// comprar apenas galões de 3,6 litros;
// misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os 
// valores para cima, isto é, considere latas cheias.

package IBMRJava;

import java.util.Scanner;


public class EX017 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		
		//Dados variáveis
				float area, lata, litros;
				
				//Dados fixos
				int qtdlatas;
				
				final double cobertura_por_litro = 3.0;
				final double preco_lata = 80.0;
				final int capacidade_lata = 18;
				
				System.out.print("Quanto metro quadrado tem a área que deseja pintar? ");
				area = input.nextFloat();
		
		
		//Cálculo
				litros = (float) (area / cobertura_por_litro);
				lata = litros / capacidade_lata;
				qtdlatas = (int) Math.ceil(lata);
		

				
		
		
		System.out.printf("Você precisará comprar %d latas de tintas para pintar a área desejada%n", qtdlatas);
		System.out.printf("O valor total fica R$ %.2f%n", qtdlatas * preco_lata);
		
		
		

	}

}
