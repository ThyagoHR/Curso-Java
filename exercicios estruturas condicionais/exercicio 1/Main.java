import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X;

        X = sc.nextInt();
        //Verificando se o numero inserido é positivo, negativo ou neutro
        if (X < 0) {
            System.out.println("NEGATIVO");
        } else if (X == 0){
            System.out.println("NEUTRO");
        } else {
            System.out.println("POSITIVO");
        }

        sc.close();

    }
}