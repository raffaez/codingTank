package lista1;

import java.util.Scanner;

public class MathsOperations {
    public static void main(String[] args){
        /**
         * Crie um programa que receba 2 números e ao final mostre as seguintes operações:
         * Soma
         * Subtração
         * Multiplicação
         * Divisão
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = scan.nextInt();

        System.out.print("Second number: ");
        double num2 = scan.nextInt();

        showOperations(num1, num2);
    }

    public static void showOperations(double num1, double num2){
        System.out.println("\n##### OUTPUT #####");
        System.out.printf("\n%.1f + %.1f = %.1f", num1, num2, num1 + num2);
        System.out.printf("\n%.1f - %.1f = %.1f", num1, num2, num1 - num2);
        System.out.printf("\n%.1f * %.1f = %.1f", num1, num2, num1 * num2);
        System.out.printf("\n%.1f / %.1f = %.1f", num1, num2, num1 / num2);
    }
}
