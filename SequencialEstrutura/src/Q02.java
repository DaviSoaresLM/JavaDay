//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;


public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt(); // Lê um número inteiro digitado pelo usuário
        System.out.print("O número informado foi " + numero);


    }
}
