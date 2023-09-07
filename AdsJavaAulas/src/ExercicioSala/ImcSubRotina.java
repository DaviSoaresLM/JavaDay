package ExercicioSala;
import java.util.Scanner;
public class ImcSubRotina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura (em m): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o seu gênero (h/m): ");
        char genero = scanner.next().charAt(0);

        double imc = calcularIMC(peso, altura);
        double pesoIdeal = calcularPesoIdeal(altura, genero);

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static double calcularPesoIdeal(double altura, char genero) {
        if (genero == 'h') {
            return (72.7 * altura) - 58;
        } else if (genero == 'm') {
            return (62.1 * altura) - 44.7;
        } else {
            System.out.println("Gênero inválido. Use 'h' para homem ou 'm' para mulher.");
            return 0;
        }
    }
}
