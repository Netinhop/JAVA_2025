package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
       //Product product = new Product() sera criado dps de atribuir os valores para cada variavel criado
	    
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double  price = sc.nextDouble();
		Product product = new Product(name, price); // Faz com qe nao crie falhas na hora do cliente digitar
		
        product.setName("Computer");
        System.out.println("Update name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: "+ product.getPrice());
		System.out.println(); 
		System.out.print("Product data : " + product);

		System.out.println("");
		System.out.print("Enter the number of product to be added in stock: ");
		int quantity = sc.nextInt(); // chamamos uma quantidade
		product.addProducts(quantity); // faz o adicional e a multiplicação

		System.out.println();
		System.out.print("Product data : " + product);

		System.out.println();
		System.out.print("Enter the number of product to be removed in stock: ");
		quantity = sc.nextInt(); // chamamos uma quantidade
		product.removeProcuts(quantity); // faz o adicional e a multiplicação

		System.out.println();
		System.out.print("Product data : " + product);

		sc.close();

	}
}
// PROGRAMA IGUAL O COURSE FAZENDO TESTE DE CONTRUTORES
// CTRL SHIFT F PARA ENDENTAR 
 