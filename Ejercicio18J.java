import java.util.Scanner;

public class Ejercicio18J {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String num, num1, num2, num3, num4;
        int sumaDigitos;
        System.out.println("Ingresa un numero de cuatro digitos sin espacios");
        num = sc.nextLine();

        num1 = num.substring(0, 1);
        num2 = num.substring(1, 2);
        num3 = num.substring(2, 3);
        num4 = num.substring(3, 4);
       
        sumaDigitos = Integer.parseInt(num1)+Integer.parseInt(num2)+Integer.parseInt(num3)+Integer.parseInt(num4);

        System.out.println("La suma de los digitos es: "+sumaDigitos);
    }
}