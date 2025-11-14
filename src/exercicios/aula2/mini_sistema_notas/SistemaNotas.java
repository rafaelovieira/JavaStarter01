package exercicios.aula2.mini_sistema_notas;

import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        Disciplina disciplina = new Disciplina();

        int opcao = -1;

        System.out.println("\n===== SISTEMA DE NOTAS =====");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Cadastrar disciplina");
        System.out.println("3 - Associar notas da disciplina ao aluno");
        System.out.println("4 - Listar aluno com suas notas");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");

        opcao = sc.nextInt();
        sc.nextLine(); // limpar \n do buffer

        switch (opcao) {

            case 1:
                System.out.print("Nome do aluno: ");
                String nomeAluno = sc.nextLine();

                System.out.print("Matrícula do aluno: ");
                String matricula = sc.nextLine();

                aluno.cadastrarAluno(nomeAluno, matricula);
                System.out.println("Aluno " + nomeAluno + " cadastrado com sucesso!");
                break;

            case 2:
                System.out.print("Nome da disciplina: ");
                String nomeDisc = sc.nextLine();

                System.out.print("Código da disciplina: ");
                String codigo = sc.nextLine();

                disciplina.cadastrarDisciplina(nomeDisc, codigo);
                aluno.associarDisciplina(disciplina);

                System.out.println("Disciplina " + nomeDisc + " cadastrada e associada ao aluno!");
                break;

            case 3:
                System.out.print("Informe a Nota 1: ");
                double n1 = sc.nextDouble();

                System.out.print("Informe a Nota 2: ");
                double n2 = sc.nextDouble();

                disciplina.cadastrarNotas(n1, n2);
                System.out.println("Notas cadastradas com sucesso!");
                break;

            case 4:
                aluno.exibirDadosAluno();
                break;

            case 0:
                System.out.println("Encerrando o sistema...");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente!");
        }


        sc.close();
    }
}
