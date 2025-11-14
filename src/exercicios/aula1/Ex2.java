package exercicios.aula1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /*Faça um programa que lê dois números e exibe a soma dos números informados*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("A soma é: " + (n1 + n2));
    }
}
