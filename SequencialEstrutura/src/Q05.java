//Faça um Programa que converta metros para centímetros.

import java.util.Scanner;
public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Recebendo o valor em metros:
        System.out.println("Digite o valor em metros: ");
        double metros = input.nextDouble();

        //Conversão de metros para centímetros:
        double centimentros = metros * 100;

        //Saída conversão:
        System.out.println("O valor " + metros + " m " + "equivale a: " + centimentros + "cm");

    }

}
