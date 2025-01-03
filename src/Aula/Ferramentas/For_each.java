package Aula.Ferramentas;

// Calcula atravez de for_each a media aritmetica dos valores em um array fixo

public class For_each {
	public static void main(String[] grades) {
		int[] grades1 = {3, 9, 5, -5};
		for (int number: grades1) {
		System.out.println(number);
		}
		int total = 0;
		for (int i = 0; i < grades1.length; i++) 
		total = total + grades1[i];
	
		System.out.println((double) total / (double) grades1.length);
		
	}
}