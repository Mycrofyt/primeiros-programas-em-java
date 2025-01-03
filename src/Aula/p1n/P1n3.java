package Aula.p1n;
import java.util.Scanner;

public class P1n3 {

	public static String nome;
    public static String especie;
    public static Scanner bob;
    public static int idade;

    public static void setValor() {
        bob = new Scanner(System.in);
        System.out.print("Digite a espécie: ");
        especie = bob.nextLine();
        System.out.print("Digite a idade: ");
        idade = bob.nextInt();
        bob.nextLine();
        System.out.print("Digite o nome: ");
        nome = bob.nextLine();
        System.out.print("\n");
    }

    public static void main(String[] args) {
    	int i;
    	for(i=1;i<10;i++) {
        setValor();

        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("nome: " + nome + "\n");
    }
    }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


