package util;

public class CurrencyConverter {
 
    private static final double IMPOSTO  = 0.06;
    
    public static double Reais(double Quantos, double PrecoDolar) {
    	return PrecoDolar *= Quantos *(1.0 + IMPOSTO) ;
    }
    
}
// CADA DOLAR CUSTA 3.10  3.10 * 200 * 0.06
// VO COMPR 200 DOLAR
// 657.20 INCLUIDO OS 6 % DE IMPOSTO 

      /**{ SIMPLIFICADO A CIMA!
    public static double PrecoDolar;
    public static double Quantos;
    public static double Reais;
    private static final double IMPOSTO  = 0.06;
    
    public static double Reais() {
    	return PrecoDolar *= Quantos *(1.0 + IMPOSTO) ;
    }
       */