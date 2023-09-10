//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;
public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo:");
        double raio = input.nextDouble();

        //Cálculo da área do círculo:
        final double pi = 3.14;
        double area = pi * (raio * raio);

        //Entregando resultado:
        System.out.println("o valor da área desse círculo é " + area);

    }
}
