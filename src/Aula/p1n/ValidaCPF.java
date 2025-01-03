package Aula.p1n;

import java.util.Scanner;

public class ValidaCPF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF (somente números): ");
        String cpf = scanner.nextLine();        
        String cpf2 = cpf; 
        
     // Remove todos os caracteres não numéricos.
        
        cpf = cpf.replaceAll("[^0-9]", ""); 
       
        if (isCPF(cpf) && validarCPF(cpf)) {
        	
            System.out.println("o CPF "+cpf2+" é um CPF válido,sua forma em long é: "+toLong(cpf));
       
        } else {
        	
            System.out.println("CPF inválido!");
            
          }
        
        scanner.close();
        
    }

    public static boolean validarCPF(String cpf) {

        int soma = 0;
        
     // valida o digito na 10º posição
        
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }
        if (Integer.parseInt(cpf.substring(9, 10)) != digito1) {
            return false;
        }
        //
        																	
        soma = 0;
        
     // valida o digito na 11º posição
        
        for (int i = 0; i < 10; i++) {
        	
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * (11 - i);
        
        }
        
        int digito2 = 11 - (soma % 11);
        
        if (digito2 > 9) {
            digito2 = 0;
        }

        return Integer.parseInt(cpf.substring(10, 11)) == digito2;

    }
 
    public static long toLong(String cpf) {
        
    	long b = Long.parseLong(cpf);

        return b;
        
    }
    

    
    public static boolean isCPF(String cpf) {
        
    	  if (cpf == null || cpf.length() != 11) {
    		  
              return false;
              
    	  }

    return true;
    
    }
}