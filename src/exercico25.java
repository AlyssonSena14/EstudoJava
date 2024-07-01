import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

import static entities.CurrencyConverter.*;

public class exercico25 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("What is the dollar price? ");
        dolar1 = sc.nextDouble();
        System.out.println();
        System.out.print("How many dollars will be bought? ");
        dolar2 = sc.nextDouble();
        System.out.println();

        System.out.printf("Amount to be paid in reais = %.2f%n ", CurrencyConverter.total());



    }
}
