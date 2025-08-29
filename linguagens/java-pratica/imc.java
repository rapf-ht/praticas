package exercicios.Sintaxe;

import java.util.Scanner;
public class imc {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Escreva sua massa corpórea: (Obs: Em decimal usando ,) ");
        float mass = scanner.nextFloat();
        System.out.println("Escreva sua altura: (Obs: Use decimal também, em metro)");
        float height = scanner.nextFloat();

        var imc = mass/(height*height);
        
        if (imc <= 18.5) {
            System.out.printf("Seu imc é %f, você está categorizado como ABAIXO DO PESO", imc);

        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.printf("Seu imc é %f, você está categorizado como PESO IDEAL ", imc);

        } else if (imc > 25.0 && imc <= 29.9){
            System.out.printf("Seu imc é %f, você está categorizado como LEVEMENTE ACIMA DO PESO", imc);
        
        } else if (imc > 30.0 && imc <= 34.9) {
            System.out.printf("Seu imc é %f, você está categorizado como OBESIDADE GRAU I", imc);
        
        } else if (imc > 35.0 && imc <= 39.9) {
            System.out.printf("Seu imc é %f, você está categorizado como OBESIDADE GRAU II - SEVERA", imc);
    
        } else if (imc >= 40.0) {
            System.out.printf("Seu imc é %f, você está categorizado como OBESIDADE III - MÓRBIDA", imc);
        }
    scanner.close();
    }
}
