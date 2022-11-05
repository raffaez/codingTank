package lista1;

import java.util.Scanner;

public class Horses {
    public static void main(String[] args){
        /**
         * Escreva um programa para determinar a quantidade de cavalos para se levantar uma massa de “m” quilogramas
         * a uma altura de “h” em “t” segundos.
         * Considere cavalos = (m * h / t ) / 745,6999
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Mass in KG: ");
        double m = scan.nextDouble();

        System.out.print("Height in meters: ");
        double h = scan.nextDouble();

        System.out.print("Time in seconds: ");
        double t = scan.nextInt();

        double horses = (m * h / t) / 745.6999;

        System.out.printf("Horses needed to lift a mass of %.1f to a height of %.1f in %d seconds = %.1f.", m, h, t, horses);
    }
}
