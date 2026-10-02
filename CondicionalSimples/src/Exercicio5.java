import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println("O número é múltiplo de 5 e de 3 ao mesmo tempo");
        } else {
            System.out.println("O número NÃO é múltiplo de 5 e de 3 ao mesmo tempo");
        }

        scanner.close();
    }

}
