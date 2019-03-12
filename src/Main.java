import java.security.KeyStore;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Character.*;

public class Main {

    public static void main(String[] args) {

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
        //ex1();
        //print1();
        //ex3(3,6,9);
        //Print2();
        //Ex5(5,6);
        //Ex6();
        //Ex7();
        //Ex8();
        //compara(3.14f, 3.1416f));
        //compararetext();






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

        Stapani ionela = new Stapani();
        ionela.numestapan ="Ionela Avram";
        ionela.varstastapan =12;
        ionela.ocupatie ="elev";
        ionela.venituri =20;
        ionela.activ =true;

        Stapani vasile = new Stapani();
        vasile.numestapan ="Vasile Zidaru";
        vasile.varstastapan =65;
        vasile.ocupatie ="pensionar";
        vasile.venituri =2000;
        vasile.activ =false;

        Stapani anca = new Stapani();
        anca.numestapan ="Anca Suciu";
        anca.varstastapan =27;
        anca.ocupatie ="arhitect";
        anca.venituri =10000;
        anca.activ =true;

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
    }
    }





