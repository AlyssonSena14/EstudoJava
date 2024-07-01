import java.util.Scanner;

public class exercico15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acol = 0;
        int gasolina = 0;
        int etanol = 0;
        int sair = 0;
        int codigo = sc.nextInt();

        while (codigo !=4){
            if (codigo == 1){
                acol +=1;
            }
            else if (codigo == 2){
                gasolina += 1;
            }
            else if (codigo == 3){
                etanol += 1;
            }
            else {
                System.out.println("Codigo invalido! ");

            }
            codigo = sc.nextInt();


        }
        System.out.println("Muito obrigado ! ");
        System.out.println("Acol: " + acol);
        System.out.println(" Gasolina: " + gasolina);
        System.out.println(" Etanol: " + etanol);


        sc.close();



    }
}
