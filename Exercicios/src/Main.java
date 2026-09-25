import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("qual sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("qual a sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Seu nome é: " + nome + " sua idade é: " + idade + " gare sua altura é: " + altura);

        scanner.close();

    }

}
