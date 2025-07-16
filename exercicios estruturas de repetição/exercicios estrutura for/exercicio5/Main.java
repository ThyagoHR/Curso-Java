import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Fatorial = 1;

        for (int i = 0; i < N; i++) {

            Fatorial *= (N - i);

        }

        System.out.printf("%d", Fatorial);

        sc.close();
    }
}