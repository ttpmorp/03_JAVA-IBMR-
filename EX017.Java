// 17. Faça um programa para uma loja de tintas. O programa deverá
// pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 3
// metros quadrados e que a tinta é vendida em latas de 18
// litros, que custam R$ 80,00. Informe ao usuário a quantidades
// de latas de tinta a serem compradas e o preço total.

package IBMRJava;

import java.util.Scanner;

public class EX017 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // pede o tamanho em metros quadrados da área a ser pintada
        System.out.print("Tamanho em metros quadrados da área a ser pintada: ");
        double area = sc.nextDouble();
        
        // calcula a quantidade de litros de tinta necessária com 10% de folga
        double litros = Math.ceil(area * 1.1 / 6);
        
        // opção 1: comprar apenas latas de 18 litros
        int latas = (int) Math.ceil(litros / 18);
        double precoLatas = latas * 80.0;
        
        // opção 2: comprar apenas galões de 3,6 litros
        int galoes = (int) Math.ceil(litros / 3.6);
        double precoGaloes = galoes * 25.0;
        
        // opção 3: misturar latas e galões
        int latasMistura = (int) (litros / 18);
        double litrosRestantes = litros - latasMistura * 18;
        int galoesMistura = (int) Math.ceil(litrosRestantes / 3.6);
        double precoMistura = latasMistura * 80.0 + galoesMistura * 25.0;
        
        // mostra os resultados
        System.out.println("Quantidade de tinta necessária: " + litros + " litros");
        System.out.println("Opção 1: " + latas + " lata(s) de 18 litros por R$ " + precoLatas);
        System.out.println("Opção 2: " + galoes + " galão(ões) de 3,6 litros por R$ " + precoGaloes);
        System.out.println("Opção 3: " + latasMistura + " lata(s) de 18 litros e " + galoesMistura + " galão(ões) de 3,6 litros por R$ " + precoMistura);
        
        sc.close();
    }
}
