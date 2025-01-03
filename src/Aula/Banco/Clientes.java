/*
 * 
 */
package Aula.Banco;
import java.util.Scanner;
/*
 * @author Mycrofty-2
 * 
 * Exercicio
 * 
Crie uma classe para representar os dados de um cliente, contendo código, nome, cpf e telefone. 
Implemente nessa classe os construtores e métodos de acesso/modificação necessários e também para impressão. 
Implemente um método para verificação se um dado nome é igual ao do objeto, que será utilizado para busca. 
Em seguida, crie uma classe CadastroClientes que apresente o seguinte menu: 1- Cadastrar cliente 2- Buscar cliente pelo nome 
3- Exibir dados dos clientes 4- Sair Considere que possam ser cadastrados até 50 clientes, mas o cadastro deve ser 
feito de acordo com a vontade do usuário. 
 *
 */
public class Clientes {

	/**
	 * 
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Dados[] Cli;
		Cli = new Dados[49];
		int qtde,fu = 0,x = 0;
		String p = null;
		int y = 0;
		int j = 0;
		System.out.println("\nUsuario, Decida qual operação deseja,\n 1 - Cadastrar conta\n 2 - Consultar nome\n 3 - mostrar dados\n 4 - sair\nEscreva: ");
		qtde = sc.nextInt();
		
		while(j<=50) {
			int i = 0;
			switch (x) {
			case 1:
				System.out.print("Informe os dados das contas que deseja cadastrar\n");
				for(;i<50;i++) {
				
					Cli[i] = new Dados();
	/*
					System.out.println("\nEscreva o codigo da conta numero: "+(i+1));
					Cli[i].setCod(sc.nextInt());
					sc.nextLine();
				
					System.out.println("\nEscreva telefone do propietario: "+(i+1));
					Cli[i].setTel(sc.nextInt());		
					sc.nextLine();

					System.out.println("\nEscreva o CPF do usuario: "+(i+1));
					Cli[i].setCpf(sc.nextInt());	
					sc.nextLine();
					*/
					System.out.println("\nEscreva o nome do propietario: "+(i+1));
					Cli[i].setNome(sc.next());
					sc.nextLine();
			
				j++;
				if(j>=50) {
					System.out.print("Deu ruim, seu limite é 50 cadastros");
					fu=0;
					
				}
				System.out.println("\nDeseja cadastrar mais uma conta? Aperte 'enter' se sim ou qualquer outro caractere se não");
				p = sc.next();
				if(p!=null) {
					break;
				}
		}
		case 2:
			String s = sc.next();
			while(y<=Cli.length) {
				
			
			if(s==Cli[y].getNome()) {
				System.out.print("O nome do cliente "+s+" consta no banco de dados.");
				break;
			}
			if(y==Cli.length) {
				System.out.print("O nome do cliente "+s+" **não** consta no banco de dados.");	
			}
			y++;
		}
	
		case 3:
			for(i=0;i<j;i++) {
				System.out.println("\n"+Cli[i]);
			}
			
		case 4:
			j = 50;
			System.out.print(2);
			break;
	
		
		
	}
		}
		

///		
//		while(fu!=1) {
//			i=0;
			
//			if(qtde<=3) {
				
			
				/*
					
					for(;i<qtde;i++) {
			
						Cli[i] = new Dados();
			
						System.out.println("\nEscreva o codigo da conta numero: "+(i+1));
						Cli[i].setCod(sc.nextInt());
						sc.nextLine();
						
						System.out.println("\nEscreva telefone do propietario: "+(i+1));
						Cli[i].setTel(sc.nextInt());		
						sc.nextLine();
		
						System.out.println("\nEscreva o CPF do usuario: "+(i+1));
						Cli[i].setCpf(sc.nextInt());	
						sc.nextLine();
		
						System.out.println("\nEscreva o nome do propietario: "+(i+1));
						Cli[i].setNome(sc.next());
						sc.nextLine();
						
						p++;
				}
				*/
		//			break;
					
			
			
		}
		//	else {
				
		
			//	break;
			
			
		
	//	for(i=p;i+1>=1;i--) {
			
	//		sc.close();
		//	System.out.println("\n***Numero de cadastros***\n");
			//System.out.println("- "+Cli.length);
			
			
		}
	//}
		


	

