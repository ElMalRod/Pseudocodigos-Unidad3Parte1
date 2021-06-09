import java.util.Scanner;

public class Ejercicio17J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int lado1,lado2,lado3;
		System.out.print("Ingrese el primer lado: ");
		lado1 = sc.nextInt();
		System.out.print("Ingrese el segundo lado: ");
		lado2 = sc.nextInt();
		System.out.print("Ingrese el tercer lado: ");
		lado3 = sc.nextInt();
		if (lado1 == lado2 &&  lado2  == lado3) {
			System.out.println("El triangulo es equilatero");
		} else if (lado1 != lado2 && lado2 != lado3){
			System.out.println("El triangulo es escaleno");
		} else {
			System.out.println("El triangulo es isoceles");
		}
    }
}