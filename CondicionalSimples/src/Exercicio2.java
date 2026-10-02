import java.util.Scanner;

public class Exercicio2 {
    static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a idade do nadador: ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Categoria Adulta");
            }

            scanner.close();
        }
    }


