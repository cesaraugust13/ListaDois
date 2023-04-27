import java.util.Scanner;

public class ListaDoisexercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Digite o código da operação (1 - perímetro do círculo, 2 - área do círculo, 3 - volume da esfera):");
        int codigoOperacao = scanner.nextInt();

        System.out.println("Digite o raio:");
        double raio = scanner.nextDouble();

        if (codigoOperacao == 1) {
            double perimetro = 2 * Math.PI * raio;
            System.out.println("Perímetro do círculo: " + perimetro);
        } else if (codigoOperacao == 2) {
            double area = Math.PI * Math.pow(raio, 2);
            System.out.println("Área do círculo: " + area);
        } else if (codigoOperacao == 3) {
            double volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;
            System.out.println("Volume da esfera: " + volume);
        } else {
            System.out.println("Código de operação inválido!");

            scanner.close();
        }
    }
}
