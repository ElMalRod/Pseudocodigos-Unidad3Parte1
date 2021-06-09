import java.util.Scanner;

public class Ejercicio5J {

    public static void main(String[] args) {
        int num1,siguiente;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un Numero");
        num1 = sc.nextInt();
        siguiente=num1+1;
        System.out.println("El siguiente de "+num1+" es: "+siguiente);
        
    }

}