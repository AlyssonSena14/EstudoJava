import entities.funcionario;

import java.util.Locale;
import java.util.Scanner;

public class exercico23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        funcionario funcionario = new funcionario();


        funcionario.name = sc.nextLine();
        funcionario.grosssalary = sc.nextDouble();
        funcionario.tax = sc.nextDouble();
        funcionario.porcentagem = sc.nextDouble();
        System.out.println("Name: " +  funcionario);

        sc.close();
    }
}
