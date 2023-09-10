//Faça um Programa que peça 2 números inteiros e um número real.

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Recebendo os Números:
        System.out.println("Digite um número inteiro: ");
        int n1 = input.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int n2 = input.nextInt();

        System.out.println("Digite um número real: ");
        double n3 = input.nextDouble();

       //Calculando produto do dobro do primeiro com metade do segundo:
        double prod = (n1 * 2) + (n2 / 2);

        //Calculando a soma do triplo do primeiro com o terceiro:
        double soma = (n1 * 3) + n3;

        //Calculando o terceiro elevado ao cubo:

        double triplo = n3 * n3 * n3;

        //Mostrando resultados:
        System.out.println("O produto do dobro do primeiro número com metade do segundo é: " + prod);
        System.out.println("A soma do triplo do primeiro número com o terceiro é: " + soma);
        System.out.println("O terceiro número elevado ao cubo é: " + triplo);









    }
}
