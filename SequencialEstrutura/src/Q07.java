//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Recebendo valores:
        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = input.nextDouble();

        //Calculando área do quadrado:
        double area = lado * lado;

        //Dobro da área:
        double dobroArea = area * 2;

        //Mostrando resultado:
        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área desse quadrado é: " + dobroArea);
    }

}
