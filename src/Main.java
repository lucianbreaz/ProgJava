import java.security.KeyStore;
import java.util.Scanner;

import static java.lang.Character.*;

public class Main {

    public static <string> void main(String[] args) {

//            System.out.println("Hello!");
//            System.out.println("Who are you?");
//            Scanner introdu_manual = new Scanner(System.in);
//            string Nume;
//            System.out.println("My name is: ");
//            Nume = (string) introdu_manual.next();
//            System.out.println();
//            System.out.println("Hi " + Nume + " !");
//            System.out.println();
//            System.out.println("Haide sa ne intelegem romaneste :)");
//            System.out.println();
//            System.out.println("Sper ca iti place matematica pentru ca in continuare ne vom distra cu cateva exercitii de calcule");
//            System.out.println();
//            double x = Math.pow(2, 10);    //2 la puterea 10
//            double y = Math.sqrt(256);    // radacina patrata (radical de ordin 2)
//            System.out.println("x este: " + x);
//            System.out.println("y este: " + y);
//            System.out.println("Rezultatul operatiunii (x - y)/(1-y) este: " + (x - y) / (1 - y));
//            System.out.println();
//
//            Scanner introducere_manuala = new Scanner(System.in);
//
//            float A;
//            float B;
//
//            System.out.print("Introduceti valoarea lui A: ");
//            float A = introducere_manuala.nextFloat();
//            System.out.println();
//
//            System.out.print("Introduceti valoarea lui B: ");
//            float B = introducere_manuala.nextFloat();
//            System.out.println();
//            System.out.print("A la puterea B este: " + (Math.pow(A, B)));
//
//            float C;
//            C = ++B;
//            //System.out.print("Introduceti valoarea lui C: ");
//            //C = introducere_manuala.nextFloat();
//            System.out.println();
//            System.out.println("Daca C = B + 1, atunci A la puterea C este: " + (Math.pow(A, C)));
//            System.out.println();
//            System.out.println("Continuam exercitiile de matematica");
//            System.out.println();
//
//            int z = (25 * 4) + (1200 / 3);
//            System.out.println("Rezultatul operatiunii 25 * 4 +  1200 / 3 este: " + z);
//            System.out.println();
//            System.out.println("Si acum un mic test :D");
//            System.out.println();
//            System.out.println("Care este rezultatul operatiilor: 126 - 56 / 7 * 12 + 20 ? ");
//            System.out.println();
//
//            Scanner raspuns = new Scanner(System.in);
//            System.out.print("Raspunsul tau este: ");
//            float rezultat = raspuns.nextFloat();
//
//
//            if (rezultat == 50) {
//
//                System.out.println();
//                System.out.println("Bravo " + Nume + "! Raspunsul este corect!");
//            } else {
//                System.out.println();
//                System.out.println("Ups! Raspunsul este gresit. Mai calculeaza o data!");
//            }
        Scanner enter = new Scanner(System.in);
        System.out.print("     Tema JAVA    ");
        System.out.println();
        public static void Ex1(){
            System.out.println("Assignment 1 ");
            System.out.println();
            System.out.print("Valoarea lui x este: ");
            double x = enter.nextDouble();
            System.out.print("Valoarea lui y este: ");
            double y = enter.nextDouble();
            double res = x * y;
            System.out.println("x inmultit cu y este: " + res);
            System.out.println();
        }
        public static void Print1() {
            System.out.println("Assignment 2 ");
            System.out.println();
            System.out.println("JAVA is FUUUN!!");
            System.out.println();
            System.out.println("   J    a  V     V  a       00   00");
            System.out.println("   J   a a  V   V  a a         |   ");
            System.out.println("J  J  aaaaa  V V  aaaaa     (     )");
            System.out.println(" JJ  a     a  V  a     a     (___) ");
            System.out.println();
        }
        public static void Ex3(){
                System.out.println("Assignment 3 ");
                System.out.println();
                double rezultat = media(6, 9, 12);
                System.out.println("media celor 3 numere este: " + rezultat);
                System.out.println();
        }
            public static  void Print2(){
                System.out.println("Assignment 4 ");
                System.out.println();
                System.out.println("More JAVA FUN!!");
                System.out.println();
                System.out.println(" +\"\"\"\"\"+");
                System.out.println("[| o o |]");
                System.out.println(" |  ^  |");
                System.out.println(" | '_' |");
                System.out.println(" +_____+");
                System.out.println();
            }
            public static void Ex5(){
                System.out.println("Assignment 5 ");
                System.out.println();
                double raspuns = adunari(6, 9);
                System.out.println("rezultatul adunarii celor 2 numere este: " + raspuns);
                System.out.println();
                double rezu = scaderi(6, 9);
                System.out.println("rezultatul scaderii celor 2 numere este: " + rezu);
                System.out.println();
                double rezul = inmultiri(6, 9);
                System.out.println("rezultatul inmultirii celor 2 numere este: " + rezul);
                System.out.println();
                double rezult = impartiri(6, 9);
                System.out.println("rezultatul impartirii celor 2 numere este: " + rezult);
                System.out.println();
                double rezulta = resturi(6, 9);
                System.out.println("restul impartirii celor 2 numere este: " + rezulta);
                System.out.println();
            }
            public static void Ex6(){
                System.out.println("Assignment 6 ");
                System.out.println();
                System.out.print("Introduceti temperatura Fahrenheit: ");
                float F = enter.nextFloat();
                float C = ((5  * (F - 32)) / 9);
                System.out.print("Temperatura Celsius este: " + C);
                System.out.println();
            }
            public static void Ex7() {
                System.out.println("Assignment 7 ");
                System.out.println();
                System.out.print("Introduceti lungimea in inch: ");
                double i = enter.nextDouble();
                double l = i * 0.0254;
                System.out.print("Lungimea in metri este: " + l);
                System.out.println();
            }

             public static void Ex8() {
                 System.out.println("Assignment 8 ");
                 System.out.println();
                 System.out.print("Introduceti distanta in metri: ");
                 double d = enter.nextDouble();
                 double miles = d * 1609;
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
//    }
//
//        public static double media ( double u, double v, double t) {
//            double rezultat = (u + v + t) / 3;
//            return rezultat;
//        }
//        public static double adunari ( double m, double n) {
//            double adunare = m + n;
//            return adunare;
//        }
//        public static double scaderi ( double m, double n) {
//            double scadere = m - n;
//            return scadere;
//        }
//        public static double inmultiri ( double m, double n) {
//            double inmultire = m * n;
//            return inmultire;
//        }
//        public static double impartiri ( double m, double n) {
//            double impartire = m / n;
//            return impartire;
//        }
//        public static double resturi ( double m, double n) {
//            double rest = m % n;
//            return rest;
//        }



//            int rez = scadere (6,9);
//            System.out.println(rez);
//           // System.out.println(scadere(223,123));
//
//            float res = inmultire(2.43f,7.89f);
//            System.out.println(res);
//
//            float rezulta = impartire(5.67f,23.3445f);
//            System.out.println(rezulta);
        //
//    public static int scadere(int x, int y){
//        int rezultat = x - y;
//        return rezultat;
//    }
//
//    public static float inmultire(float a, float b){
//        float result = a * b;
//        return result;
//    }
//
//    public static float impartire(float t, float z){
//        float rezultatimpartire = t / z;
//        return rezultatimpartire;

//

        Veterinar ghita = new Veterinar();
        ghita.nume = "Ghita Bota";
        ghita.varsta = 49;
        ghita.experienta = 30.5f;
        ghita.dotaricabinet = "RMN";
        ghita.recomandari = true;

        Veterinar gogu = new Veterinar();
        gogu.nume = "Gogu Ciobanu";
        gogu.varsta = 67;
        ghita.experienta = 45f;
        gogu.dotaricabinet = "Endoscop";
        gogu.recomandari = false;

        Veterinar andi = new Veterinar();
        andi.nume = "Andrei Georgescu";
        andi.varsta = 30;
        andi.experienta = 12.75f;
        andi.dotaricabinet = "RMN, paroscop, sala operatii";
        andi.recomandari = true;

        Stapani ionela = new Stapani();
        ionela.numestapan = "Ionela Avram";
        ionela.varstastapan = 12;
        ionela.ocupatie = "elev";
        ionela.venituri = 20;
        ionela.activ = true;

        Stapani vasile = new Stapani();
        vasile.numestapan = "Vasile Zidaru";
        vasile.varstastapan = 65;
        vasile.ocupatie = "pensionar";
        vasile.venituri = 2000;
        vasile.activ = false;

        Stapani anca = new Stapani();
        anca.numestapan = "Anca Suciu";
        anca.varstastapan = 27;
        anca.ocupatie = "arhitect";
        anca.venituri = 10000;
        anca.activ = true;

        MancareCaini pedigree = new MancareCaini();
        pedigree.denumire = "Pedigree Complete";
        pedigree.cantitate = 500;
        pedigree.pret = 50;
        pedigree.aroma = "pui";
        pedigree.uscata = false;

        MancareCaini purina = new MancareCaini();
        purina.denumire = "Purina hranitoare";
        purina.cantitate = 340;
        purina.pret = 35;
        purina.aroma = "peste";
        purina.uscata = true;

        MancareCaini royal = new MancareCaini();
        royal.denumire = "Royal Canin";
        royal.cantitate = 15000;
        royal.pret = 120;
        royal.aroma = "ficat";
        royal.uscata = true;

        Caini roco = new Caini();
        roco.nume = "Roco nastrusnicul";
        roco.varsta = 1.2f;
        roco.greutate = 5;
        roco.culoare = "galben";
        roco.rasa = true;

        Caini kiki = new Caini();
        kiki.nume = "Kiki agitata";
        kiki.varsta = 3.4f;
        kiki.greutate = 0.8f;
        kiki.culoare = "maro";
        kiki.rasa = true;

        Caini azor = new Caini();
        azor.nume = "Azor plimbaretul";
        azor.varsta = 2.7f;
        azor.greutate = 7.8f;
        azor.culoare = "negru";
        azor.rasa = false;


    }


}