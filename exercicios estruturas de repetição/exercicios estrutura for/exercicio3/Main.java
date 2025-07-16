import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int QuantidadeNumeros = sc.nextInt();
        double Media = 0;


        for (int i = 0; i < QuantidadeNumeros; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            Media = (a * 2 + b * 3 + c * 5) / 10;

            System.out.printf("%.1f \n", Media);

        }

        sc.close();
    }
}