package Aula.Aprendizado;

public class Ponto {

	private int x;
	private int y;
	public Ponto(int x, int y) {
		this.y = y;
		this.x = x;

	}




public boolean eIgual(Ponto p2) {
	if((this.x == p2.x)&&(this.y == p2.y))
		return true;
	else
		return false;
	
	
}
	
public String toString() {
	return("("+this.x+","+this.y+")");
	
}
}