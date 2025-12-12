package resolucao_exercicios_01;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do dia da semana: ");
        String semana = input.nextLine().toLowerCase();

        switch (semana) {
            case "domingo":
                System.out.println("Domingo é o primeiro dia da semana!");
                break;
            case "segunda":
                System.out.println("Segunda-feira é o segundo dia da semana!");
                break;
            case "terça":
                System.out.println("Terça-feira é o terceiro dia da semana!");
                break;
            case "quarta":
                System.out.println("Quarta-feira é o quarto dia da semana!");
                break;
            case "quinta":
                System.out.println("Quinta-feira é o quinto dia da semana!");
                break;
            case "sexta":
                System.out.println("Sexta-feira é o sexto dia da semana!");
                break;
            case "sabado":
                System.out.println("Sábado é o sétimo dia da semana!");
                break;
            default:
                System.out.println("Digite um dia da semana válido!");
        }
    }
}
