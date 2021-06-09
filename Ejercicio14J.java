import java.util.Scanner;

public class Ejercicio14J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num1,num2,Resultado;
		System.out.print("Ingrese divisor: ");
		num1 = sc.nextInt();
		System.out.print("Ingrese dividendo: ");
		num2 = sc.nextInt();
		if (num2 % num1 == 0) {
			Resultado = (num2/num1);
			System.out.println("El resultado de la division exacta es: " +Resultado);
		} else {
			System.out.println("No es una division exacta");
		}
    }
}