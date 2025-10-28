package exercicios;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

    /*
    Crie um programa que leia um número e mostre o dobro e o triplo dele.
    * */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int dobro = numero * 2;
        int triplo = numero * 3;

        System.out.println("O dobro de " + numero + " é: " + dobro);
        System.out.println("O triplo de " + numero + " é: " + triplo);
    }

}
