package Aula.Exercícios;
import java.util.Scanner;

public class A3 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner (System.in);
		double a1,a2 = 0;
		double a3 = 15;
		while(a3!=0) {
			
			a3--;
			a1 = sc.nextDouble();					//criação da 
		
			if (a1>=a2) {
			a2=a1;
		}
		}
		System.out.println(a2);
}
}