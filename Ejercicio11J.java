import java.util.Scanner;

public class Ejercicio11J {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm, yd, mt,ft, plg;
        System.out.print("Ingrese unidades en Cm a convertir: ");
        cm = sc.nextDouble();
        yd = cm / 91.44;
        mt = cm / 100;
        ft = cm / 30.48;
        plg = cm / 2.54;
        System.out.print("El valor en Yarda es: "+yd);
        System.out.print("El valor en metros es: "+mt);
        System.out.print("El valor en pies es: "+ft);
        System.out.print("El valor en pulgadas es: "+plg);
    }
}