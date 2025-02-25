package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
   public static void main(String[]args){
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
	   
	   Product product = new Product();
	   System.out.println("Enter product data: ");
	   System.out.print("Name: ");
	   product.name = sc.nextLine();
	   System.out.print("Price: ");
	   product.price = sc.nextDouble();
	   System.out.print("Quantity in stock: ");
	   product.quantity = sc.nextInt();
	   
	   System.out.println();
	   System.out.print("Product data : "+ product);
	   
	   System.out.println("");
	   System.out.print("Enter the number of product to be added in stock: ");
	   int quantity = sc.nextInt(); //chamamos uma quantidade
	   product.addProducts(quantity); // faz o adicional e a multiplicação

	   System.out.println();
	   System.out.print("Product data : " + product);
	   
	   System.out.println();
	   System.out.print("Enter the number of product to be removed in stock: ");
	   quantity = sc.nextInt(); //chamamos uma quantidade
	   product.removeProcuts(quantity); // faz o adicional e a multiplicação
	   
	   System.out.println();
	   System.out.print("Product data : " + product);
	   
	   sc.close();
	   
   }
}
//PROGRAMA IGUAL O EntradaSaida
