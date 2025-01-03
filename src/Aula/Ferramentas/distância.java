package Aula.Ferramentas;
import java.util.Scanner;

//Parte de um programa de Calculo de distancia entre pontos no plano cartesiano 

public class distância {
	public static double x1,y2,x2,y1,x ;
	public static Scanner leitor;
	public static void setValor() {
		leitor = new Scanner(System.in);
		System.out.print("Escreva seu o Valor x da sua primeira coodenada ");
		x1 = Double.parseDouble(leitor.nextLine());
		System.out.print("Escreva seu o Valor y da sua primeira coodenada ");
		y1 = Double.parseDouble(leitor.nextLine());
		System.out.print("Escreva seu o Valor x da sua segunda coodenada ");
		x2 = Double.parseDouble(leitor.nextLine());
		System.out.print("Escreva seu o Valor y da sua segunda coodenada ");
		y2 = Double.parseDouble(leitor.nextLine());
	}
	
	public static void main(String[] args) {
		setValor();
		x1=x2-x1;
		y1=y2-y1;
		x1 = Math.pow(x1,2);
		y1 = Math.pow(y1,2);
		x1=x1+y1;
		x=x1*x1;
		x=x/x1;
		y1=Math.sqrt(x);
		System.out.print("abe "+ x + "\n");
		System.out.print("A distancia entre o primeiro ponto e o segundo ponto é "+ y1 + " unidades!!!");
		
	}

}


