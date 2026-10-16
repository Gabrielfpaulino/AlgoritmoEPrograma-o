import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SENHA = 2026;
        final int MAX_TENTATIVAS = 3;

        int tentativas = 0;
        boolean acertou = false;

        while (tentativas < MAX_TENTATIVAS && !acertou) {
            System.out.print("Digite a senha: ");
            int digitada = sc.nextInt();
            tentativas++;

            if (digitada == SENHA) {
                acertou = true;
            }
        }

        if (acertou) {
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Terminal Bloqueado!");
        }

        sc.close();
    }
}
