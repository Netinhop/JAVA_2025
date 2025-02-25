package util;

public class Calculator {
     public static final double PI = 3.14159; //Qundo é uma constnte
     
     public static double circumference(double radius) {
    	 return 2.0 *PI*radius;
    	 
     }
     public static double volume(double radius) {
    	 return 4.0*PI*radius*radius*radius/3.0;
     }
}
// Apos adicionar o static, não precisamoos mais chamad Calculator calc = new Calculator
//Para chamar volume por ex, é so por Calculator. ...(volume)


