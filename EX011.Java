// 11; Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
// o produto do dobro do primeiro com metade do segundo .
// a soma do triplo do primeiro com o terceiro.
// o terceiro elevado ao cubo.

package IBMRJava;

import java.util.Scanner;

public class EX011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pro1, soma, cubo;

        System.out.print("Escreva o número inteiro: ");
        int ni1 = sc.nextInt();

        System.out.print("Escreva outro número inteiro: ");
        int ni2 = sc.nextInt();

        System.out.print("Escreva um número real: ");
        double nr1 = sc.nextDouble();

        // Calcula o produto do dobro do primeiro número com metade do segundo número
        pro1 = (2 * ni1) * (ni2 / 2.0);
        soma = (3 * ni1) + (3 * nr1);
        cubo = Math.pow(nr1, 3.0);
        
        // Saída
        System.out.printf("O produto do dobro de %d com a metade de %d é: %.2f%n", ni1, ni2, pro1);
        System.out.printf("A soma do triplo do %d com o %.2f: %.2f%n", ni1, nr1, soma);
        System.out.printf("O número %.2f elevado ao cubo é igual a: %.2f%n", nr1, cubo);

        sc.close();
    }
}
