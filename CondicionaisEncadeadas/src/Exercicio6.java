import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 10) {
            System.out.println("Infantil");
        } else if (idade >= 11 && idade <= 17) {
            System.out.println("Juvenil");
        } else if (idade >= 18) {
            System.out.println("Sênior");
        } else {
            System.out.println("Idade inválida! A idade mínima é 5 anos.");
        }

        sc.close();
    }
}
