import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial (°K): ");
        double inicial = sc.nextDouble();

        System.out.print("Digite o valor final (°K): ");
        double finalK = sc.nextDouble();

        System.out.print("Digite o passo (incremento): ");
        double passo = sc.nextDouble();

        while (passo <= 0) {
            System.out.print("Passo inválido. Digite um valor maior que zero: ");
            passo = sc.nextDouble();
        }

        double kelvin = inicial;

        System.out.println();
        System.out.println("---------------------------");
        System.out.printf("| %10s | %10s |%n", "Kelvin (K)", "Celsius (°C)");
        System.out.println("---------------------------");

        while (kelvin <= finalK) {
            double celsius = kelvin - 273.15;
            System.out.printf("| %10.2f | %10.2f |%n", kelvin, celsius);
            kelvin += passo;
        }

        System.out.println("---------------------------");

        sc.close();
    }
}
