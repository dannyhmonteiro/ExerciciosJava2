package pacote02;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
	
//12.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
//que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado
//(é a empresa que deposita).
//O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
//o	Desconto do IR:
//o	Salário Bruto até 900 (inclusive) - isento
//o	Salário Bruto até 1500 (inclusive) - desconto de 5%
//o	Salário Bruto até 2500 (inclusive) - desconto de 10%
//o	Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo.
//No exemplo o valor da hora é 5 e a quantidade de hora é 220.
//		
		
		
  		System.out.println("Informe quanto ganha por hora: ");
  		Scanner scan = new Scanner(System.in);
  		double hora = scan.nextDouble();
  		
  		System.out.println("Informe quantas horas trabalha dor dia: ");
  		Scanner scan1 = new Scanner(System.in);
  		double dia = scan.nextDouble();
  		
  		System.out.println("Informe quantos dias trabalha por mês: ");
  		Scanner scan2 = new Scanner(System.in);
  		double mes = scan.nextDouble();
  		
  		double salario = hora * dia * mes ;
  		System.out.println(" Seu salário sera: " + salario);
  				
		if (salario <= 900 ) {
			double sindicato = salario * 0.03; 
			double fgts = salario * 0.11; // menos 11% do salario bruto
			double salarioLiquido = salario - sindicato;
			double descontos = sindicato + fgts;
			System.out.println(" Seu salário líquido será: " +salarioLiquido);
			System.out.println(" O valor a ser depositado pela empresa de FGTS será: " +fgts);
			System.out.println(" O total de descontos foi: " +descontos);
		}
		
		if (salario <= 1500 ) {
			double ir = salario * 0.05;
			double sindicato = salario * 0.03;
			double fgts = salario * 0.11;
			double salarioLiquido = salario - ir - sindicato;
			double descontos = ir + sindicato + fgts;
			System.out.println(" Seu salário líquido será: " +salarioLiquido);
			System.out.println("O valor a ser depositado pela empresa de FGTS será: " +fgts);
			System.out.println(" O total de descontos foi: " +descontos);
		}
		
		if (salario <=1500 ) {
			double ir = salario * 0.01;
			double sindicato = salario * 0.03;
			double fgts = salario * 0.11;
			double salarioLiquido = salario - ir - sindicato;
			double descontos = ir + sindicato + fgts;
			System.out.println(" Seu salário líquido será: " +salarioLiquido);
			System.out.println("O valor a ser depositado pela empresa de FGTS será: " +fgts);	
			System.out.println(" O total de descontos foi: " +descontos);
		}
		
		if (salario >= 2500) {
			double ir = salario * 0.2;
			double sindicato = salario * 0.03;
			double fgts = salario * 0.11;
			double salarioLiquido = salario - ir - sindicato;
			double descontos = ir + sindicato + fgts;
			System.out.println(" Seu salário líquido será: " +salarioLiquido);
			System.out.println("O valor a ser depositado pela empresa de FGTS será: " +fgts);
			System.out.println(" O total de descontos foi: " +descontos);
		}
	}

}
