package entities;

public class Tamanho {
	
	   public double widht;
	   public double height;
	
	
       public double Area() {
    	   return widht * height;
       }
       public double Perimeter() {
    	   return 2*(widht + height);
       }
       public double Diagonal() {
    	   return java.lang.Math.sqrt((widht*widht + height*height));
       }
    
}
