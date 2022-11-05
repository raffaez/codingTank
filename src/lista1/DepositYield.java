package lista1;

import java.util.Scanner;

public class DepositYield {
    /**
     * Crie um programa que receba um valor que foi depositado e logo em seguida o valor com rendimento após 1 mês.
     * Considere a taxa de juros da poupança em 0,70% a.m.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Deposit: $");
        double deposit = scan.nextDouble();

        double depositWithYield = deposit * 1.007;

        System.out.printf("\nTotal with yield: $%.2f", depositWithYield);
    }
}
