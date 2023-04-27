import java.util.Scanner;

public class ListaDoisexercicioDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        double troco = valorPago - valorCompra;
        if (troco < 0) {
            System.out.println("Valor pago é insuficiente para realizar a compra.");

        }

        int notas50 = (int) (troco / 50);
        troco %= 50;

        int notas20 = (int) (troco / 20);
        troco %= 20;

        int notas10 = (int) (troco / 10);
        troco %= 10;

        int notas5 = (int) (troco / 5);
        troco %= 5;

        int notas2 = (int) (troco / 2);
        troco %= 2;

        int notas1 = (int) troco;

        // Imprime o resultado
        System.out.printf("Troco: R$ %.2f\n", valorPago - valorCompra);
        System.out.printf("Notas de R$ 50,00: %d\n", notas50);
        System.out.printf("Notas de R$ 20,00: %d\n", notas20);
        System.out.printf("Notas de R$ 10,00: %d\n", notas10);
        System.out.printf("Notas de R$ 5,00: %d\n", notas5);
        System.out.printf("Notas de R$ 2,00: %d\n", notas2);
        System.out.printf("Notas de R$ 1,00: %d\n", notas1);

        scanner.close();
    }

}
