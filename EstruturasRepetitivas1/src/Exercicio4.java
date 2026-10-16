import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        while (numero <= 0) {
            System.out.print("Valor inválido. Digite um número inteiro positivo: ");
            numero = sc.nextInt();
        }

        for (int i = numero; i >= 0; i--) {
            System.out.println("Sistema operando. T-menos " + i + " segundos;");
        }

        sc.close();
    }
}
