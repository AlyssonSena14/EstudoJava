import java.util.Locale;
import java.util.Scanner;

public class exercico12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor,entrada;
        entrada = sc.nextDouble();
        int intervalo;

        if (entrada > 0){
            entrada -= 25;
            valor = 25;
            intervalo = (int) (entrada + valor);
            System.out.printf("Intervalo entre [%d a %d",(int) entrada,intervalo);

        }
        else {
            System.out.println("Fora do intervalo !");
        }
        sc.close();
    }
}
