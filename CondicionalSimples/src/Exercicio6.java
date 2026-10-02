import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("Idade: " + idade + " anos");

        if (idade >= 16) {
            System.out.println("Já tem idade para votar");
        } else {
            System.out.println("Ainda não tem idade para votar");
        }

        if (idade >= 18) {
            System.out.println("Já tem idade para dirigir");
        } else {
            System.out.println("Ainda não tem idade para dirigir");
        }

        scanner.close();
    }
}
