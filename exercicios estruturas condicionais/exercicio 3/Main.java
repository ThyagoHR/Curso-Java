import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        //Verificando se os numeros sao multiplos

        if (A % B == 0 || B % A == 0){
            System.out.println("SÃO MULTIPLOS");
        }else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }

        sc.close();
    }
}