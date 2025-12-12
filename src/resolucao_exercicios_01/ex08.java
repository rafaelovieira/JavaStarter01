package resolucao_exercicios_01;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = input.nextInt();

        System.out.println("Digite um segundo número: ");
        int numero2 = input.nextInt();

        numero1 += numero2;

        System.out.println("O valor incrementado é " + numero1);
    }
}
