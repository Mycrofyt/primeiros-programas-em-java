package Aula.Aprendizado;
import java.util.Scanner;

public class ifs_and_switchs{  /* Programa para demosntrar funcionamento de if's compostos, das 
								operações basicas, aritimetcas basicas, inicialização de diferentes 
								tipos de variaveis e etc*/


	
	
	public static void main(String[] args) {
	
		// inicialização de variaveis, inclusive a de leitura sc (Scanner) e utilização na f
		

	short a = 0;
	int b = 12;
	long c = 24;
	float d = 36/10;
	double e = 4.8;
	Scanner sc = new Scanner(System.in);
	short f = sc.nextShort();
			
	
	// criação de condiçoes para a execusão de algumas tarefas
	
	if(b>c) {
		System.out.println("Chewbaka");
	}
	
	// exemplo de else sendo executado por causa de um if falso
	
	else {
		System.out.println("gomungo");
	}
	
	// exemplo de if's compostos por mais de um if
	
	if(e*2==d) {
		System.out.println(e*d+"momoa");
	}
	
	/* cada print só esta pulando uma linha por causa do ln no final, se fosse 
	 * f poderiamos formatar os resultados, e na auxencia de ambos ele so poria
	 * um do lado do outro 
	*/
	
	else {
		System.out.println(a/b*c+d-e+" colibri");
	}

	switch (f) {
		case 1:
			System.out.print(f);
			break;
		case 2:
			System.out.print(f*2);
			break;
		case 3:
			System.out.print(f*3);
			break;
		default:
			System.out.print("wololo");
		
		
	}

	}


}

		
		


	


