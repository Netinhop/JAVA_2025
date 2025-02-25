package entities;

public class Product {
   
    public String name;
    public double GrossSalary;
    public double Tax;
  
    
    public double netSalary() {
    	return GrossSalary - Tax;
    }
    public double IncreaseSalary(double porcentagem) {
     return GrossSalary += GrossSalary * porcentagem / 100.0;
	         
    }
    public String toString() {
    	return name + ", $ " + String.format("%.2f", netSalary());
    	}
}
