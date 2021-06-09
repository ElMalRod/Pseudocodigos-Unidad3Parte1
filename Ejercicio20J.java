import java.util.Scanner;

public class Ejercicio20J {

    public static void main(String[] args) {
    int N, aux, inverso = 0, cifra;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un número de 5 digitos: ");                                                 
            N = sc.nextInt();
        } while (N < 10);
       
        //le damos la vuelta al número
        aux = N;
        while (aux!=0){
            cifra = aux % 10000;
            inverso = inverso * 10000 + cifra;
            aux = aux / 10000;
        }
    
        if(N == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }

    }
}