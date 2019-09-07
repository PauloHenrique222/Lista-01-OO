/*Escreva em Java uma classe Ponto2D que represente um ponto no plano cartesiano. Além dos atributos por você 
identificados, a classe deve oferecer os seguintes membros:  • Construtores sobrecarregados que permitam a inicialização 
do ponto: i) Por default (sem parâmetros) na origem do espaço 2D; ii) Num local indicado por dois parâmetros do tipo 
double (indicando o valor de abcissa e ordenada do ponto que está sendo criado);iii) Em um local indicado por outro 
ponto.  • Métodos de acesso (getter/setter) dos atributos do ponto;  
• Métodos sobrecarregados de movimentação do ponto com os mesmos parâmetros indicados para os construtores;
• Método de comparação semântica do ponto (equals);  • Método de representação do objeto como String;
• Método que permita calcular a distância do ponto que recebe a mensagem, para outro ponto; */

package Exercicio08;

public class Ponto2D {
	private double x;
	private double y;
	
	public Ponto2D() {
		this.x = 0;
		this.y = 0;
	}
	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Ponto2D(Ponto2D ponto) {
		this.x = ponto.getX();
		this.y = ponto.getY();
	}
	public void movimentacao() {
		this.x = 0;
		this.y = 0;
	}
	
	public void movimentacao(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void movimentacao(Ponto2D ponto) {
		this.x = ponto.getX();
		this.y = ponto.getY();
	}
	
	public boolean comparar(Ponto2D ponto) {
	    if(toString().equals(ponto.toString())) {
	    	return true;
	    }
	    return false;
	}
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	public double calcularDistancia(Ponto2D ponto) {
		if((Math.pow((ponto.getX() - this.x), 2) + (Math.pow((ponto.getY() - this.y), 2))) < 0) {
			System.out.println("RAIZ NEGATIVA");
			return -1;
		}
		return Math.sqrt((Math.pow((ponto.getX() - this.x), 2) + (Math.pow((ponto.getY() - this.y), 2))));
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
}
