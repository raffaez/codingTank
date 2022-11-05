package lista1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        /**
         * Escreva um programa que com base em uma temperatura em graus celsius, realize a conversão e
         * exiba os resultados conforme as fórmulas abaixo:
         * Kelvin
         * K = Celsius + 273.15;
         * Fahrenheit
         * F = Celsius * 1.8 + 32;
         * Rankine
         * Ra = Celsius * 1.8 + 32 + 459.67
         * Réaumur
         * Re = Celsius * 0.8;
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Temperature to be converted (in Celsius): ");
        double tempInCelsius = scan.nextDouble();

        System.out.printf("\n\nTemperature in Celsius: %.1fºC", tempInCelsius);
        System.out.printf("\nTemperature in Kelvin: %.1fK", convertToKelvin(tempInCelsius));
        System.out.printf("\nTemperature in Fahrenheit: %.1fºF", convertToFahrenheit(tempInCelsius));
        System.out.printf("\nTemperature in Rankine: %.1fºR", convertToRankine(tempInCelsius));
        System.out.printf("\nTemperature in Reaumur: %.1fº", convertToReaumur(tempInCelsius));

        }
        
        public static double convertToKelvin(double temp){
            return temp + 273.15;
        }
    
        public static double convertToFahrenheit(double temp){
            return temp * 1.8 + 32;
        }
    
        public static double convertToRankine(double temp){
            return convertToFahrenheit(temp) + 459.67;
        }
    
        public static double convertToReaumur(double temp){
            return temp * 0.8;
        }
}
