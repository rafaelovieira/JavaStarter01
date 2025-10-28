package exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        /*Calcular a média de duas notas*/
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a primeira nota: ");
            double n1 = sc.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double n2 = sc.nextDouble();
            double media = (n1 + n2) / 2;
            System.out.println("Média final: " + media);

    }
}
