package entities; //pacote da classe

public class Triangle { //nome da classe
     public double a;   //atributo da classe
     public double b;   //public inidica q pode usa em outro arquivos
     public double c;   //double tipo de dado q metodo retorna
     
     public double area() {   //se o metodo nao retorna nada, se usa void (lugar de double) () lista de parametro {corpo do metodo}
    	 double p = (a + b + c)/2.0 ;
    	 return Math.sqrt(p*(p-a)*(p-b)*(p-c));
   
     }
}
// POR QUE USAR CLASSE
// reaparoveitamento de codigo
// Delegação de responsabilidade