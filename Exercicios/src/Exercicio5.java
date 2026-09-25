import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        // classificação do IMC
        if (imc < 18.5){
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação:Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade Grau II");
        } else {
            System.out.println("Classificação: Obesidade Grau III");
        }

        scanner.close();

    }
}
