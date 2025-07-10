import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario;
        double salario, salarioHora, horasTrabalhadas;

        System.out.println("Insira o seu número:");
        numeroFuncionario = sc.nextInt();
        System.out.println("Insira a quantidade de horas trabalhadas");
        horasTrabalhadas = sc.nextDouble();
        System.out.println("Insira o valor do salario por hora");
        salarioHora = sc.nextDouble();

        salario = salarioHora * horasTrabalhadas;

        System.out.printf("Número do funcionário: %d\n", numeroFuncionario);
        System.out.printf("Salário do funcionário: %.2f\n", salario);

        sc.close();
    }
}