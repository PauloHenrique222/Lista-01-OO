/*A fim de representar empregados em uma firma, crie uma classe chamada Empregado que inclui as três informações
a seguir como atributos: 
• um primeiro nome,  • um sobrenome, e • um salário mensal. 
Sua classe deve ter um construtor que inicializa os três atributos. Forneça um método set e get para cada atributo. Se o 
salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste que demonstra as capacidades da classe.
Crie duas instâncias da classe e exiba o salário anual de cada instância. Então dê a cada empregado um aumento de 10% e exiba
novamente o salário anual de cada empregado. */

package Exercicio06;

public class Empregado {
	private String primeiroNome;
	private String sobrenome;
	private double salario;
	 
	public Empregado(String nome, String sobrenome, double salario) {
		this.primeiroNome = nome;
		this.sobrenome = sobrenome;
		if(salario <= 0) {
			this.salario = 0;
		}else {
			this.salario = salario;
		}
	}
	
	public void Aumento(double aumento) {
		this.salario = this.salario*((aumento/100) + 1);
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	} 
	 
}
