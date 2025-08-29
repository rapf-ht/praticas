package exercicios.Sintaxe;
import java.text.DecimalFormat;
import java.util.Scanner;
public class desafio_final {
    public static void frete(String[] args) {
        var scanner = new Scanner(System.in);
        // TODO: Leia o peso em quilos: CHECK
        double peso = scanner.nextDouble();

        // TODO: Leia o valor do frete por quilo:

        double frete = scanner.nextDouble();

        // TODO: Calcule o valor total do frete:
        double valor = frete*peso;

        // TODO: Exiba o valor formatado com duas casas decimais:
        System.out.printf("%.2f\n", valor);

        scanner.close();
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // TODO: Leia o valor original do produto:
        double valor = scanner.nextDouble();

        // TODO: Leia a porcentagem de desconto:
        double desc = scanner.nextDouble();

        // TODO: Verifique se o desconto está dentro de um intervalo válido:
        if (desc > 0 || desc < 100) {
            // TODO: Calcule o valor final do produto:
            double valorFinal = valor - (valor*desc/100);

            // Formata e exibe o valor com duas casas decimais
            System.out.printf("%.2f\n", valorFinal);

        } else {
            System.out.println("Desconto inválido");
        }

        scanner.close();
    }
}