package exercicios.Sintaxe;
import java.util.Scanner;
public class driver {

    public static void idade(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Você tem quantos anos?");
        int age = scanner.nextInt();
        var drive = age > 17;
        System.out.printf("Você pode ter CNH? (%s) ", drive); 

        scanner.close();
    }
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Você tem quantos anos?");
        int age = scanner.nextInt();

        System.out.println("Você é emancipado?");
        boolean emancipated = scanner.nextBoolean();
        var drive = age >= 18 || emancipated && age >= 16;
        // || = "ou", se haver um true, mesmo que o outro seja false, será true
        // "&&" = "e" 
        System.out.printf("Você pode ter CNH? (%s) ", drive); 

        scanner.close();
    }
}
