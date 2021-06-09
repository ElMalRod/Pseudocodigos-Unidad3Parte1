import java.util.Scanner;

public class Ejercicio3J {

    public static void main(String[] args) {
        int num1,doble,triple;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un Numero");
        num1 = sc.nextInt();
       doble= num1*2;
       triple= num1*3;
        System.out.println("El doble de "+num1+" es: "+doble);
        System.out.println("El triple de "+num1+" es: "+triple);
    }

}