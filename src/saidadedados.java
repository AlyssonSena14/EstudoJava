import java.util.Locale;

public class saidadedados {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        int y = (31);
        String nome = "maria";
        double x = (35.10023);
        double renda = (4000.0);
        System.out.printf("Resulatado = %.2f metros%n",x);
        System.out.printf("%s tem %d anos e ganha %.2f reais", nome, y, renda);


    }
}
