//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).

import java.util.Scanner;
public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Recebendo a temperatura em Fahrenheit:
        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        double F = input.nextDouble();

        //Calculo de conversão:
        double C = 5 * ((F - 32) / 9 );

        C = Math.round(C);
        //Trazendo valor:
        System.out.println("A temperatura atual é " + F + " °F ");
        System.out.println("A temperatura convertida para Celsius é " + C + "°C");
    }
}
