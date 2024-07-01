import java.util.Scanner;

public class exercico10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int incio, fim;
        System.out.println("Digite o inicio do jogo: ");
        incio = sc.nextInt();
        System.out.println("Digite o final do jogo: ");
        fim = sc.nextInt();
        int duraçao;

        if (incio < fim ){
            duraçao = fim - incio;
        }
        else {
             duraçao = 24 - incio + fim;
        }
        System.out.println(duraçao);

        sc.close();
    }

}
