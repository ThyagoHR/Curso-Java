import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double X = 10.0978;
        Locale.setDefault(Locale.US);
        System.out.println(X);
        System.out.printf("%.2f\n", X);
        System.out.printf("%.3f\n", X);
        System.out.println("Olá mundo!");
        System.out.println("RESULTADO = " + X + " METROS");
        System.out.printf("resultado = %.2f metros\n", X);

        String nome = "Maria";
        int idade = 18;
        double renda = 2.100;

        System.out.printf("%s tem %d anos e ganha %.3f reais.\n", nome, idade, renda);

    }
}