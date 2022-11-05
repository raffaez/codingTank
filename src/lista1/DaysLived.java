package lista1;

import java.util.Scanner;

public class DaysLived {
    public static void main(String[] args) {
        /**
         * Crie um programa que você atribua um valor da idade de uma pessoa e calcule quantos dias aquela pessoa já viveu
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Age in years: ");
        int ageInYears = scan.nextInt();

        int ageInDays = calculateDaysLived(ageInYears);

        System.out.printf("%d years = %d days", ageInYears, ageInDays);
    }

    public static int calculateDaysLived (int years){
        return years * 365;
    }
}