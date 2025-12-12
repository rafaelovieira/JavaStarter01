package resolucao_exercicios_01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero1 = input.nextDouble();

        System.out.println("Digite um operador matemático (+, -, * ou /) : ");
        String op = input.next();

        System.out.println("Digite um segundo número: ");
        double numero2 = input.nextDouble();

        if (op.equals("+")) {
            System.out.println("O resultado da soma entre os dois números é " + (numero1 + numero2));
        } else if (op.equals("-")) {
            System.out.println("O resultado da diferença entre os dois números é " + (numero1 - numero2));
        } else if (op.equals("*")) {
            System.out.println("O resultado da multiplicação entre os dois números é " + (numero1 * numero2));
        } else if ((op.equals("/")) && (numero2 != 0)) {
            System.out.println("O resultado da divisão entre os dois números é " + (numero1 / numero2));
        } else if ((op.equals("/")) && (numero2 <= 0)) {
            System.out.println("Não é possível dividir por zero!");
        } else {
            System.out.println("Operador matemático inválido, favor escolher um válido.");
        }
    }
}
