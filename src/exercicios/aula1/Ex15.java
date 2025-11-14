package exercicios.aula1;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        /*
        Faça um programa que seja o cardápio de um restaurante, o usuário
        escolhe o produto e ao final mostre o total do pedido.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CARDÁPIO DIGITAL =====");
        System.out.println("1 - Hambúrguer ........ R$ 25,00");
        System.out.println("2 - Pizza ............. R$ 40,00");
        System.out.println("3 - Salada ............ R$ 18,00");
        System.out.println("4 - Suco Natural ...... R$ 10,00");
        System.out.println("5 - Refrigerante ...... R$ 8,00");
        System.out.println("6 - Finalizar pedido");
        System.out.println("============================");

        double total = 0;
        int opcao;

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu: Hambúrguer 🍔");
                    total += 25.00;
                    break;
                case 2:
                    System.out.println("Você escolheu: Pizza 🍕");
                    total += 40.00;
                    break;
                case 3:
                    System.out.println("Você escolheu: Salada 🥗");
                    total += 18.00;
                    break;
                case 4:
                    System.out.println("Você escolheu: Suco Natural 🥤");
                    total += 10.00;
                    break;
                case 5:
                    System.out.println("Você escolheu: Refrigerante 🧃");
                    total += 8.00;
                    break;
                case 6:
                    System.out.println("Finalizando pedido...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        System.out.println("============================");
        System.out.printf("Total do pedido: R$ %.2f%n", total);
        System.out.println("Obrigado pela preferência! 😊");
    }
}
