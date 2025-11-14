package exercicios.aula1;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        /*
        Faça um programa que faça o cadastro de um usuário (nome, usuario, login, senha)
        e depois ele possa fazer login com usuario cadastrado.
        */

        Scanner sc = new Scanner(System.in);

        String nomeCadastrado = "";
        String usuarioCadastrado = "";
        String senhaCadastrada = "";
        boolean cadastrado = false;

        System.out.println("===== SISTEMA DE CADASTRO E LOGIN =====");

        // Cadastro de usuário
        System.out.println("\n=== CADASTRO DE USUÁRIO ===");
        System.out.print("Digite o nome completo: ");
        nomeCadastrado = sc.nextLine();

        System.out.print("Crie um nome de usuário: ");
        usuarioCadastrado = sc.nextLine();

        System.out.print("Crie uma senha: ");
        senhaCadastrada = sc.nextLine();

        cadastrado = true;
        System.out.println("\nUsuário cadastrado com sucesso!\n");

        // Login do usuário
        if (cadastrado) {
            System.out.println("=== LOGIN ===");

            System.out.print("Usuário: ");
            String usuarioLogin = sc.nextLine();

            System.out.print("Senha: ");
            String senhaLogin = sc.nextLine();

            if (usuarioLogin.equals(usuarioCadastrado) && senhaLogin.equals(senhaCadastrada)) {
                System.out.println("\nLogin realizado com sucesso! Bem-vindo(a), " + nomeCadastrado + "!");
            } else {
                System.out.println("\nUsuário ou senha incorretos. Tente novamente.");
            }
        }
    }
}
