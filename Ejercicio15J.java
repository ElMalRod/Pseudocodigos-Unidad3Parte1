import java.util.Scanner;

public class Ejercicio15J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("Ingrese un numero: ");
		num1 = sc.nextInt();
		if (num1 == 0) {
			System.out.println("El numero tiene un valor nulo al ser 0");
		} else if (num1>0){
			System.out.println("El numero " +num1 +" es positivo");
		} else {
			System.out.println("El numero " +num1 +" es negativo");
		}
    }
}