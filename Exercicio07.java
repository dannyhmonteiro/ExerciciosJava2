package pacote02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
// 7.Faça um Programa que leia três números e mostre o maior e o menor deles.

			
		int [] vetor = new int[3];	
			
		System.out.println("Informe o primeiro número: ");
		Scanner scan = new Scanner(System.in);
		vetor[0] = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		Scanner scan1 = new Scanner(System.in);
		vetor[1] = scan.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		Scanner scan2 = new Scanner(System.in);
		vetor[2] = scan.nextInt();
		
		int maiorValor = 0;
		for (int i=0 ; i <=2; i++){
			System.out.println(vetor[i]);
			
			if (vetor[i] > maiorValor){
				maiorValor = vetor[i]; 
			}
			
		}
		
	  	System.out.println("O maior valor é: " + maiorValor);
		

	}

}
