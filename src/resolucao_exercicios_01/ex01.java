package resolucao_exercicios_01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        int dobro = numero * 2;
        int triplo = numero * 3;

        System.out.println("O número digitado foi: " + numero + ", o dobro desse número é: " + dobro + " e o triplo é: " + triplo);
    }
}
