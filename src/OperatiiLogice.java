import java.util.Scanner;

public class OperatiiLogice {

    public static void ifassignment1(float a, float b) {

        if (a > b) {
            System.out.println(" a este mai mare");
        } else {
            System.out.println("b este mai mare");
        }
    }

    public static void ifassignment2() {
        Scanner introdu = new Scanner(System.in);
        System.out.print("Introduceti un text: ");
        String manual = introdu.next();
        String comp = "FactTrack";
        if (manual.equals(comp)) {
            System.out.println("Learning text comparison");
        } else {
            System.out.println("Got to try some more");
        }
    }

    public static void ifassignment3(float x) {

        if ((x >= 2) && (x<=8)){
            System.out.println(" 2 <=" + x + "<= 8");
            } else {
                System.out.println(x + "nu este intre 2 si 8");
            }
        }


    public static void ifassignment4() {
        Scanner introdu = new Scanner(System.in);
        System.out.print("Introduceti un text: ");
        String text = introdu.next();
        System.out.print("Introduceti un numar: ");
        float numar = introdu.nextFloat();
        String comp = "FactTrack";
        if ((text.equals(comp)) && (numar <= 3)) {
            System.out.println(comp + numar);
        } else if ((text != comp) && (numar >= 4)) {
            System.out.println(numar + comp);
        }
    }

    public static void ifassignment5() {
        Scanner introdu = new Scanner(System.in);
        System.out.print("Numarul introdus este: ");
        float numar = introdu.nextFloat();
        if ((numar > 8) || (numar == 6)) {
            System.out.println("The amount of snow this winter was(cm):" + numar);
        } else {
            System.out.println("The forecast snow is:" + numar);
        }
    }

    public static void ifassignment6() {
        Scanner introdu = new Scanner(System.in);
        System.out.print("Numarul introdus este: ");
        float y = introdu.nextFloat();
        if ((y > 3) && (y < 4)){
            System.out.println("The number is greater than 3 and not equal to 4");
        } else if (y == 4) {
            System.out.println("The number is equal to 4");
        } else if (y < 3) {
            System.out.println("The number is lower than 3");
        }
    }

    public static void ifassignment7() {
        Scanner introdu = new Scanner(System.in);
        System.out.print("Cifra tastata este: ");
        int cifra = introdu.nextInt();
        switch (cifra) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
            case 6:
                System.out.println("6");
            case 7:
                System.out.println("7");
            case 8:
                System.out.println("8");
            case 9:
                System.out.println("9");
            case 0:
                System.out.println("0");
            default:
                System.out.println("Not allowed");
        }
    }

    public static void ifassignment8() {
        Scanner introdu = new Scanner(System.in);
        System.out.print("Numarul introdus este: ");
        double nr = introdu.nextDouble();
        double even = nr % 2;
        if (even == 0) {
            System.out.print("Numarul introdus este par ");
        } else {
            System.out.print("Numarul introdus este impar ");
        }
    }

    public static void ifassignment9() {
        Scanner introdu = new Scanner(System.in);
        System.out.print("Varsta dumneavoastra este: ");
        float varsta = introdu.nextFloat();
        if (varsta >= 18) {
            System.out.print("Puteti vota");
        } else {
            System.out.print("Nu aveti varsta necesara pentru a putea vota");
        }
    }

    public static void ifassignment10(float a, float b, float c) {

        if ((a > b) && (a > c)) {
            System.out.println(" a este cel mai mare");
        } else if ((c > b )&& (c > a)) {
            System.out.println("c este cel mai mare");
        }  else if ((b > a )&& (b > c)) {
            System.out.println("b este cel mai mare");
        }
    }



}

