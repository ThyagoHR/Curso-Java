import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int valor1, valor2, resultado;

        Scanner sc = new Scanner(System.in);

        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        sc.close();

        resultado = valor1 + valor2;

        System.out.printf("A soma de %d e %d é %d", valor1, valor2, resultado);

    }
}