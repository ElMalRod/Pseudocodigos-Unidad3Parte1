import java.util.Scanner;

public class Ejercicio9J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1;
        String palabra2;
        String Aux;
        System.out.print("Ingrese una palabra: ");
        palabra1 = sc.nextLine();
        System.out.print("INgrese otra palabra: ");
        palabra2 = sc.nextLine();
        Aux = palabra1;
        palabra1 = palabra2;
        palabra2 = Aux;
        System.out.println("Las palabras luego del intercambio: " + palabra1);
        System.out.println("Las palabras luego del intercambio: " + palabra2);
    }

}