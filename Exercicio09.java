package pacote02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
	
		// 9.Faça um Programa que leia três números e mostre-os em ordem decrescente.
		
		Integer[] vetor = new Integer[3];
		
		System.out.println("Informe o primeiro numero: ");
		Scanner scan =  new Scanner(System.in);
		vetor [0] = scan.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		Scanner scan2 = new Scanner(System.in);
		vetor [1] = scan.nextInt();
		
		System.out.println("Informe o terceiro numero: ");
		Scanner scan3 = new Scanner(System.in);
		vetor [2] = scan.nextInt();

		// ordenar / reversão / funcao pronta 
		Arrays.sort(vetor, Collections.reverseOrder());
			
		 for (int i=0;  i<3 ; i++ )  {
			 System.out.println(vetor[i]);
			 
	
		 }
		
		
		

	}
}

