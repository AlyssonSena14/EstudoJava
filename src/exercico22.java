import entities.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class exercico22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        retangulo retangulo = new retangulo();

        System.out.println("Enter rectangle width and height:");
        retangulo.w = sc.nextDouble();
        retangulo.h = sc.nextDouble();
        System.out.println();
        System.out.print(retangulo);
        sc.close();



    }
}
