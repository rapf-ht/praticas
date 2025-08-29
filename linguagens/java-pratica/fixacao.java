package exercicios.Sintaxe;
import java.time.OffsetDateTime;
import java.util.Scanner;


public class fixacao {
    
    public static void nascimento(String[] args) {
        var scanner = new Scanner(System.in);

        int actual_date = OffsetDateTime.now().getYear();

        System.out.println("Escreva seu nome: ");
        var name = scanner.nextLine();
        System.out.println("Escreva o ano de seu nascimento: ");
        var data = scanner.nextInt();
        int dif = actual_date - data;

        System.out.printf("Olá %s, você tem %s anos!", name, dif);

        scanner.close();
    }

    public static void quadrado(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do lado do quadrado?");
        float lado = scanner.nextFloat();
        float area = lado*lado;
        System.out.printf("A área do quadrado é %s", area);
        scanner.close();
    }
     public static void retangulo(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho da base do retângulo");
        float base = scanner.nextFloat();
        System.out.println("Qual a altura do retângulo?");
        float alt = scanner.nextFloat();
        float area = base*alt;
        System.out.printf("A área do retângulo é %s", area);

        scanner.close();
     }
     public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Bom dia! Qual a idade da primeira pessoa? (Obs:Ela tem que ser a mais velha)");
        int age1 = scanner.nextInt();
        System.out.println("Bom dia! Qual a idade da segunda pessoa?");
        int age2 = scanner.nextInt();

        if (age1 > age2){
            int dif_age = age1 - age2;
            System.out.printf("A diferença de idade de vocês são de %s anos", dif_age);
        } else if (age1 < age2){
            int dif_age = age2 - age1;
            System.out.printf("A diferença de idade de vocês são de %s anos", dif_age);
        } else{
            System.out.println("Vocês dois possuem a mesma idade.");
        }
        
        scanner.close();
     }
}
