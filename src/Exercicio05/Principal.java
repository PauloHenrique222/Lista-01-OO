package Exercicio05;

public class Principal {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice(1234, "placa m�e", 3, 150);
		
		System.out.println("Total:" + invoice.getInvoiceAmount());
		
		
		Invoice invoice02 = new Invoice(1234, "placa m�e", -2, -300);
		
		System.out.println("Quantidade: " + invoice02.getQuantidade());
		System.out.println("Pre�o: " + invoice02.getPrecoUnitario());
		

	}

}
