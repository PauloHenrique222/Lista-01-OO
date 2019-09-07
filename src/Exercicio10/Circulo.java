package Exercicio10;

public class Circulo {	
	private double raio;
	private Ponto2D ponto;
	
	public Circulo(double raio, Ponto2D ponto) {
		this.raio = raio;
		this.ponto = ponto;
	}
	
	public Circulo(double raio) {
		this.raio = raio;
		this.ponto = new Ponto2D();
	}
	
	public void inflar(double x) {
		this.raio = this.raio + x;
	}
	
	public void desinflar(double x) {
		this.raio = this.raio - x;
	}
	
	public void inflar() {
		this.raio = this.raio + 1;
	}
	
	public void desinflar() {
		this.raio = this.raio - 1;
	}
	
	public void mover() {
		this.ponto.setX(0);
		this.ponto.setY(0);
	}
	
	public void mover(double x, double y) {
		this.ponto.setX(x);
		this.ponto.setY(y);
	}
	
	public void mover(Ponto2D ponto) {
		this.ponto = ponto;
	}
	
	public double area() {
		return 3.14 * Math.pow(this.raio, 2);
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public Ponto2D getPonto() {
		return ponto;
	}
	
	public void setPonto(Ponto2D ponto) {
		this.ponto = ponto;
	}
	
	public String toString() {
		return "---------CIRCULO---------\n"
				+ "Raio: " + this.raio + " Ponto: " + this.ponto.toString();
	}
}
