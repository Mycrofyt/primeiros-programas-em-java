package Aula.Banco;

// Acredito que seja a classe Funcionario permite criar objetos que representam 
//funcionários, com a capacidade de inicializar, acessar e modificar os atributos nome,
//sobrenome e salario. Além disso, garante que o salário não possa ser definido com 
//um valor negativo.

public class Funcionario {

		private String nome;
		private String sobrenome;
		private double salario;
		
	public Funcionario() {
	

	}
	
	public Funcionario(String nome, String sobrenome, double salario) {

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	
	}
	
	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if(salario>=0)
		this.salario = salario;
		else 
			this.salario = 0.0;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	}
