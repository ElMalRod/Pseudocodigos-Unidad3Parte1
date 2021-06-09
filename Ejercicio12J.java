import java.util.Scanner;

public class Ejercicio12J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c,f;
        System.out.print("Ingrese la temperatura en celsius");
        c = sc.nextDouble();
        f = ((c*9/5))+32;
        System.out.print("La temperatura en Fahrenheit es: "+f);
    }
}