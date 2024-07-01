import java.util.Scanner;

public class exercico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(" digite o primeiro numero: ");
        int primeiro = sc.nextInt();
        System.out.printf(" digite o segundo numero: ");
        int segundo = sc.nextInt();
        int total = segundo + primeiro;
        System.out.printf("o total e igual a = %d",total);

        sc.close();



    }
}
