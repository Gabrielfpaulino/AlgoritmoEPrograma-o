import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        if (preco <= 50) {
            System.out.println("Barato");
        } else if (preco <= 100) {
            System.out.println("Médio");
        } else {
            System.out.println("Caro");
        }

        sc.close();
    }
}
