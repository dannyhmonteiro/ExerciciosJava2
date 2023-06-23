package pacote02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//	3.Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
		//	Conforme a letra escrever: F - Feminino, M - Masculino ou Sexo Inválido.
			
	      System.out.println(" Informe F para feminino ou M para masculino: ");
	      Scanner scan = new Scanner(System.in);
	      
	      String sexo = scan.nextLine();
	      
	      if (sexo.equalsIgnoreCase("F")) {
	    	  System.out.println(" F-feminino");
	      }
	      else if (sexo.equalsIgnoreCase("M")) {
	    	  System.out.println("M-masculino "  );
	      }                   
	      else{
	    	  System.out.println("Sexo inválido");
	      }
			
		
		
		
		
		
	}

}
