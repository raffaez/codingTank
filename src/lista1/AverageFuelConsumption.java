package lista1;

import java.util.Scanner;

public class AverageFuelConsumption {
    public static void main(String[] args){
        /**
         * Escreva um programa em java para definir o consumo médio de um automóvel
         * sendo fornecido a distância total percorrida pelo automóvel e o total de combustível gasto (litros).
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Total distance traveled (km): ");
        double distance = scan.nextDouble();

        System.out.print("Total fuel spent (l): ");
        double fuelSpent = scan.nextDouble();

        double avgFuelConsumption = getAvgConsumption(distance, fuelSpent);

        System.out.printf("\nAverage fuel consumption: %.1f litres per km\n", avgFuelConsumption);
    }

    public static double getAvgConsumption(double distance, double fuel) {
        return fuel / distance;
    }
}
