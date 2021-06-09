import java.util.Scanner;

public class Ejercicio2J {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de un pais: ");
        String pais = sc.nextLine();
        System.out.println("Ingrese el nombre de su capital: ");
        String capital = sc.nextLine();
    
        System.out.println("La capital " + capital+" esta en el pais "+pais);
    }

}