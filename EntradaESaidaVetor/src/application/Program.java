package application;

import java.util.Scanner;

import entities.Product;

public class Program {
       public static void main(String []args) {
    	   Scanner sc = new Scanner (System.in);
    	   // FARÁ QUANTAS VEZES SERA REPRODUZIDO O CLIENTE QUER
    	  int n = sc.nextInt();
    	  Product[] vect = new Product[n];
    	  // FARÁ LER O NOME E PREÇO QUANTAS VEZES O CLIENTE QUIS LOGO EM CIMA! 
    	  for (int i = 0 ; i < vect.length ; i++) { // vect.length é melhor, pois nao depende de outra variavel
    		       sc.nextLine();
    			   String name = sc.nextLine();
    			   double price = sc.nextDouble();
    			   vect[i] = new Product(name,price);
    	  // FARÁ A SOMA	   
    	  }
    	   double soma = 0.0;
    	   for ( int i = 0; i < vect.length ; i++) {
    		   soma += vect[i].getPrice();// Soma o preço de todos os produtos

    	   }
    	   double media = soma / vect.length ; //Calcula a media entre os produtos
    	   
    	   System.out.printf("AVERAGE PRICE = %.2f%n", media);
    	   
    	   
    	   
    	   
    	   sc.close();
       }
}
