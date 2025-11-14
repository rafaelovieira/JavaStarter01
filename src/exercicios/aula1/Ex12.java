package exercicios.aula1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        /*
        Programa que lê 4 notas, calcula a média do aluno e diga se ele está aprovado ou reprovado, neste caso a
        média precisa ser 7 para ser aprovado
        */
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a 4ª nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado! 🎉");
        } else {
            System.out.println("Aluno reprovado! 😞");
        }


    }
}
