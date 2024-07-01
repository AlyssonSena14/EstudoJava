import java.util.Locale;
import java.util.Scanner;

public class estruturarepetitivaDoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        char resp = 's';

        while (resp != 'n' ){
            System.out.print("digite a temperatura em celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em fahrenheit: %.1f%n", f);
            System.out.print("DeseJa repetir (s/n)?");
            resp = sc.next().charAt(0);
        }
        sc.close();

    }
}
