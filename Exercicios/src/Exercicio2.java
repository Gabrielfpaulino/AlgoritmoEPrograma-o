import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado + lado;

        System.out.println("An área do quadrado é: " + area);

        scanner.close();
    }
}
