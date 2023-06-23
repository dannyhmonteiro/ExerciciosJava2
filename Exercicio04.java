package pacote02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
//		4.Faça um Programa que verifique se uma letra digitada é vogal ou consoante

			System.out.println("Informe uma letra do alfabeto: ");
			Scanner scan = new Scanner(System.in);
			
			String letra = scan.nextLine();

			if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
					letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || 
					letra.equalsIgnoreCase("u")) {
				System.out.println("Vogal");
				
			}else{
				System.out.println("Consoante");
			}
			

	}

}
