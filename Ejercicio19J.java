import java.util.Random;


public class Ejercicio19J {

    public static void main(String[] args) {
        Random Aleatoreo = new Random();
        int num;
        num = Aleatoreo.nextInt(1000)+1;
        if (num%5==0 || num%5<=125) {
            System.out.println("CORRECTO");
        }
        else  {
            System.out.println("INCORRECTO");
        }
    }
}