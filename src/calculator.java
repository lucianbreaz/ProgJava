import java.util.Scanner;

public class calculator {

    public static void ex1() {

        System.out.print("     Tema JAVA    ");
        System.out.println();
        System.out.println("Assignment 1 ");
        System.out.println();
        Scanner enter = new Scanner(System.in);
        System.out.print("Valoarea lui x este: ");
        double x = enter.nextDouble();
        System.out.print("Valoarea lui y este: ");
        double y = enter.nextDouble();
        double res = x * y;
        System.out.println("x inmultit cu y este: " + res);
        System.out.println();
    }

    public static void ex3(int a, int b, int c){
        System.out.println("Assignment 3 ");
        System.out.println();
        double rezultat = (a + b + c) / 3;
        System.out.println("media celor 3 numere este: " + rezultat);
        System.out.println();
    }

    public static void Ex5(double a, double b){
        System.out.println("Assignment 5 ");
        System.out.println();
        double adunare = a + b;
        System.out.println("rezultatul adunarii celor 2 numere este: " + adunare);
        System.out.println();
        double scadere = a - b;
        System.out.println("rezultatul scaderii celor 2 numere este: " + scadere);
        System.out.println();
        double inmultire = a * b;
        System.out.println("rezultatul inmultirii celor 2 numere este: " + inmultire);
        System.out.println();
        double impartire = a / b;
        System.out.println("rezultatul impartirii celor 2 numere este: " + impartire);
        System.out.println();
        double restul = a % b;
        System.out.println("restul impartirii celor 2 numere este: " + restul);
        System.out.println();
    }

    public static void Ex6(){
        System.out.println("Assignment 6 ");
        System.out.println();
        System.out.print("Introduceti temperatura Fahrenheit: ");
        Scanner enter = new Scanner(System.in);
        float F = enter.nextFloat();
        float C = ((5  * (F - 32)) / 9);
        System.out.print("Temperatura Celsius este: " + C);
        System.out.println();
    }

    public static void Ex7() {
        System.out.println("Assignment 7 ");
        System.out.println();
        System.out.print("Introduceti lungimea in inch: ");
        Scanner enter = new Scanner(System.in);
        double i = enter.nextDouble();
        double l = i * 0.0254;
        System.out.print("Lungimea in metri este: " + l);
        System.out.println();
    }

    public static void Ex8() {
        System.out.println("Assignment 8 ");
        System.out.println();
        System.out.print("Introduceti distanta in metri: ");
        Scanner enter = new Scanner(System.in);
        double d = enter.nextDouble();
        double miles = d / 1609;
        System.out.print("Introduceti timpul: ");
        System.out.print("Introduceti orele     h= ");
        int h = enter.nextInt();
        System.out.print("Introduceti minutele  m= ");
        int m = enter.nextInt();
        System.out.print("Introduceti secundele s= ");
        int s = enter.nextInt();
        int t = (3600 * h) + (60 * m) + s;
        double th = t / 3600;
        double v = d / t;
        double vk = (d / 1000) / th;
        double vm = miles / th;
        System.out.println("Viteza in m/s este: " + v);
        System.out.println("Viteza in km/h este: " + vk);
        System.out.println("Viteza in miles/h este: " + vm);
    }


    public static double media ( double u, double v, double t) {
            double rezultat = (u + v + t) / 3;
            return rezultat;
    }

    public static double adunari ( double m, double n) {
            double adunare = m + n;
            return adunare;
    }

    public static double scaderi ( double m, double n) {
            double scadere = m - n;
            return scadere;
    }

    public static double inmultiri ( double m, double n) {
            double inmultire = m * n;
            return inmultire;
    }

    public static double impartiri ( double m, double n) {
            double impartire = m / n;
            return impartire;
    }

    public static double resturi ( double m, double n) {
            double rest = m % n;
            return rest;
    }

    public static int scadere(int x, int y){
        int rezultat = x - y;
        return rezultat;
    }

    public static float inmultire(float a, float b){
        float result = a * b;
        return result;
    }

    public static float impartire(float t, float z) {
        float rezultatimpartire = t / z;
        return rezultatimpartire;
    }

    public double  afisarenumar(double z) {
        return afisarenumar(3);
    }

    public double  ridicarelapatrat(double x) {
        double y = Math.pow(x, 2);
        return y;
    }




}
