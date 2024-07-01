import java.util.Scanner;

public class exercico11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod,quant;
        double total;
        cod = sc.nextInt();
        quant = sc.nextInt();
        if (cod == 1){
            double cachorroquente = 4.00;
            total = quant * cachorroquente;
            System.out.printf("total = $ %.2f%n",total);
        }
        else if (cod == 2){
            double xsalada = 4.50;
            total = quant * xsalada;
            System.out.printf("total = $ %.2f%n",total);
        }
        else if (cod == 3){
            double xbeacon = 5.00;
            total = quant * xbeacon;
            System.out.printf("total = $ %.2f%n",total);
        }
        else if (cod == 4){
            double torrada = 2.00;
            total = quant * torrada;
            System.out.printf("total = $ %.2f%n",total);
        }
        else {
            double refri = 1.50;
            total = quant * refri;
            System.out.printf("total = $ %.2f%n",total);
        }
        sc.close();
    }

}
