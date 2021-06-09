import java.util.Random;
import java.util.Scanner;

public class Ejercicio6J {

    public static void main(String[] args) {
       Random Aleatoreo = new Random();
		Scanner sc = new Scanner(System.in);
		int num;
		double numAument;
		num = Aleatoreo.nextInt(200);
		numAument = num*1.30;
		System.out.print("\nEl numero random es " +num +"\nAumentado en 30% es " +numAument +"\n");
        
    }

}