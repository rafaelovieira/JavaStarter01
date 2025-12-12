package resolucao_exercicios_01;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média das suas notas é: " + media);
    }
}
