package exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*
        Faça um programa de calculadora, o usuário deve digitar o primeiro número, depois o sinal referente ao
        cálculo matemático (+ - * /) e o segundo número, após os três inputs, deve fazer o cálculo dos valores
        informados baseado no sinal informado no segundo input.
    */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        sc.nextLine(); // esta linha limpar o buffer do teclado

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = sc.nextLine();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("Operador inválido!");
        }
    }
}
