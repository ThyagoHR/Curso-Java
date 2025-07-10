import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoProduto1, codigoProduto2, quantidadeProdutos1, quantidadeProdutos2;
        double precoUnitario1, precoUnitario2, total;

        System.out.println("Insira o código da peça");
        codigoProduto1 = sc.nextInt();
        System.out.println("Insira a quantidade de produtos");
        quantidadeProdutos1 = sc.nextInt();
        System.out.println("Insira o preço do produto");
        precoUnitario1 = sc.nextDouble();
        System.out.println("Insira o código da peça");
        codigoProduto2 = sc.nextInt();
        System.out.println("Insira a quantidade de produtos");
        quantidadeProdutos2 = sc.nextInt();
        System.out.println("Insira o preço do produto");
        precoUnitario2 = sc.nextDouble();

        total = precoUnitario1 * quantidadeProdutos1 + precoUnitario2 * quantidadeProdutos2;

        System.out.printf("TOTAL A PAGAR: %.2f", total);

        sc.close();
    }
}