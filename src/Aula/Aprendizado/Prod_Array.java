package Aula.Aprendizado;

// Segunda parte do programa basico para criação de produtos, possui como 
// classe main Array_Prod, cria as variáveis utilizadas na main atraves dos 
// metodos set e get alem de decidir seus tipos.


public class Prod_Array {
	
	private int cod;
	private double gramas;
	private int estoque;
	private String nome;
	private double preço;	
	
    public String toString() {
        return "Produto{" +
                "codigo=" + cod +
                ", nome='" + nome + '\'' +
                ", preco=" + preço +
                ", estoque=" + estoque +
                '}';
        
    }
	public void prod() {
		
		
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public double getGramas() {
		return gramas;
	}


	public void setGramas(double d) {
		this.gramas = d;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreço() {
		return preço;
	}


	public void setPreço(double preço) {
		this.preço = preço;
	}

}
