package lista1;

import java.util.Scanner;

public class ProductSaleValue {
    /**
     * Faça um programa que receba o preço de custo do produto e exiba o valor de venda.
     * O valor de venda receberá um acréscimo de acordo com o percentual informado pelo usuário.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Cost price: $");
        double costPrice = scan.nextDouble();

        System.out.print("Increase %: $");
        double priceIncrease = scan.nextDouble();

        double saleValue = costPrice * (1+priceIncrease/100);

        System.out.printf("\nTotal sale value: $%.2f", saleValue);
    }
}
