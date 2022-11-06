package lista2;

import java.util.Scanner;

public class GradesAverage {
    /**
     *Escreva um programa que seja capaz de receber as seguintes informações e calcular a média da nota de um aluno:
     * Nome
     * Turma
     * Nota 1
     * Nota 2
     * Nota 3
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Class: ");
        String schoolClass = sc.nextLine();

        System.out.print("First grade: ");
        double grade1 = sc.nextDouble();

        System.out.print("Second grade: ");
        double grade2 = sc.nextDouble();

        System.out.print("Third grade: ");
        double grade3 = sc.nextDouble();

        double avg = calculateAverage(grade1, grade2, grade3);

        System.out.printf("\n%s's average was %.1f", name, avg);
    }

    public static double calculateAverage(double grade1, double grade2, double grade3){
        return (grade1+grade2+grade3)/3;
    }
}
