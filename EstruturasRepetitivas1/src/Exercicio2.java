import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = sc.nextInt();

        int menor = Math.min(a, b);
        int maior = Math.max(a, b);

        int i = menor + 1;

        System.out.println("Números entre " + a + " e " + b + " em ordem crescente:");

        while (i < maior) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}
