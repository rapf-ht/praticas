package exercicios.Sintaxe;
import java.util.Scanner;
public class switcase {
    public static void main(String[] args) {
        //Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número
        var scanner = new Scanner(System.in);
        System.out.println("Escreva o elemento, o qual você queira saber sua tabuada: ");
        int num = scanner.nextInt();
        System.out.println("Aperte 1 para começar!");
        int begin = scanner.nextInt();
        switch (begin) {
            case 1:
                System.err.printf("%d x 1 = %d | ", num, num*1);
            case 2:
                System.err.printf("%d x 2 = %d | ", num, num*2);
            case 3:
                System.err.printf("%d x 3 = %d | ", num, num*3);
            case 4:
                System.err.printf("%d x 4 = %d | ", num, num*4);
            case 5:
                System.err.printf("%d x 5 = %d | ", num, num*5);
            case 6:
                System.err.printf("%d x 6 = %d | ", num, num*6);
            case 7:
                System.err.printf("%d x 7 = %d | ", num, num*7);
            case 8:
                System.err.printf("%d x 8 = %d | ", num, num*8);
            case 9:
                System.err.printf("%d x 9 = %d | ", num, num*9);
            case 10:
                System.err.printf("%d x 10 = %d | ", num, num*10);
                break;
            
        }
        scanner.close();
    }
}

/*
%d: Representa um número inteiro (int).
%f: Representa um número de ponto flutuante (float ou double).
%c: Representa um caractere (char).
%b: Representa um valor booleano (boolean). 
*/