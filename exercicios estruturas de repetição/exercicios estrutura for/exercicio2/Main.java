import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int QuantidadeNumeros = sc.nextInt();
        int in = 0;
        int out = 0; 

        for (int i = 0; i < QuantidadeNumeros; i++) {

            int X = sc.nextInt();

            if (X >= 10 && X <= 20){
                in++;
            }else {
                out++;
            }
        }

        System.out.printf("%d in \n", in);
        System.out.printf("%d out \n", out);


        sc.close();
    }
}