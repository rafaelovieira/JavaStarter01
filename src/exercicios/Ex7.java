package exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        /*
        Programa que receba um número e faça o decremento do valor e exiba o resultado.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        numero--; // decrementa 1 do valor digitado

        System.out.println("Após o decremento, o valor é: " + numero);

    }
}
