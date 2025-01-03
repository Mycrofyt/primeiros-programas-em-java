package Aula.Banco;

// Programa para registro de dados de funcionarios

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salMensal;
	
	public Empregado(String nome, String sobrenome, double salMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if (salMensal<0)
			this.salMensal=0.0;
		else
			this.salMensal = salMensal;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return (nome);
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalMensal() {
		return salMensal;
	}

	public void setSalMensal(double salMensal) {
		if (salMensal<0)
			this.salMensal=0.0;
		else
			this.salMensal = salMensal;
	}
	
	public String toString() {
		return ("\nFuncionário:\nNome Completo: "+nome+
				" "+sobrenome+"\nSalário: "+salMensal);
	}
	
}
