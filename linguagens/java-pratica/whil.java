package exercicios.Sintaxe;
import java.util.Scanner;
public class whil {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número");
        int num = scanner.nextInt();
        var keepverify = true;
        while (keepverify) {
            System.out.println("Informe o número para verificação");
            int toverify = scanner.nextInt();
            if (toverify < num) {
                System.out.printf("Escreva um número que seja menor que %d \n", num);
                continue;
            }
            var result = toverify % num;
            keepverify = result == 0;
            System.out.printf("%s %% %s = %s \n", toverify, num, result);
        }
        scanner.close();
    }
}
