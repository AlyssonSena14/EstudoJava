import java.util.Locale;
import java.util.Scanner;
public class OrientadaObJeto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        triangle x, y;
        x = new triangle();
        y = new triangle();

        System.out.println("Enter the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measure of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areax = x.area();
        double areay = y.area();

        System.out.printf("Triangle x area: %.4f%n", areax);
        System.out.printf("Triangle y area: %.4f%n", areay);

        if (areax > areay){
            System.out.println("larger area: x");

        }
        else {
            System.out.println("larger area: y");
        }
        sc.close();




    }
}
