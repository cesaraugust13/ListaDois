import java.util.Scanner;

public class ListaDoisexercicioTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.println("Digite os coeficientes da equação de segundo grau:");

        System.out.print("a: ");
        a = scanner.nextDouble();

        System.out.print("b: ");
        b = scanner.nextDouble();

        System.out.print("c: ");
        c = scanner.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            x1 = -c / b;
            System.out.printf("A raiz da equação é: %.2f%n", x1);
        } else {
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                x1 = -b / (2 * a);
                System.out.printf("As raízes da equação são: %.2f e %.2f%n", x1, x1);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("As raízes da equação são: %.2f e %.2f%n", x1, x2);
            }
        }

        scanner.close();
    }

}
