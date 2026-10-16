import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int contador = 0;

        System.out.print("Digite a temperatura (999 para encerrar): ");
        double temperatura = sc.nextDouble();

        while (temperatura != 999) {
            soma += temperatura;
            contador++;

            System.out.print("Digite a temperatura (999 para encerrar): ");
            temperatura = sc.nextDouble();
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.printf("Média das %d temperaturas válidas: %.2f%n", contador, media);
        } else {
            System.out.println("Nenhuma temperatura válida foi lida.");
        }

        sc.close();
    }
}
