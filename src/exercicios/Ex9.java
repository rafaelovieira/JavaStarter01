package exercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        /*
        Programa que lê dois número, a primeira entrada precisa ser multiplicado com o valor informando na segunda entrada.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o valor para multiplicar: ");
        int numero2 = sc.nextInt();

        numero1 *= numero2; // multiplica o primeiro número pelo segundo

        System.out.println("O resultado é: " + numero1);
    }
}
