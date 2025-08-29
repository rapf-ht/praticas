package exercicios.Sintaxe;

public class para {
    public static void um(String[] args) {
        for (var i = 1;i <= 100; i ++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        for (var i = 0;i <= 100; i +=2){
            System.out.println(i);
        }
    }

}
