package entities;

public class Product {

	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock(){
	     return price * quantity;
	}
	public void addProducts(int quantity){
		this.quantity += quantity;       // quando quero acessa atributo da classe
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
//PROGRAMA IGUAL O EntradaSaida