package Aula.Banco;

// Parte do programa bancario

public class Conta {
	class ContaCorrente { 
		static float dinheiroTotal; 
		float saldo; 
		String nome; 
		float verificaSaldo ( ) { 
			return saldo;
		} 
		void depositaValor (float valor){ 
			saldo = saldo + valor; 
			dinheiroTotal += valor; 
		} 
		void retiraValor (float valor) { 
			if (saldo>=valor) { 
				saldo=saldo-valor; 
				dinheiroTotal -= valor; 
				}
			}
		public static void info() {
			// TODO Auto-generated method stub
			
		}
		}

	public Conta(int i, String string, int j, int k, int l, int m, int n, int o, int p) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		
	}

	public static void ContaCorrente() {
		// TODO Auto-generated method stub
		
	}

	public String getNum() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTp() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLimite() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSacar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getConsultar() {
		// TODO Auto-generated method stub
		return null;
	}

}

