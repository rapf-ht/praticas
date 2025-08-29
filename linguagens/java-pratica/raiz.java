package exercicios.Sintaxe;
import java.util.Scanner;
public class raiz {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Escreva o número que você queira descobrir a sua raiz: ");
        int value = scanner.nextInt();
        System.out.printf("A raiz quadrada de %s é: %s ", value, Math.sqrt(value));

        scanner.close();
    }
}
