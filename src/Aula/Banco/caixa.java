package Aula.Banco;
import Aula.Aprendizado.Tranferencia;

// pedaço do programa bancario

public class caixa {

	public static void main(String[] args) {
		
		Conta c1,c2;
		c1 = new Conta(332,"Jabuti",1,300,200,25,32,0,0);
		c2 = new Conta(223,"gilo",2,0,0,0,0,0,0);
		
		
		System.out.println("\ncodigo da conta: "+c1.getNum());
		System.out.println("\nnome do propietario: "+c1.getNom());
		System.out.println("\ncodigo do tipo de conta: "+c1.getTp());
		System.out.println("\nSaldo atual: "+c1.getSaldo());
		System.out.println("\nlimite caso exista para essa conta: "+c1.getLimite());
		System.out.println("\nValor sacado dessa conta: "+c1.getSacar());
		System.out.println("\nConsulta do novo saldo pos saque: "+c1.getConsultar());
		
		
		
		System.out.println("\n\n\n\ncodigo da conta: "+c2.getNum());
		System.out.println("\nnome do propietario: "+c2.getNom());
		System.out.println("\ncodigo do tipo de conta: "+c2.getTp());
		System.out.println("\nSaldo atual: "+c2.getSaldo());
		System.out.println("\nlimite caso exista para essa conta: "+c2.getLimite());
	}

}
