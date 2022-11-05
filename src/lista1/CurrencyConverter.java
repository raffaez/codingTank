package lista1;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        /**
         * Crie um algoritmo que realize a conversão do valor em real para as seguintes moedas:
         * Dólar
         * Euro
         * Libra
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Value to be converted: R$");
        double valueInBRL = scan.nextDouble();

        double valueInDollars = convertToDollars(valueInBRL);
        double valueInEuros = convertToEuros(valueInBRL);
        double valueInPounds = convertToPounds(valueInBRL);

        System.out.print("\n###### OUTPUT #####");
        System.out.printf("\nBRL: R$%.2f", valueInBRL);
        System.out.printf("\nUSD (dollars): $%.2f", valueInDollars);
        System.out.printf("\nEUR (euros): %.2f€", valueInEuros);
        System.out.printf("\nGBP (pounds): £%.2f", valueInPounds);
    }

    public static double convertToDollars(double value){
        return value * 5.04;
    }

    public static double convertToEuros(double value){
        return value * 5.04;
    }

    public static double convertToPounds(double value){
        return value * 5.74;
    }

}
