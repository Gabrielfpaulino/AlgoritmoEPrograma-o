import java.util.Scanner;

public class Exercicio7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os valores podem formar um triângulo");
        } else {
            System.out.println("Os valores NÃO podem formar um triângulo");
        }

        scanner.close();
    }
}
