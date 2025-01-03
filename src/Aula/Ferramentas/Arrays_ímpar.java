package Aula.Ferramentas;
import java.util.Scanner;

// Programa basico para separar e mostrar os numeros impares de 0 até um N escolhido 
// inicialmente, o programa não reinicia sozinho, só aceita inteiros

public class Arrays_ímpar {
	
	public static Scanner sc;

	public static void main(String[] args) {
		 
    	int j = 0;
    	sc = new Scanner(System.in);
		j = sc.nextInt();
		
		int[] c;
		c = new int[j]; // Ajuste o tamanho do array conforme necessário
		
		
    	while (j != 0) {
    		if (j % 2 == 1) {
    			c[j - 1] = j;
    		}
    		
    		j--;
    	}
    	
    	// Imprime os elementos do array
    	for (int k = 0; k < c.length; k++) {
    		if (c[k] != 0) {
    		System.out.println(c[k]);
    	}
    	

	}
	}
}

// int[] impares = new int[]