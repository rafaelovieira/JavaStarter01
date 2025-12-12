package resolucao_exercicios_01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = input.nextInt();

        System.out.println("Digite um segundo número: ");
        int numero2 = input.nextInt();

        if (numero1 > numero2) {
            System.out.println("Entre os dois números digitados, " + numero1 + " é o maior deles.");
        } else if (numero2 > numero1) {
            System.out.println("Entre os dois números digitados, " + numero2 + " é o maior deles.");
        } else {
            System.out.println("Inválido. Digite dois números diferentes!");
        }
    }
}
