import java.util.Locale;
import java.util.Scanner;

public class exercico2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner SC = new Scanner(System.in);

        System.out.println("qual a largura do terreno ?");
        double largura = SC.nextDouble();
        System.out.println("qual a comprimento do terreno ?");
        double comprimento = SC.nextDouble();
        System.out.println("qual o valor por metros quadrado ?");
        double metroquadrado = SC.nextDouble();
        double area = largura * comprimento;
        double preço = area * metroquadrado;

        System.out.printf("a area do terreno e igaul a %.2f%n",area);
        System.out.printf("Preço terreno por metros quadrado e igual a %.2f",preço);


        SC.close();




    }
}
