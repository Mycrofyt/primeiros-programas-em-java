package Aula.Aprendizado;

import javax.swing.JOptionPane;

import java.util.Scanner; 
public class pri { 
	public static void main(String[]args) { 
		String nome;
		nome = JOptionPane.showInputDialog(null,"Qual o seu nome?", "Entrada de Dados", 1); 
		JOptionPane.showMessageDialog(null, "Olá, " + nome, "Boas vindas!",JOptionPane.PLAIN_MESSAGE);
	}
}