package resolucao_exercicios_01;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idadeAnos = input.nextInt();

        int idadeMeses = idadeAnos * 12;

        System.out.println("A sua idade corresponde a " + idadeMeses + " meses!");
    }
}
