import java.util.Scanner;

public class Ejercicio16J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num1,num2,num3;

		System.out.print("Ingrese numero 1: ");
		num1 = sc.nextInt();
		System.out.print("Ingrese numero 2: ");
		num2 = sc.nextInt();
		System.out.print("Ingrese numero 3: ");
		num3 = sc.nextInt();
		if (num1 > num2 && num2 > num3) {
			System.out.println("El numero mayor es: "+num1);
		} else if (num2>num1 && num1 > num3){
			System.out.println("El numero mayor es: " +num2);
		} else {
			System.out.println("El numero mayor es: " +num3);
		}
    }
}