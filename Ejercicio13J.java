import java.util.Scanner;

public class Ejercicio13J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.141592,radio,altura,volumen;
		System.out.print("Ingrese el radio del cilindro: ");
		radio = sc.nextDouble();
		System.out.print("Ingrese la altura del cilindro: ");
		altura = sc.nextDouble();
		volumen = PI*radio*radio*altura;
		System.out.print("EL volumen del cilindro es: " +volumen +"Unidades cubicas");
    }
}