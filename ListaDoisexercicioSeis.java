import java.util.Random;
import java.util.Scanner;

public class ListaDoisexercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        int menor = Math.min(numeroUm, numeroDois);
        int maior = Math.max(numeroUm, numeroDois);

        int sorteado = random.nextInt(maior - menor + 1) + menor;

        System.out.println("Número sorteado: " + sorteado);

        if (sorteado % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }

        scanner.close();
    }
}
