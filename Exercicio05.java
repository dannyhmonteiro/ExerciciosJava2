package pacote02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//5.Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
		//o	A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
		//o	A mensagem "Reprovado", se a média for menor do que sete;
		//o	A mensagem "Aprovado com Distinção", se a média for igual a dez.

		   System.out.println("Informe a primeira nota:   ");
		   Scanner scan = new Scanner(System.in);
		   int nota1 = scan.nextInt();
		   
		   
		   System.out.println("Informe a segunda nota:  ");
		   Scanner scan1 = new Scanner(System.in);
		   int nota2 = scan.nextInt();
		   
		   int resultado = (  nota1 + nota2 ) / 2;
		   System.out.println(" A média é: " + resultado );
		   
		   if (resultado >= 7 ) {
		       System.out.println(" Aprovado!");
		   }
		   if (resultado < 7 ) {
		       System.out.println("Reprovado!");
		   
		   }
		   if (resultado == 10) {
			   System.out.println("Aprovado com Distinção!");
			   
		   }
		   	

	}

}
