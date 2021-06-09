import java.util.Scanner;

public class Ejercicio10J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, perimetro, area;
        System.out.print("Ingrese la base del rectangulo: ");
        base = sc.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura = sc.nextDouble();
        perimetro = (2 * base) + (2 * altura);
        area = base * altura;
        System.out.print("El area del rectangulo es: " + area + " Unidades al cuadrado");
        System.out.print("El perimetro del rectangulo es: " + perimetro + " Unidades");
    }

}