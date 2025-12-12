package resolucao_exercicios_01;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("REALIZE O SEU CADASTRO ABAIXO");
        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.println("Qual o seu gênero?");
        String genero = input.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = input.nextInt();

        System.out.println("Crie uma senha de 6 dígitos: ");
        String senha = input.nextLine();

        if (idade >= 18) {
            System.out.println("Você é maior de idade e o seu cadastro foi realizado com sucesso!");
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Gênero: " + genero);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Usuário: " + nome.toLowerCase() + sobrenome.toLowerCase());
            System.out.println("Senha: ******");
        } else {
            System.out.println("Você é menor de idade e não pode se cadastrar na plataforma!");
        }
    }
}
