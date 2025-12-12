package resolucao_exercicios_01;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nOlá, eu sou a atendente virtual da Clínica Médica e vou ajudar você nesse atendimento.\n");
        System.out.println("[1] Agendamentos");
        System.out.println("[2] Resultados");
        System.out.println("[3] Encerrar");
        System.out.println("Escolha uma das opções acima para prosseguirmos: ");
        int opcaoMenu = input.nextInt();

        if (opcaoMenu == 1) {
            System.out.println("\n=== MENU AGENDAMENTOS ===");
            System.out.println("[1] Agendar Consulta");
            System.out.println("[2] Agendar Exame");
            System.out.println("Digite uma opção: ");
            int opcaoAgendamento = input.nextInt();

            if (opcaoAgendamento == 1) {
                System.out.println("\n=== AGENDAMENTO DE CONSULTAS ===");
                System.out.println("[1] Cardiologista");
                System.out.println("[2] Nutricionista");
                System.out.println("[3] Ortopedista");
                System.out.println("Escolha a especialidade para a consulta: ");
                int opcaoEspecialidade = input.nextInt();

                switch (opcaoEspecialidade) {
                    case 1:
                        System.out.println("✅ A sua consulta com o Dr Cardiologista foi marcada.");
                        break;
                    case 2:
                        System.out.println("✅ A sua consulta com o Dr Nutricionista foi marcada.");
                        break;
                    case 3:
                        System.out.println("✅ A sua consulta com o Dr Ortopedista foi marcada.");
                        break;
                    default:
                        System.out.println("❌ Especialidade não encontrada, escolha uma das opções acima.");
                }

            } else if (opcaoAgendamento == 2) {
                System.out.println("\n=== AGENDAMENTO DE EXAMES ===");
                System.out.println("[1] Eletrocardiograma");
                System.out.println("[2] Hemograma");
                System.out.println("[3] Raio X");
                System.out.println("[4] Teste Ergométrico");
                System.out.println("[5] Ultrassonografia");
                System.out.println("Escolha qual exame você quer agendar: ");
                int opcaoExame = input.nextInt();

                switch (opcaoExame) {
                    case 1:
                        System.out.println("✅ O seu exame Eletrocardiograma foi marcado.");
                        break;
                    case 2:
                        System.out.println("✅ O seu exame de Hemograma foi marcado.");
                        break;
                    case 3:
                        System.out.println("✅ O seu exame de Raio X foi marcado.");
                        break;
                    case 4:
                        System.out.println("✅ O seu exame Ergométrico foi marcado.");
                        break;
                    case 5:
                        System.out.println("✅ O seu exame de Ultrassonografia foi marcado.");
                    default:
                        System.out.println("❌ Exame não encontrado, escolha uma das opções acima.");
                }
            } else {
                System.out.println("❌ Opção inválida, escolha uma das opções acima.");
            }

        } else if (opcaoMenu == 2) {
            System.out.println("\n=== MENU RESULTADOS ===");
            System.out.println("[1] Download arquivo");
            System.out.println("[2] Enviar por email");
            System.out.println("Digite uma opção: ");
            int opcaoResultado = input.nextInt();

            switch (opcaoResultado) {
                case 1:
                    System.out.println("\n⏳ Aguarde um momento, enquanto carregamos o seu arquivo...");
                    break;
                case 2:
                    System.out.println("\n✉️ Resultado enviado para o email cadastrado.");
                    break;
                default:
                    System.out.println("\n❌ Opção inválida, escolha uma das opções acima.");
            }

        } else if (opcaoMenu == 3){
            System.out.println("\nAtendimento encerrado.");
        } else {
            System.out.println("\n❌ Opção inválida, escolha uma das opções acima.");
        }
    }
}
