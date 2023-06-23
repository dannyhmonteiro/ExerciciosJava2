package pacote02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
	
		// 8.Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
		//	sabendo que a decisão é sempre pelo mais barato.

			int[] vetor = new int [3];
			
			System.out.println("Informe o preço do primeiro produto: ");
			Scanner scan = new Scanner(System.in);
			vetor[0]= scan.nextInt();
			
			System.out.println("Informe o preço do segundo produto: ");
			Scanner scan1 = new Scanner(System.in);
			vetor[1] = scan.nextInt();
			
			System.out.println("Informe o preço do terceiro produto: ");
			Scanner scan2 = new Scanner(System.in);
			vetor[2] = scan.nextInt();
			
			int menorValor = 100000;
			 for(int i=0 ; i<=2 ; i++ ) {
				 System.out.println (vetor[i]);
				 
				 if (vetor[i] < menorValor){
					 menorValor = vetor[i];
				 }
			 }
		
			 System.out.println(" Você deve comprar o :" + menorValor + " pois esta mais barato. ");

	}

}
