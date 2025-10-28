package exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

          /*
        Faça um programa que ler dois números e exibe o maior número
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os dois números são iguais!");
        }

    }
}
