package lista1;

import java.util.Scanner;

public class StudentGradesAverage {
    /**
     * Escreva um programa que leia o nome de um aluno e as notas das 3 primeiras provas que ele obteve no semestre.
     * No final deverá informar a média do aluno.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Grades:");
        double grade1 = scan.nextDouble();
        double grade2 = scan.nextDouble();
        double grade3 = scan.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3;

        System.out.printf("Your average was %.2f.", average);
    }
}
