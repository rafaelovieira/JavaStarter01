package resolucao_exercicios_01;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("[1] - Pizza de Java..........R$ 59,99");
        System.out.println("[2] - Pizza de Python........R$ 54,99");
        System.out.println("[3] - Pizza de C#............R$ 34,99");
        System.out.println("[4] - Pizza de JavaScript....R$ 39,99");
        System.out.println("[5] - Pizza de GO............R$ 44,99");
        System.out.println("[6] - Pizza de SQL...........R$ 49,99");
        System.out.println("[7] - Pizza de PHP...........R$ 29,99");
        System.out.println("[8] - Finalizar pedido");
        System.out.println("[9] - Sair");
        System.out.println("=====================================");
        System.out.println("Escolha o sabor da sua pizza:");

        int opcao = input.nextInt();
        double valorTotal = 0;

        switch (opcao) {
            case 1:
                System.out.println("Sabor escolhido: Pizza de Java");
                valorTotal += 59.99;
                break;
            case 2:
                System.out.println("Sabor escolhido: Pizza de Python");
                valorTotal += 54.99;
                break;
            case 3:
                System.out.println("Sabor escolhido: Pizza de C#");
                valorTotal += 34.99;
                break;
            case 4:
                System.out.println("Sabor escolhido: Pizza de JavaScript");
                valorTotal += 39.99;
                break;
            case 5:
                System.out.println("Sabor escolhido: Pizza de GO");
                valorTotal += 44.99;
                break;
            case 6:
                System.out.println("Sabor escolhido: Pizza de SQL");
                valorTotal += 49.99;
                break;
            case 7:
                System.out.println("Sabor escolhido: Pizza de PHP");
                valorTotal += 29.99;
                break;
            case 8:
                System.out.println("Favor aguarde, estamos processando o seu pedido");
                break;
            case 9:
                System.out.println("Deseja realmente sair?");
                break;
            default:
                System.out.println("Opção inválida, favor verificar sabores disponíveis.");
        }
        System.out.println("Valor total: R$ " + valorTotal);
    }
}
