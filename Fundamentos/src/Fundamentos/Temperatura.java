package Fundamentos;
import java.util.Scanner;
//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//        C = 5 * ((F-32) / 9)
public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        double F = input.nextDouble();

        double C = 5 * ((F-32) / 9);

        //Arrendondar o C para 2 casas decimais:
        C = Math.round(C * 100.0) / 100.0;

        System.out.println("A temperatura " + F + "°F convertida em Celsius é: " + C + "°C");
    }
}
