import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        x = sc.nextInt();
        
        //verificando se o numero é par ou impar

        if (x % 2 == 0){
            System.out.println("NUMERO PAR");
        } else {
            System.out.println("NUMERO IMPAR");

            sc.close();
        }
    }
}