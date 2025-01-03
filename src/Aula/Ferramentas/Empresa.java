package Aula.Ferramentas;

import Aula.Banco.Funcionario;

// Criação em codigo de objetos funcionarios e definindo seus salarios

public class Empresa {

	public static void main(String[] args) {
		
		Funcionario f1, f2;
		f1 = new Funcionario("Gorberto"," Molironacio Barbosa",2500);
		f2 = new Funcionario("Merlinda"," Gorbachov Palmeras",2798);
		
		
		System.out.println("\nFuncionario: "+f1.getNome()+f1.getSobrenome());
		System.out.println("Salario: "+f1.getSalario()*12);
		System.out.println("\nFuncionario: "+f2.getNome()+f2.getSobrenome());
		System.out.println("Salario: "+f2.getSalario()*12);
		
		f1.setSalario(f1.getSalario()*1.1);
		f2.setSalario(f2.getSalario()*1.1);
		
		System.out.println("\nFuncionario: "+f1.getNome()+f1.getSobrenome());
		System.out.println("Salario: "+f1.getSalario()*12);
		System.out.println("\nFuncionario: "+f2.getNome()+f2.getSobrenome());
		System.out.println("Salario: "+f2.getSalario()*12);
		
		
	}

}
