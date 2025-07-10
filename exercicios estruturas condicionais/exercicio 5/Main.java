import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double Preco;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigo == 1){
            Preco = 4.00 * quantidade;
            System.out.printf("PREÇO: %.2f", Preco);
        } else if (codigo == 2) {
            Preco = 4.50 * quantidade;
            System.out.printf("PREÇO: %.2f", Preco);
        } else if (codigo == 3) {
            Preco = 5.00 * quantidade;
            System.out.printf("PREÇO: %.2f", Preco);
        } else if (codigo == 4) {
            Preco = 2.00 * quantidade;
            System.out.printf("PREÇO: %.2f", Preco);
        } else if (codigo == 5) {
            Preco = 1.50 * quantidade;
            System.out.printf("PREÇO: %.2f", Preco);
        } else {
            System.out.println("CÓDIGO INVÁLIDO");
        }
        sc.close();

    }
}