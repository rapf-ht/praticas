package exercicios.Sintaxe;

import java.util.Scanner;

public class aprendendo {
    public static void uso_import(String[] args){
        //usar comentário com dois traços
        /*usar bibliotecas no java: usar "import --": "import java.util*"
        *usar "*" para usar tudo da biblioteca
        *ou caso queira usar apenas um import: "import java.util.scanner"
         */

    }

    private final static String WELCOME_MESSAGE = "Seja bem-vindo!";
    // Essa linha vai criar um "def" para poder ser usada em uma public, em quakquer código que quiser
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        // ou: Scanner scanner = new Scanner(System.in);
        // "var" estaria declarando uma função, que nesse caso é o scanner. Poderia fazer a mesma coisa substituindo "int" e "String"

        System.out.println(WELCOME_MESSAGE);
        // Esse é o exemplo do uso do "private" lá em cima

        System.out.println("Digite seu nome de usuário:");
        String name = scanner.next();
        System.out.println("Digite sua idade:");
        int age = scanner.nextInt();

        System.out.println("Olá " + name + " sua idade é: " + age);

        scanner.close();
        // Usar essa linha de código para evitar o "leak" do scanner, fechando ele. Com isso, evitamos perda de perfomance.
        // Porém, isso é irrelevante, mas é bom criar a prática.
    }
}