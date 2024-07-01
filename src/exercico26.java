import entities.banco1;

import java.util.Locale;
import java.util.Scanner;

public class exercico26 {
    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            
            
            System.out.print("Enter account number: ");
            int number = sc.nextInt();
            System.out.print("Enter account holder: ");
            sc.nextLine();
            String name = sc.nextLine();
            Double saldo = 0.0;
            System.out.print("Is there na initial deposit (y/n) ? ");
            char  response = sc.next().charAt(0);
            if (response == 'y'){
                    System.out.print("Enter initial value: ");
                     saldo = sc.nextDouble();
            }
            System.out.println("Account data: ");
            System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n   ",number,name,saldo);
            banco1 banco1 = new banco1(name,number,saldo);








    }
}
