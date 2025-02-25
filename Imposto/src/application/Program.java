package application;

import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	Product product = new Product();
    	
    	System.out.println("Qual seu Nome: ");
    	product.name = sc.nextLine();
    	System.out.println("Qual seu salario: ");
    	product.GrossSalary = sc.nextDouble();
    	System.out.println("Qual sua taxa: ");
    	product.Tax = sc.nextDouble();
    	
    	System.out.println();
    	System.out.printf("Employee: " + product);
    	System.out.println();
    	System.out.println("Whitch percentage to increase salary? ");
    	double porcentagem = sc.nextDouble();
    	product.IncreaseSalary(porcentagem);
    	
    	System.out.println();
    	System.out.println("Updated data: " + product);
    	
    	
    	sc.close();
    	
    }
}
