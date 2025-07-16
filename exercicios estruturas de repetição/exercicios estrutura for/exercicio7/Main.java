import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int quadrado = 0;
        int cubo = 0;

        for (int i = 1; i <= N; i++) {

            quadrado = i * i;
            cubo = quadrado * i;

            System.out.printf("%d %d %d \n", i, quadrado, cubo);

        }

        sc.close();
    }
}