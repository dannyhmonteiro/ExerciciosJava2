package pacote02;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
				
//		11.As Organizações Tabajara resolveram dar um aumento de salário aos 
//		seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.	
//	    Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
//	    salários até R$ 280,00 (incluindo) : aumento de 20%
//	    salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//	    salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//	    salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
//	    o salário antes do reajuste;
//	    o percentual de aumento aplicado;
//	    o valor do aumento;
//	    o novo salário, após o aumento.

		
		System.out.println(" Informe seu salário: ");
		Scanner scan = new Scanner(System.in);
	    double salario = scan.nextDouble();
		
		if ( salario <= 280 ) {
		    double reajuste = salario * 0.2;
		    double novoSalario = salario + reajuste;
			System.out.println("Salário antes do reajuste: " +salario);
			System.out.println("Porcentual de aumento de 20%!");
			System.out.println("Valor do aumento:" +reajuste);
			System.out.println("Novo salário após aumento: " +novoSalario);
		}
		 
		if (salario > 280 &&  salario <= 700) { 
		
			double reajuste = salario * 0.15;
			double novoSalario = salario +  reajuste;
			System.out.println("Salário antes do reajuste: " +salario);
			System.out.println("Porcentual de aumento de 15%! ");
			System.out.println("Valor do aumento:" +reajuste);
			System.out.println("Novo salário após aumento: " +novoSalario);
		}
	    
		if (salario > 700 && salario <= 1500) {
		
			double reajuste = salario * 0.10;
			double novoSalario = salario + reajuste;
			System.out.println("Salário antes do reajuste: " +salario);
			System.out.println("Porcentual de aumento de 10%!");
			System.out.println("Valor do aumento:" +reajuste);
			System.out.println("Novo salário após aumento: " );	
		}
		
		if (salario >= 1500) {
		
			double reajuste = salario * 0.05;
			double novoSalario = salario + reajuste;
			System.out.println("Salário antes do reajuste: " +salario);
			System.out.println("Porcentual de aumento de 5%!");
			System.out.println("Valor do aumento:" + reajuste);
			System.out.println("Novo salário após aumento: " +novoSalario);	
		}
		
		
	}
	

}
