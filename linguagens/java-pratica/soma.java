package exercicios.Sintaxe;
import java.util.Scanner;

public class soma {
    public static void main(String[] args)  {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor inteiro: ");
        var value1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        var value2 = scanner.nextInt();
        var result = value1 + value2;
        System.out.println("O resultado da soma é: ");
        System.out.printf("%s + %s = %s", value1, value2, result);

        scanner.close();
    }
}
