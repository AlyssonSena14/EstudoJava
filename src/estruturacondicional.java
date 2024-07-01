import java.util.Scanner;

public class estruturacondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();

        Double conta = 50.0;
        if (minutos > 100){
            conta = conta + ( minutos - 100) * 2.0;
        }
        System.out.println("total a pagar: "+ conta);

        sc.close();

    }
}
