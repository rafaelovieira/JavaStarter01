package resolucao_exercicios_01;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        if (numero > 0) {
            System.out.println("O número digitado é positivo!");
        } else if (numero < 0) {
            System.out.println("O número digitado é negativo!");
        } else {
            System.out.println("Digite um número diferente de zero!");
        }
    }
}
