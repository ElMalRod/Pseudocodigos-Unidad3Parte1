import java.util.Scanner;

public class Ejercicio4J {

    public static void main(String[] args) {
        int num1,cuadrado,cubo;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un Numero");
        num1 = sc.nextInt();
       cuadrado= num1*num1;
       cubo= num1*num1*num1;
        System.out.println("El cuadrado de "+num1+" es: "+cuadrado);
        System.out.println("El cubo de "+num1+" es: "+cubo);
    }

}