import java.util.Locale;
import java.util.Scanner;
public class entradadedadosprt1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        double y;
        int z;
        x = sc.next();
        z = sc.nextInt();
        y = sc.nextDouble();
        System.out.println("DADOS DIGITADOS: ");
        System.out.println(x);
        System.out.println(z);
        System.out.println(y);

        sc.close();
    }

}

