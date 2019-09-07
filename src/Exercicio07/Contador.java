/*Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de itens ou eventos. A classe deve oferecer 
métodos que devem:
• Zerar; • Incrementar; • Retornar o valor do contador. */

package Exercicio07;

public class Contador {
	private int valor;
	
	void zerar() {
		this.valor = 0;
	}
	void incrementar (int valor) {
		this.valor = valor;
	}
	int returnValor() {
		return this.valor;
	}
}
