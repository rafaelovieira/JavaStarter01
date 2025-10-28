package exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        /*Converter idade em meses*/
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Você tem " + (idade * 12) + " meses de vida.");

    }
}
