import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite Um Numero: ");
        numero = sc.nextInt();
        if (numero < 0){
            System.out.println("Esse numero é negativo !");
        }
        else {
            System.out.println("Esse numero é possitivo ! " );
        }

        sc.close();
    }

}
