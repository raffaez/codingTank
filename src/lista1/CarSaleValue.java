package lista1;

import java.util.Scanner;

public class CarSaleValue {
    /**
     * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos.
     * Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%.
     * Escreva um programa que leia o custo de fábrica e informe o custo ao consumidor final.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Car's factory cost: $");
        double factoryCost = scan.nextDouble();

        double saleValue = calculateSaleValue(factoryCost);

        System.out.printf("\nTotal sale value: $%.2f", saleValue);
    }

    public static double calculateSaleValue(double factoryCost) {
        double taxes = 0.45;
        double distributorPercent = 0.28;

        return factoryCost * (1 + taxes + distributorPercent);
    }
}
