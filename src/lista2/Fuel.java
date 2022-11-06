package lista2;

import java.util.Scanner;

public class Fuel {
    /**
     *  Escreva um programa para calcular a quantidade de litros de combustível necessária para se fazer uma viagem,
     *  sabendo-se que o carro faz 12 Km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a velocidade média.
     *
     * utilizar as seguintes fórmulas:
     *  	distância = tempo x velocidade
     * litros usados = distância / 12
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Time spent travelling: (hours)");
        double timeSpent = scan.nextDouble();
        System.out.println("Average speed: (km/h)");
        double avgSpeed = scan.nextDouble();

        double distance = timeSpent * avgSpeed;
        double fuelUsed = distance / 12;

        System.out.printf("You'll need %.2fl of fuel to travel %.2fkm.", fuelUsed, distance);
    }
}
