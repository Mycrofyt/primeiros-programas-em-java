package Aula.p1n;

import java.util.Scanner;

public class Leitura {
	public static Scanner bob;  
	public static char index;
	public static char letterCount[];
	public static void main(String[] args) {
        
	    bob = new Scanner(System.in);
		
		String line; 
		System.out.print("Digite o nome: ");
		line = bob.nextLine(); // Le uma linha por vez
		int location; 
		char letter;
		
		while (line != "não"){ // Enquando houver linhas a serem lidas
		
		for (location =0; location<line.length(); location++){
		
			letter = line.charAt(location);
			if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
		// 2o truque
				index = (char) (letter - 'A');
				System.out.print("Digite o nome: "+ index+"\n\n");
				letterCount[(int)index] = (char) index;
			}	
		}
		
		line = bob.nextLine(); // Lê a próxima linha
		
		}
		
		for (index = 0; index < letterCount.length; index++){
			
		System.out.println("The total number of "+ (char) (index + (int) 'A')
				
		+ "’s is "+ letterCount[index]);
		
		}

	}

}
