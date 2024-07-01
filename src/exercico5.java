import java.util.Locale;
import java.util.Scanner;

public class exercico5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorhora, total;

        System.out.println("Digite o número do funcionario: ");
        numero = sc.nextInt();
        System.out.println("digite a hora trabalhada do funcionario: ");
        horas = sc.nextInt();
        System.out.println("valor por cada hora trabalhada: ");
        valorhora = sc.nextDouble();
        total = valorhora * horas;
        System.out.printf("salario =  U$ %.2f%n", total);

        sc.close();
    }
}
