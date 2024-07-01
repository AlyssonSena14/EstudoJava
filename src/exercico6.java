import java.util.Locale;
import java.util.Scanner;

public class exercico6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo1, quant1, codigo2, quant2;
        double preço1, preço2, totalapagar ,pagar1, pagar2;
        System.out.println("Digite o codigo do produto: ");
        codigo1 = sc.nextInt();
        System.out.println("Digite a quantidade: ");
        quant1 = sc.nextInt();
        System.out.println("Digite o preço do produto: ");
        preço1 = sc.nextDouble();
        System.out.println("Digite o codigo do segundo produto: ");
        codigo2 = sc.nextInt();
        System.out.println("Digite a do segundo quantidade: ");
        quant2 = sc.nextInt();
        System.out.println("Digite o preço do segundo produto: ");
        preço2 = sc.nextDouble();
        pagar1 = quant1 * preço1;
        pagar2 = quant2 * preço2;
        totalapagar = pagar1 + pagar2;
        System.out.printf("total a pagar: %.2f%n",totalapagar);

        sc.close();



    }
}
