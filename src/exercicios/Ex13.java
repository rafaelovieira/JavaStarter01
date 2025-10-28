package exercicios;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        /*
        Programa que lê o dia da semana (terca/quarta/quinta) e diga se é o primeiro dia da semana, segundo dia, terceiro dia
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia da semana (segunda, terca, quarta, quinta, sexta, sabado, domingo): ");
        String dia = sc.nextLine().toLowerCase(); // converte para minúsculo

        switch (dia) {
            case "segunda":
                System.out.println("Primeiro dia da semana útil.");
                break;
            case "terca":
                System.out.println("Segundo dia da semana útil.");
                break;
            case "quarta":
                System.out.println("Terceiro dia da semana útil.");
                break;
            case "quinta":
                System.out.println("Quarto dia da semana útil.");
                break;
            case "sexta":
                System.out.println("Quinto dia da semana útil.");
                break;
            case "sabado":
                System.out.println("Fim de semana - sexto dia.");
                break;
            case "domingo":
                System.out.println("Fim de semana - sétimo dia.");
                break;
            default:
                System.out.println("Dia inválido. Tente novamente.");
        }
    }
}
