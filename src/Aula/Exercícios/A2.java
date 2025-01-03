package Aula.Exercícios;
import java.util.Scanner;

public class A2 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner (System.in);
		double a1,a2,a3,a4,a5,a6,a7,a8,a9,a0,b1,b2 = 0;
		
		a1 = sc.nextDouble();					//criação da 
		a2 = sc.nextDouble();					//criação da 
		a3 = sc.nextDouble();					//criação da 
		a4 = sc.nextDouble();					//criação da 
		a5 = sc.nextDouble();					//criação da 
		a6 = sc.nextDouble();					//criação da 
		a7 = sc.nextDouble();					//criação da 
		a8 = sc.nextDouble();					//criação da 
		a9 = sc.nextDouble();					//criação da 
		a0 = sc.nextDouble();					//criação da 
		b1 = a1+a2+a3+a4+a5+a6+a7+a8+a9+a0;
		b2 = b1/10;
		
		System.out.println(b2);
		
		
	}

}
