package Aula.Banco;
import java.util.Scanner;

//Parte do programa bancario


public class ContaCorrente {

	public class Conta {
		

		static float saldo; 
		String nome; 
		
		
		static double verificaSaldo ( ) { 
			return saldo;
		}
		
		static double depositaValor (float valor){ 
			saldo = saldo + valor; 
			dinheiroInicial += valor; 
			return saldo;
		
		}
		
		void retiraValor (float valor) { 
			if (saldo>=valor) { 
				saldo=saldo-valor; 
				dinheiroInicial -= valor; 
				
			}
			
		}

	}
	
	
	public static Scanner Car;
	public static Scanner Dou;
	public static Object ContaCorrente;
	public static String nome;
	public static double valor,saldo,dinheiroInicial;
	public static int Controle,idade;
	
	
	public static void main(String[] args) {
		
		System.out.print("Insira o valor que represente sua vontade: \n\n"
				+ "1 - logar na sua conta.\n"
				+ "2 - criar uma conta nova.\n"
				+ "3 - solicitar cancelamento de conta inativa/indesejada.\n"
				+ "4 - entrar em contato com nossa IA, marIAra.\n"
				+ "5 - infiltrar virus que derrubara a economia global :D\n");
	
/*		switch (){
	
		case '1':System.out.println("");
		 break;
		
		case '2':System.out.println("");
		 break;
	
		case '3':System.out.println("Nosso banco farda de TUDO para te satisfazer, por favor não nos abandone \n"
				+ "a - caquei pra voces, cancele  a conta!!!"
				+ "b - esta bem, se farão qualquer coisa, eu aceito continuar no banco *pensamentos maleficos*\n"
				+ "c - maçã");
		
		nome = (Car.next());
		
		
		 break;
	
		case '4':System.out.println("Em manutenção:"
				+ "\n Em breve oferecendo serviços de: "
				+ "- sequestro de conta do orkut"
				+ "- encontrar o amor da sua vida em 7 dias"
				+ "- Processamento de filhotes para a produção em massa de chaveirinhos anti-carne");
		 break;
	
		case '5':System.out.println("Poisé voce conseguiu derrubou o sistema bancario burgues do mundo inteiro,"
				+ " agora milhares e milhões morrerão pela sua traquinagem");
		 break;
		 
		 default:System.out.println("");
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		Dou = new Scanner(System.in);
		Car = new Scanner(System.in);
		System.out.print("Qual o nome do titular da conta trabalhada aqui: ");
		nome = (Car.next());
		System.out.print("Qual o dinheiro total na conta de "+nome+": ");
		dinheiroInicial = (Dou.nextDouble());
		System.out.print("Qual o saldo na conta de "+nome+": ");
		saldo = (Dou.nextDouble());
		System.out.print("Qual o valor da transação na conta de "+nome+": ");
		valor = (Dou.nextDouble());
		System.out.print("Qual o valor de controle na conta de "+nome+": ");
		Controle = (Dou.nextInt());
		System.out.print('b');
		System.out.print(Conta.depositaValor((float) valor));
	}
	class cliente {
		
		 void apresentar() {
		        System.out.println("Olá, eu sou " + nome + " e tenho " + idade + " anos.");
		        System.out.print(ContaCorrente);
	
		 	}
		 
		}
	
	}
	


		

		

		
		
	
