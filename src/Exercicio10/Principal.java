package Exercicio10;

public class Principal {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(3);
        Ponto2D ponto = new Ponto2D(4, 6);
		System.out.println(circulo.toString());
		circulo.inflar();
		System.out.println(circulo.toString());
		circulo.desinflar();
		System.out.println(circulo.toString());
		circulo.mover(ponto);
		System.out.println(circulo.toString());
		System.out.println("Área do circulo: " + circulo.area());
	}

}
