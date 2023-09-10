//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Recebendo valor em Celsius:
        System.out.println("Digite a temperatura em graus Celsius: ");
        double C = input.nextDouble();

        //Convertendo para Fahrenheit:
        double F = (C * 1.8) + 32;

        F = Math.round(F);

        //Resultado:
        System.out.println("A temperatura é " + C + " °C");
        System.out.println("A temperatura convertida para F é: " + F + " °F");
    }
}
