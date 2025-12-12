package resolucao_exercicios_01;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        numero--;

        System.out.println("O decremento do número digitado é: " + numero);
    }
}
