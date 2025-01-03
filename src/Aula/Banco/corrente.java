package Aula.Banco;
import java.util.Scanner;

//Parte do programa bancario

public class corrente {

	public static Scanner Car;
	public static Scanner Dou;
	public static double valor,saldo,dinheiroTotal;
	public static String nome;
	public static int Controle;
	public Object corrente;
	public void info(){
		
		Dou = new Scanner(System.in);
		Car = new Scanner(System.in);
		System.out.print("Qual o dinheiro total na conta trabalhada aqui: ");
		dinheiroTotal = (Dou.nextDouble());
		System.out.print("Qual o valor da transação na conta trabalhada aqui: ");
		valor = (Dou.nextDouble());
		System.out.print("Qual o nome do proprietario desta conta: ");
		nome = (Car.nextLine());
	}

	@Override
    public String toString() {
        return "Informações completas da conta corrente.";
	}
	public static void main(String[] args) {
		
		corrente minhaCorrente = new corrente();
		minhaCorrente.info();
	//	corrente.dinheiroTotal = Conta.ContaCorrente.dinheiroTotal;
		System.out.print("buba + "+ ContaCorrente.dinheiroInicial);
}

	public void jo() {
		// TODO Auto-generated method stub
		
	}
				
				
		
}
		
		
	
