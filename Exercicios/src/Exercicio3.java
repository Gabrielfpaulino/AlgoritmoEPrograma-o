import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quantos números voce quer calcular a média? ");
        int quantidade = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= quantidade; i++){
            System.out.println("digite o número " + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma / quantidade;

        System.out.println(" A média aritmética é: " + media);

        scanner.close();
    }
}
