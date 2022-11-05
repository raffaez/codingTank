package lista1;

import java.util.Scanner;

public class LoanAndInterests {
    public static void main(String[] args){
        /**
         * Escreva um programa que realize o cálculo do empréstimo a juros compostos. Onde definimos:
         *  o valor da variável de quanto a pessoa quer emprestado;
         * em quantos meses ela irá pagar
         * A taxa de juros será de 2% ao mês
         * Fórmula: M = C * (1+i)^t
         * M = valor final após a aplicação dos juros
         * C = valor que a pessoa vai pegar emprestado
         * i é a taxa de juros
         * t é o tempo
         * Deverá exibir quanto a pessoa irá pagar após a aplicação dos juros
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Amount to be lent: $");
        double amountLent = scan.nextDouble();

        System.out.print("How long to pay? (months) ");
        int monthsToPay = scan.nextInt();

        double loanWithInterests = amountLent*Math.pow(1+0.02, monthsToPay);

        System.out.printf("Total to be paid: $%.2f", loanWithInterests);
    }
}
