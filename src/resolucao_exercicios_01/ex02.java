package resolucao_exercicios_01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = input.nextInt();

        System.out.println("Digite um segundo número: ");
        int numero2 = input.nextInt();

        int soma = numero1 + numero2;

        System.out.println("Você digitou os números: " + numero1 + " e " + numero2 + ". A soma deles é: " + soma);
    }
}
