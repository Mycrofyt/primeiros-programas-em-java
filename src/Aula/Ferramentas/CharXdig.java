package Aula.Ferramentas;

public class CharXdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		char c = '2';
		// converte char em inteiro. Ex: '1' -> 1
		int res1 = Character.digit (c, 10);
		// converte inteiro em char. Ex: 1 -> '1'
		char res2 = Character.forDigit (i, 10);
		System.out.println ("char -> int = " + res1);
		System.out.println ("int -> char = " + res2);
	}

}
