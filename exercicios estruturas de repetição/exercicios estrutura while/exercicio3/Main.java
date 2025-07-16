import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a opção que deseja abastecer");
        System.out.println("1.Alcool");
        System.out.println("2.Gasolina");
        System.out.println("3.Diesel");
        System.out.println("4.Fim");

        int X, Gasolina, Alcool, Diesel;
        X = sc.nextInt();
        Alcool = 0;
        Gasolina = 0;
        Diesel = 0;

        while (X != 4) {
            if (X == 1){
            Alcool ++;
            } else if (X == 2) {
                Gasolina ++;
            } else if (X == 3) {
                Diesel ++;
            }

            X = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.printf("Alcool = %d \n", Alcool);
        System.out.printf("Gasolina = %d \n", Gasolina);
        System.out.printf("Diesel = %d \n", Diesel);

        sc.close();
    }
}