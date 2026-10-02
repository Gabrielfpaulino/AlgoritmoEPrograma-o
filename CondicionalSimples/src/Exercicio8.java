import java.util.Scanner;
public class Exercicio8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        double temp;

        // Coloca o menor valor em A
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        // Coloca o segundo menor em B (o maior fica em C)
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Valores em ordem crescente: " + a + ", " + b + ", " + c);

        scanner.close();
    }
}
