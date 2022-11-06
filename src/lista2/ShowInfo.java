package lista2;

import java.util.Scanner;

public class ShowInfo {
    /**
     * Elabore um programa que escreve seu nome completo na primeira linha, seu endereço na segunda,
     * e o CEP e telefone na terceira.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] info = new String[4];

        System.out.print("Name: ");
        info[0] = sc.nextLine();

        System.out.print("Address: ");
        info[1] = sc.nextLine();

        System.out.print("CEP: ");
        info[2] = sc.nextLine();

        System.out.print("Phone number: ");
        info[3] = sc.nextLine();

        showInfo(info);
    }

    public static void showInfo(String[] info){
        System.out.println("\n~~~~~~~~ OUTPUT ~~~~~~~~");
        for(int i = 0; i < info.length; i++){
            System.out.printf("\n%s", info[i]);

            if(i==2){
                System.out.printf(" | %s\n", info[i+1]);
                return;
            }
        }
    }
}
