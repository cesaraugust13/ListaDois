import java.util.Scanner;

public class ListaDoisexercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, / ou ^): ");
        String operacao = scanner.next();

        double resultado = 0.0;

        switch (operacao) {
            case "+":
                resultado = numeroUm + numeroDois;
                break;
            case "-":
                resultado = numeroUm - numeroDois;
                break;
            case "*":
                resultado = numeroUm * numeroDois;
                break;
            case "/":
                resultado = numeroUm / numeroDois;
                break;
            case "^":
                resultado = Math.pow(numeroUm, numeroDois);
                break;
            default:
                System.out.println("Erro: operação inválida!");
                System.exit(0);
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
