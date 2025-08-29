package exercicios.Sintaxe;

import java.util.Scanner;
public class num {
    /*Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e ímpar,
    com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números
    informados e em ordem decrescente
    */
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite um segundo número, que seja maior que o primeiro");
        int num2 = scanner.nextInt();
        

        if (num2 > num1) {
            System.out.println("Escolha entre ser informado entre os números pares ou ímpares desse número, escreva entre p/i, respectivamente: ");
            var choice = scanner.next();
            if (choice.equalsIgnoreCase("p")) {
                for (int i = num2;i >= num1;i--) {
                    if (i % 2 == 0){
                        System.out.println(i);
                    }
                }

            } else if (choice.equalsIgnoreCase("i")) {
                for (int i = num2;i >= num1;i--) {
                    if (i % 2 != 0){
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("Input incorreto, digite entre p ou i. Recomece novamente.");
            }
        } else if (num2 <= num1) {
            System.out.println("Primeiro número maior que o segundo, recomece.");    
        }
    scanner.close();
    }
}