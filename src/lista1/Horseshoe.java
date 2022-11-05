package lista1;

import java.util.Scanner;

public class Horseshoe {
    /**
     * Escreva um programa para calcular a quantidade de ferraduras necessárias para equipar todos os cavalos comprados
     * para um haras. A informação de cavalos comprados deve ser informada pelo usuário.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Horses bought: ");
        int horses = scan.nextInt();

        int horseshoes = horses * 4;

        System.out.printf("Horseshoes needed to equip all %d horses: %d", horses, horseshoes);
    }
}
