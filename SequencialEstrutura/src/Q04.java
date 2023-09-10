//Faça um Programa que peça as 4 notas bimestrais e mostre a média

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite o valor da segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite o valor da terceira nota: ");
        double nota3 = input.nextDouble();

        System.out.println("Digite o valor da quarta nota: ");
        double nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        media = Math.round(media * 100.0) / 100.0;

        System.out.println("A média das notas é: " + media);

    }
}
