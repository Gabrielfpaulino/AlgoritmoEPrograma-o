import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos (n): ");
        int n = sc.nextInt();

        long anterior = 0;
        long atual = 1;
        int contador = 1;

        System.out.println("Sequência de Fibonacci com " + n + " termos:");

        while (contador <= n) {
            System.out.print(anterior + " ");

            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            contador++;
        }

        System.out.println();

        sc.close();
    }
}
