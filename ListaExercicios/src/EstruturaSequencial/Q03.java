//Faça um Programa que peça dois números e imprima a soma
package EstruturaSequencial;
import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma do numero " + num1 + " com " + num2 + " é: " + soma);

    }
}
