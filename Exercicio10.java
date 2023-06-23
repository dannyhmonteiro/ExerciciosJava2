package pacote02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		

		// 10.Faça um Programa que pergunte em que turno você estuda. 
	    //	  Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
	    //	  Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
		
		System.out.println("Informe o turno em que você estuda: Digite M para matutino, V para vespertino ou"
				+ " N para noturno: ");
		Scanner scan = new Scanner(System.in);
		
		String turno = scan.nextLine();
		
		if (turno.equalsIgnoreCase("M")){
			System.out.println("Bom dia!");
		}
		
		else if (turno.equalsIgnoreCase("V")){
			System.out.println("Boa tarde!");
			
		}
	
		else if (turno.equalsIgnoreCase("N")){
	        System.out.println("Boa noite! ");
	        
		}
		
		else { 
			System.out.println(" Valor inválido!");
		}
		
	}
	

}
