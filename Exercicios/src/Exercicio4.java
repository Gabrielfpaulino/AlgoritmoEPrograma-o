import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cotacao = 5.00;

        System.out.println("Digite o valor em reais (R$): ");
        double valorReais = scanner.nextDouble();

        double valorDolares = valorReais / cotacao;

        System.out.printf("R$ %.2f equivalem a US$ %.2f%n", valorReais, valorDolares);

        scanner.close();
    }
}
