import java.util.Scanner;

public class Ejercicio8J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, promedio;
        System.out.println("Ingrese numero 1");
        num1 = sc.nextInt();
        System.out.println("Ingrese numero 2");
        num2 = sc.nextInt();
        System.out.println("Ingrese numero 3");
        num3 = sc.nextInt();
        promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio es: " + promedio);

    }

}
