import java.util.Scanner;

import static java.lang.Character.*;

public class Main {

    public static <string> void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Who are you?");
        Scanner introdu_manual = new Scanner(System.in);
        string Nume;
        System.out.println("My name is: ");
        Nume = (string) introdu_manual.next();
        System.out.println();
        System.out.println("Hi " + Nume + " !");
        System.out.println();
        System.out.println("Haide sa ne intelegem romaneste :)");
        System.out.println();
        System.out.println("Sper ca iti place matematica pentru ca in continuare ne vom distra cu cateva exercitii de calcule");
        System.out.println();
        double x = Math.pow(2, 10);    //2 la puterea 10
        double y = Math.sqrt(256);    // radacina patrata (radical de ordin 2)
        System.out.println("x este: " + x);
        System.out.println("y este: " + y);
        System.out.println("Rezultatul operatiunii (x - y)/(1-y) este: " + (x - y) / (1 - y));
        System.out.println();

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

        float C;
        C = ++B ;
        //System.out.print("Introduceti valoarea lui C: ");
        //C = introducere_manuala.nextFloat();
        System.out.println();
        System.out.println("Daca C = B + 1, atunci A la puterea C este: " + (Math.pow(A, C)));
        System.out.println();
        System.out.println("Continuam exercitiile de matematica");
        System.out.println();

        int z = (25 * 4) + (1200/3);
        System.out.println("Rezultatul operatiunii 25 * 4 +  1200 / 3 este: " + z);
        System.out.println();
        System.out.println("Si acum un mic test :D");
        System.out.println();
        System.out.println("Care este rezultatul operatiilor: 126 - 56 / 7 * 12 + 20 ? ");
        System.out.println();

        Scanner raspuns = new Scanner(System.in);
        float rezultat;
        System.out.print ("Raspunsul tau este: ");
        rezultat = raspuns.nextFloat();


        if (rezultat == 50) {

            System.out.println();
            System.out.println("Bravo " + Nume + "! Raspunsul este corect!");
        }
        else {
            System.out.println();
            System.out.println("Ups! Raspunsul este gresit. Mai calculeaza o data!");
        }


    }
}