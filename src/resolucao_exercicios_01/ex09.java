package resolucao_exercicios_01;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = input.nextInt();

        numero1 *= numero2;

        System.out.println("O valor multiplicado é  " + numero1);
    }
}
