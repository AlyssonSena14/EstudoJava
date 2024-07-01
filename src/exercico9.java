import java.util.Scanner;

public class exercico9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        if (n1 % n2 == 0 || n2 % n1 == 0){
            System.out.println("São Multiplos ");
        }
        else {
            System.out.println("Não são Multiplos ");
        }
    }
}
