// 14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o 
// rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido 
// pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo
// excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. 
// Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá 
// pagar. Imprima os dados do programa com as mensagens adequadas.

package IBMRJava;
 
import java.util.Scanner;

public class EX014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o peso de peixes (em quilos): ");
        double peso = sc.nextDouble();
        
        if (peso > 50) {
            double excesso = peso - 50;
            double multa = excesso * 4;
            
            System.out.printf("Peso de peixes excedido em %.2f quilos.\n", excesso);
            System.out.printf("Valor da multa a ser paga: R$ %.2f\n", multa);
        } else {
            System.out.println("Peso dentro do limite permitido. Sem multa a ser paga.");
        }
        
        sc.close();
    }
}
