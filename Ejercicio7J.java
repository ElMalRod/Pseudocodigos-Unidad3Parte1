import java.util.Random;
import java.util.Scanner;

public class Ejercicio7J {

    public static void main(String[] args) {
       Random Aleatoreo = new Random();
		Scanner sc = new Scanner(System.in);
		int num;
		double numDismin;
		num = Aleatoreo.nextInt(40)+10;
		numDismin = num*0.85;
		System.out.print("\nEl numero random es " +num +"\nDisminuido en 15% es " +numDismin +"\n");
        
    }

}