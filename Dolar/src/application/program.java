package application;


import java.util.Scanner;

import util.CurrencyConverter;

public class program {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	
    

    	
    	System.out.println("What is the dollar price? ");
        double PrecoDolar = sc.nextDouble();
    	System.out.println();
    	
    	System.out.println("How many dollars will be bought? ");
    	double Quantos = sc.nextDouble();
    	System.out.println();
    	double result = CurrencyConverter.Reais (PrecoDolar, Quantos);
    	System.out.printf("Amount to be paid in reais = %.2f%n", result);
 
    	
    	
    	
    	
    	sc.close();
    	
    }
    
    
}
// Como mudei o jeito do currency, preciso mudar como atribui cada valor, fazendo no proprio codigo era assim 
//(CurrencyConverter.PrecoDolar = sc.nextDouble();)
// double result = CurrencyConverter.Reais ();