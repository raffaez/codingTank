package lista1;

import java.util.Arrays;
import java.util.Scanner;

public class CircleArea {
    /**
     * Escreva um programa para ler o raio de um círculo, calcular e escrever o valor da área:
     * Cálculo:  área = PI * (raio²)
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Circle's radius: ");
        double radius = scan.nextDouble();

        double area = calculateArea(radius);

        System.out.printf("\nCircle's area is: %f", area);
    }

    public static double calculateArea(double radius) {
        return Math.pow(radius, 2.0) * Math.PI;
    }
}
