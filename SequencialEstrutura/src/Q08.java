//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;
public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Recebendo valores:
        System.out.println("Quanto você ganha por hora? R$");
        double ganhoHora = input.nextDouble();

        System.out.println("Número de horas trabalhadas no mês? ");
        double horasTrabalhadas  = input.nextDouble();

        //Calculo:
        double salTotal = ganhoHora * horasTrabalhadas;

        //Resultado:
        System.out.printf("O total do seu salário no mês é de: R$ %.2f%n", salTotal);
    }

    }
