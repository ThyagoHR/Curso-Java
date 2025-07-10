import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double Salario, Imposto;
        Salario = sc.nextDouble();

        if (Salario <= 2000){
            System.out.println("Isento");
        } else if (Salario < 3000) {
            Imposto = (Salario - 2000) * 0.08;
            System.out.printf("%.2f", Imposto);
        } else if (Salario < 4500) {
            Imposto = (Salario - 3000) * 0.18 + (1000 * 0.08);
            System.out.printf("%.2f", Imposto);
        } else {
            Imposto = (Salario - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
            System.out.printf("%.2f", Imposto);
        }

        sc.close();
    }
}