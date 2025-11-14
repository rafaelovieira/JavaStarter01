package exercicios.aula1;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

        /*
        Criar um programa em Java que simule um menu de autoatendimento para uma clínica médica,
        onde o paciente pode escolher uma das opções do menu digitando um número.

           ==== MENU CLÍNICA SAÚDE TOTAL ====
            1 - Agendar consulta
            2 - Cancelar consulta
            3 - Verificar resultados de exames
            4 - Falar com atendente
            5 - Sair
        */
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("==== MENU CLÍNICA SAÚDE TOTAL ====");
        System.out.println("1 - Agendar consulta");
        System.out.println("2 - Cancelar consulta");
        System.out.println("3 - Verificar resultados de exames");
        System.out.println("4 - Falar com atendente");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu: Agendar consulta");
                break;
            case 2:
                System.out.println("Você escolheu: Cancelar consulta");
                break;
            case 3:
                System.out.println("Você escolheu: Verificar resultados de exames");
                break;
            case 4:
                System.out.println("Você escolheu: Falar com atendente");
                break;
            case 5:
                System.out.println("Encerrando o sistema... Obrigado por usar a Clínica Saúde Total!");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

    }

}
