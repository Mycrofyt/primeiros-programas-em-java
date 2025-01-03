package Aula.p1n;

import java.util.Scanner;

public class ValidaData {
    
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data no molde -> (****/**/**), primeiro o ano, então o mes e em seguida o dia /n/n");
        
        int mesInt = 0;
        
        // Definição do ano
        
        System.out.println("Ano: ");
        String ano = scanner.nextLine();

        
        
        while(true!=isAno(ano)) {
        	
            System.out.println("Ano invalido, por favor, tente novamente: ");
            ano = scanner.nextLine();        	
        	
        }
        
        // Definição do mês
        
        System.out.println("Mês: ");
        String mês = scanner.nextLine();
        mês = mês.replaceAll("[^0-9]", "");
        mesInt = Integer.parseInt(mês);
        
        while(true!=isMes(mês)) {
        	
            System.out.println("Mês invalido, por favor, tente novamente: ");
            mês = scanner.nextLine();        
            
        	
        }
        
        // Definição do dia
        
        System.out.println("Dia: ");
        String dia = scanner.nextLine();
        dia = dia.replaceAll("[^0-9]", "");
        
        
        while(true!=isDia(dia,mesInt)) {
        	
            System.out.println("Dia invalido, por favor, tente novamente: ");
            dia = scanner.nextLine();
        	
        }
        
        

        
        System.out.println("\n\nA data escrita foi "+dia+"/"+mês+"/"+ano+"!!!!!");

        

        scanner.close();
    	
    }
  // funcionamento de isDia,isMes e isAno
    	
    	
        public static boolean isDia(String x,int z){
  
            int y = Integer.parseInt(x);
            
            if(y<1 || y>31 || z == 2 && y>29) {
            	return false;
            }
            else
            {
            	return true;
            }
    	}
    	
        public static boolean isMes(String x) {
 
            int y = Integer.parseInt(x);
            
            if(y<1 || y>12) {

            	return false;
            }
            else
            {
            	return true;
            }
        }
    	
        public static boolean isAno(String x) {

            int y = Integer.parseInt(x);
            
            if(y<(-10000) || y>10000) {
            	return false;
            }
            else
            {
            	return true;
            }
        }
    	

    
}
