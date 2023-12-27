import java.util.Scanner;

public class daireDilimininAlani {
    public static void main(String[] args) {

        double alfa,alan,pi=3.14,r;
        Scanner inp = new Scanner(System.in);

        System.out.println("alfa değerini giriniz: ");
        alfa = inp.nextDouble();
        System.out.println("r değerini giriniz: ");
        r = inp.nextDouble();


        alan = (pi*(r*r)*alfa)/360;
        System.out.println("alan: " + alan);


    }
}
