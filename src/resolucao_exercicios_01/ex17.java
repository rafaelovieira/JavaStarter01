package resolucao_exercicios_01;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeCadastro = "";
        String usuarioCadastro = "";
        String senhaCadastro = "";
        boolean cadastro = false;

        System.out.println("\n=== CADASTRO DE USUÁRIOS ===");
        System.out.println("Digite seu nome completo: ");
        nomeCadastro = input.nextLine();

        System.out.println("Crie um nome de usuário: ");
        usuarioCadastro = input.nextLine();

        System.out.println("Crie uma senha: ");
        senhaCadastro = input.nextLine();

        if (nomeCadastro.trim().isEmpty() || usuarioCadastro.trim().isEmpty()) {
            System.out.println("❌ Os campos não podem ficar vazios, favor preencher corretamente!");
            cadastro = false;
        } else if (senhaCadastro.length() <6) {
            System.out.println("❌ Sua senha tem que ter no mínimo 6 dígitos, tente novamente!");
            cadastro = false;
        } else {
            System.out.println("\n✅ O usuário foi cadastrado com sucesso! Faça o login para prosseguir.\n");
            cadastro = true;
        }

        if (cadastro) {
            System.out.println("=== LOGIN USUÁRIO ===");

            System.out.println("Usuário: ");
            String usuarioLogin = input.nextLine();

            System.out.println("Senha: ");
            String senhaLogin = input.nextLine();

            if (usuarioLogin.equals(usuarioCadastro) && senhaLogin.equals(senhaCadastro)) {
                System.out.println("\n🔓 Login realizado com sucesso. Seja bem-vindo " + nomeCadastro + "!");
            } else {
                System.out.println("\n🔒 Usuário ou senha incorreta, tente novemante!");
            }
        }
    }
}
