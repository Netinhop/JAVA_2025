package entities;

public class Product {
    // private so pode acessado pela mesma classe
	// se nao por nada sera possivel acessa so no mesmo pacote 
	
    String name;
	private double price;
	private int quantity;
	
	
	//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	//Botão direito > Source > Generate constructor using field
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price ) {
		this.name = name;
		this.price = price;
	}
	//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	//Botão direito > Source > Generate Getters and Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public double totalValueInStock(){
	     return price * quantity;
	}
	public void addProducts(int quantity){
		this.quantity += quantity;       // Nao vai puxar o quantity do totalValueInStock, e sim da string da classe
	}
	public void removeProcuts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString(){
		return name
		      +", $ " 
		       + String.format("%.2f", price) // para formatar em dolar
		        +", "
		         + quantity
		          + " units, Total: # "
		           + String.format("%.2f", totalValueInStock()); // para formatar em dolar 
		        
	}
}
// PROGRAMA IGUAL O COURSE FAZENDO TESTE DE CONTRUTORES