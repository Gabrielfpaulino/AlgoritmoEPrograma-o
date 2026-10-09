import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = Character.toLowerCase(sc.next().charAt(0));

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;
            default:
                if (Character.isLetter(letra)) {
                    System.out.println("Consoante");
                } else {
                    System.out.println("Caractere inválido! Digite uma letra.");
                }
        }

        sc.close();
    }
}






