package resolucao_exercicios_01;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua 1º nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite sua 2º nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite sua 3º nota: ");
        double nota3 = input.nextDouble();

        System.out.println("Digite sua 4º nota: ");
        double nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Você está aprovado, sua média foi " + media);
        } else {
            System.out.println("Você foi reprovado, sua média foi " + media);
        }
    }
}
