import entities.product;

import java.util.Locale;
import java.util.Scanner;

public class OrientadaAobJetoprt2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:  ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock:  ");
        int quantity = sc.nextInt();

        product product = new product(name, quantity,price);

        product.setName("Computer");
        System.out.println("update name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Update price: " + product.getPrice());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of Products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updater data: " + product);

        System.out.println();
        System.out.print("Enter the number of Products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        sc.close();
    }
}
