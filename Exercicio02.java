package pacote02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	
//		2.Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo
		
			System.out.println("Informe um valor: ");
			Scanner scan = new Scanner(System.in);
	        int valor = scan.nextInt();
			
		
			
			if (valor > 0) { //maior
			    System.out.println("O número: "  + valor + " é positivo" );
			} else if (valor < 0) { //menor
			    System.out.println("O número: " + valor + " é negativo" );
			}
			
			
		
		}

	}


	