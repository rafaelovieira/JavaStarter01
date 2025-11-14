package exercicios.aula1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        /*
        Programa que lê uma idade e diga se é maior de idade ou menor de idade
        */

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
            sc.close();

    }
}
