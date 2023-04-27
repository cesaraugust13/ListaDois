
import java.util.Scanner;

public class ListaDoisexercicioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numeroTres = scanner.nextDouble();

        double max = numeroUm;
        if (numeroDois > max) {
            max = numeroDois;
        }
        if (numeroTres > max) {
            max = numeroTres;
        }
        System.out.println("Maior número: " + max);

        double min = numeroUm;
        if (numeroDois < min) {
            min = numeroDois;
        }
        if (numeroTres < min) {
            min = numeroTres;
        }
        System.out.println("Menor número: " + min);

        double media = (numeroUm + numeroDois + numeroTres) / 3;
        System.out.println("Média aritmética: " + media);

        scanner.close();

    }
}