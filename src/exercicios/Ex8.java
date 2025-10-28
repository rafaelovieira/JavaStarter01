package exercicios;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        /*
        Programa que leia dois número, a primeira entrada precisa ser incrementado com o valor informando na segunda entrada
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o valor a incrementar: ");
        int incremento = sc.nextInt();

        numero1 += incremento; // incrementa o primeiro número pelo valor informado

        System.out.println("O novo valor é: " + numero1);
    }
}
