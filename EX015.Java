// 15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
//+ Salário Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
// - Sindicato ( 5%) : R$
// = Salário Liquido : R$
// Obs.: Salário Bruto - Descontos = Salário Líquido.

package IBMRJava;

import java.util.Scanner;

public class EX015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double imposto, inss, sindicato, salario_liquido, salario_bruto;
		
		System.out.print("Quanto você ganha por hora? R$");
		double salario_hora = sc.nextInt();
		
		System.out.print("Quantas horas você trabalha por dia? ");
		int hora_trabalhada = sc.nextInt();
	
		
		
		// Calculo do salário bruto através das horas trabalhadas
		salario_bruto = salario_hora * (hora_trabalhada * 30);
	
		
		// Descontos do salário
		imposto = (100 * 11) / 100;
		inss = (100 * 8) / 100;
		sindicato = (100 * 5) / 100;
		
		salario_liquido = salario_bruto - (imposto + inss + sindicato);
		
		// Saída de dados
		System.out.printf("Seu salário BRUTO é R$%.2f e por conta dos descontos do impost, INSS e Sindicato, seu salário LÍQUIDO é igual a R$%.2f%n", salario_bruto, salario_liquido);
		

	}

}
