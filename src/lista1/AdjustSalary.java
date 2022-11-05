package lista1;

import java.util.Scanner;

public class AdjustSalary {
    public static void main(String[] args){
        /**
         * Crie um programa que com base em um salário de um funcionário, reajusta o salário em 7%
         * e mostra o valor antes do reajuste e após.
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Salary: $");
        double salary = scan.nextDouble();

        double adjustedSalary = adjustSalary(salary);

        System.out.printf("\nOriginal salary: $%.2f - adjusted salary: %.2f", salary, adjustedSalary);

    }

    public static double adjustSalary(double salary){
        return salary * 1.07;
    }
}
