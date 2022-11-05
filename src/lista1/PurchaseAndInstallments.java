package lista1;

import java.util.Scanner;

public class PurchaseAndInstallments {
    /**
     * Uma loja está vendendo seus produtos em 5 prestações sem juros.
     * Faça um programa que insira o valor total de uma compra e o valor das prestações.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Purchase value: $");
        double purchase = scan.nextDouble();

        System.out.print("How many installments? (Up to 5) ");
        int installments = scan.nextInt();


        if(installments >= 1 && installments <= 5) {
            double installmentValue = calculateInstallments(purchase, installments);
            System.out.printf("You'll pay %dx $%.2f", installments, installmentValue);
        }else{
            System.out.print("Invalid amount of installments");
        }
    }

    public static double calculateInstallments(double value, int installments){
        double installmentValue = 0;
        switch (installments) {
            case 1 -> installmentValue = value;
            case 2 -> installmentValue = value / 2;
            case 3 -> installmentValue = value / 3;
            case 4 -> installmentValue = value / 4;
            case 5 -> installmentValue = value / 5;
        }

        return installmentValue;
    }
}
