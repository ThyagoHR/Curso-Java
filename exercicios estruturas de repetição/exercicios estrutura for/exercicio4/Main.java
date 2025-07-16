import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int QuantidadeNumeros = sc.nextInt();
        double Divisao = 0;

        for (int i = 0; i <  QuantidadeNumeros; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b != 0){
                Divisao = (double) a / b;
                System.out.printf("%.1f \n", Divisao);
            } else {
                System.out.println("Divisão impossível");
            }
        }


        sc.close();
    }
}