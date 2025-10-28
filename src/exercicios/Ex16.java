package exercicios;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        /*
        Programa que faça a leitura de um formulario de cadastro de pessoas, e a partir das respostas,
        diga qual é o sexo da pessoa, se é maior ou menor de idade.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("===== FORMULÁRIO DE CADASTRO =====");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        sc.nextLine(); // limpa o buffer do teclado

        System.out.print("Digite seu sexo (M/F): ");
        String sexo = sc.nextLine().toUpperCase();

        System.out.println("\n===== RESULTADO DO CADASTRO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");

        if (sexo.equals("M")) {
            System.out.println("Sexo: Masculino");
        } else if (sexo.equals("F")) {
            System.out.println("Sexo: Feminino");
        } else {
            System.out.println("Sexo: Não informado corretamente");
        }

        if (idade >= 18) {
            System.out.println("Situação: Maior de idade");
        } else {
            System.out.println("Situação: Menor de idade");
        }

    }
}
