package Aula.Banco;
import java.util.Scanner;

//Parte de um programa de registro de pessoas, focado em set e get

public class Dados {
	
	private int cod,tel,cpf;
	private String nome;

/*	public void dados(int cod, int tel, int cpf, String nome) {                                  \\ Descoberto como desnecessario
		
		this.cod = cod;
		this.tel = tel;
		this.cpf = cpf;
		this.nome = nome;
	
	}
*/

	/**
	 * @return the cod
	 */
	public int getCod() {
		return cod;
	}

	/**
	 * @param cod the cod to set
	 */
	public void setCod(int cod) {
		this.cod = cod;
	}

	/**
	 * @return the tel
	 */
	public int getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(int tel) {
		this.tel = tel;
	}

	/**
	 * @return the cpf
	 */
	public int getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sc
	 */
	public Scanner getSc() {
		return sc;
	}

	/**
	 * @param sc the sc to set
	 */
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
    
	public String toString() {
        return "Conta {" +
                "Codigo=" + cod +
                ", Nome='" + nome + '\'' +
                ", Telefone=" + tel +
                ", Cpf=" + cpf +
                '}';
        
    }
	
	Scanner sc = new Scanner(System.in);
	

}
