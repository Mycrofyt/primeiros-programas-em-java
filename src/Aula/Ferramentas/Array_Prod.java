package Aula.Ferramentas;
import java.util.Scanner;

import Aula.Aprendizado.Prod_Array;

// Programa basico para criação de produtos, possui como classe secundaria: Prod_Array,
// cria uma array de tamanho escolhido logo no inicio que define o numero de produtos
// registrados, registra do produto o seu: Codigo, Peso, Unidades armazenadas, nome 
// e preço

public class Array_Prod {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		Prod_Array[] produtos;
		int qtde;
		System.out.print("informe a quantidade de produtos: ");
		qtde = sc.nextInt();
		produtos = new Prod_Array[qtde];
		
		for(int i=0;i<qtde;i++) {
			
			produtos[i] = new Prod_Array();
			
			System.out.println(" ");
			
			System.out.print("informe o codigo: ");
			produtos[i].setCod(sc.nextInt());
			sc.nextLine();
			
			System.out.print("informe o peso (g): ");
			produtos[i].setGramas(sc.nextDouble());
			sc.nextLine();
			
			System.out.print("informe o numero de unidades estocadas: ");
			produtos[i].setEstoque(sc.nextInt());
			sc.nextLine();
			
			System.out.print("informe o nome: ");
			produtos[i].setNome(sc.next());
			sc.nextLine();
			
			System.out.print("informe o preço: ");
			produtos[i].setPreço(sc.nextDouble());
			sc.nextLine();
			System.out.println(" ");
		
			
			}
		
	sc.close();
	System.out.println("\n****Lista de produtos****");
	for(int i=0; i<produtos.length;i++) {
		System.out.println(produtos[i]);
		}
	
	}

}
