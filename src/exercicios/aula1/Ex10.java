package exercicios.aula1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        /*
        Programa que lê um número e diga se é positivo ou negativo.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

    }
}
