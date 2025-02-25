package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Tamanho;

public class program {

		public static void main(String[]args){
		       Scanner sc = new Scanner(System.in);
		       Locale.setDefault(Locale.US);
		       Tamanho tamanho = new Tamanho();
		       System.out.println("Enter rectangle width and height: ");
		       System.out.println("Digite a altura do retangulo: ");
               tamanho.height = sc.nextDouble();
               System.out.println("Digite a largura do retangulo: ");
               tamanho.widht = sc.nextDouble();
               
               System.out.printf("AREA : %.2f%n", tamanho.Area());
               System.out.println();
               System.out.printf("DIAGONAL : %.2f%n", tamanho.Diagonal());
               System.out.println();
               System.out.printf("PERIMETRO: %.2f%n", tamanho.Perimeter());
               System.out.println();
              
		        sc.close();
		        
		    }
}
