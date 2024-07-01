package entities;

public class CurrencyConverter {
    public static  double dolar1;
    public static double dolar2;

    public static double taxa = (double) 6 / 100;

    public static  double  total(){
        return (dolar1 * dolar2) * taxa + (dolar1* dolar2) ;
    }


    }

