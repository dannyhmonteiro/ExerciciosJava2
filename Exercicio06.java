package pacote02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	
		// 6.Faça um Programa que leia três números e mostre o maior deles.
		
				int[] vetor = new int[3];
				
				System.out.println("Informe o primeiro número:");
				Scanner scan = new Scanner(System.in);
				vetor[0] = scan.nextInt();
				
				System.out.println("Informe o segundo número:");
				Scanner scan1 = new Scanner(System.in);	
				vetor[1] = scan1.nextInt();
				 
				System.out.println("Informe o terceiro número:");
				Scanner scan2 = new Scanner(System.in);
				vetor[2] = scan2.nextInt();
				
				
				int maior_valor = 0;
				for (int i=0 ; i <=2; i++) { // cria um loop de contagem de numeros 
					System.out.println(vetor[i]);
					
					if (vetor[i] > maior_valor) { // regra para compara quem e maior
						maior_valor = vetor[i]; // se for maior, troca o valor
					}
					
					
				}
				
				System.out.println("O maior valor e : " + maior_valor);

	}

}
