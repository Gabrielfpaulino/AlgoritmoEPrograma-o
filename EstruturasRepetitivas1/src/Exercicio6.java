import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int QUANTIDADE = 10;

        double soma = 0;
        double maior = 0;
        double menor = 0;

        for (int i = 1; i <= QUANTIDADE; i++) {
            System.out.print("Digite a altura do bloco " + i + ": ");
            double altura = sc.nextDouble();

            soma += altura;

            if (i == 1) {
                maior = altura;
                menor = altura;
            } else {
                if (altura > maior) {
                    maior = altura;
                }
                if (altura < menor) {
                    menor = altura;
                }
            }
        }

        double media = soma / QUANTIDADE;

        System.out.printf("Altura média: %.2f%n", media);
        System.out.printf("Maior altura: %.2f%n", maior);
        System.out.printf("Menor altura: %.2f%n", menor);

        sc.close();
    }
}
