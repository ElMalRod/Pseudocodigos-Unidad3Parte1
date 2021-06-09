import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int num1, num2, Resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Numero a sumar: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el Numero 2 a sumar: ");
        num2 = sc.nextInt();
        Resultado = num1 + num2;
        System.out.println("La suma es : " + Resultado);
    }

}
