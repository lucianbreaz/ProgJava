import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Who are you?");
        System.out.println("Hi Lucian!");

        double x = Math.pow(2, 10);    //2 la puterea 10
        double y = Math.sqrt(256);    // radacina patrata (radical)
        System.out.println("x este: " + x);
        System.out.println("y este: " + y);
        System.out.println("Rezultatul operatiunii (x - y)/(1-y) este: " + (x - y) / (1 - y));


        Scanner introducere_manuala = new Scanner(System.in);

        float A;
        float B;


        System.out.print("Introduceti valoarea lui A: ");
        A = introducere_manuala.nextFloat();
        System.out.println();

        System.out.print("Introduceti valoarea lui B: ");
        B = introducere_manuala.nextFloat();
        System.out.println();
        System.out.println("A la puterea B este: " + (Math.pow(A, B)));

        float C =++A;
        //System.out.print("Introduceti valoarea lui C: ");
        //C = introducere_manuala.nextFloat();
        System.out.println();
        System.out.println("A la puterea C este: " + (Math.pow(A,  C)));
    }
}