package Application;
import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class program {
	// public static final double PI = 3.14159; Pode fazer assim //Qundo é uma constnte

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c); // Formatando para duas casas decimais
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }

    
    
 }
/**

public double circumference(double radius) {
	 return 2.0 *PI*radius;
	 
}
public double volume(double radius) {
	 return 4.0*PI*radius*radius*radius/3.0;
	 porem teria que fazer uma Calculadora calc = new Calculcadora;
	 
*/ 
