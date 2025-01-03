package Aula.Exercícios;
import java.util.Scanner;

public class A4 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner (System.in);
		int a1,a2,a4 = 0,a5 = 0;
		String a3 = "a";
		while(a3!=null) {
			
			
			a1 = sc.nextInt();					//criação da 
		
			if (a1 % 2 == 0) {
			a4++;
			}	else {
			a5++;
			}	
		}
	}
}
