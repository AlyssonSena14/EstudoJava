import java.util.Scanner;

public class exercico8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numéro: ");
        numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println("O número " + numero +" é par");
        }
        else {
            System.out.println("O Número " + numero + " é impar");
        }


    }
}