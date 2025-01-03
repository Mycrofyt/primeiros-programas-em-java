package Aula.Exercícios;
import java.util.Scanner;



public class A1 {
	
	static double a,b,c,d;              		//declaração de variaveis
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner (System.in);
		
		while (d>=0) {
		
		a = sc.nextDouble();                    //criação do "valor bruto"
		b = sc.nextDouble();					//criação da "parcela"
		c = a*0.3;								// valor de checagem da parcela
		d = 0;
		
		
			if (a<0||b<0) {
				System.out.println("Valor posto não é valido");
				d = -1;
				break;
			}
			if (b<=c) {
				System.out.println("sua prestação sera depositada e foi aceita");
			}
		
			if (c<b) {
				System.out.println("A prestação estorou o limite de 30% de seu salario, sem dinheiro para vc >:D");
			
			}
		}
	}
}
