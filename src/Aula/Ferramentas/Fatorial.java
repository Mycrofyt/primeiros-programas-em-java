package Aula.Ferramentas;

import java.util.Scanner;

public class Fatorial {

	private static Scanner a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int i = 0;
    	for(;i>=0;i++) {
    		a = new Scanner (System.in);
    		int b = a.nextInt();                      // le o valor dado pelo usuario
    		int c=1;
    		for (;b-1>=1;b--) {               // usa o valor do usuario, prepara a fatorial e o loop
    			c=b*c;                   // faz o calculo da fatorial
    			i=c;
				System.out.println(c);  // mostra os resultados no terminal
}
}
	}

}
//Bug de numeros negativos não parando o ciclo