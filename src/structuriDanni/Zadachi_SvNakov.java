package structuriDanni;

import java.util.Scanner;

public class Zadachi_SvNakov {

    public static void Choose(int zadacha) {
        switch (zadacha) {
            case 1:
                myMetod1();
                break;
            case 2:
                myMetod2();
                break;
            case 3:
                myMetod3();
                break;
            case 4:
                myMetod4();
                break;

            default:
                System.out.print("Error!");

        }

    }

    /*Декларирайте няколко променливи, като изберете за всяка една най-подходящия 
     от типовете byte, short, int и long, 
     за да представят следните стойности: 52130; -115; 4825932; 97; -10000.*/
    public static void myMetod1() {
        byte b1 = 97;
        byte b2 = -115;
        short s = -10000;
        int i = -10000;
        long l1 = 52130;
        long l2 = 4825932;
    }

    //Напишете израз, който да проверява дали дадено цяло число е четно или нечетно.   
    public static void myMetod2() {
        int i;
        Scanner scn = new Scanner(System.in);
        System.out.print("i=");
        i = scn.nextInt();
        if (i % 2 == 0) {
            System.out.print(i + " e четно число.");
        } else {
            System.out.print(i + " e нечетно число.");
        }
    }

    //Напишете булев израз, който да проверява дали дадено цяло число 
    //се дели на 5 и на 7 без остатък.
    public static void myMetod3() {
        int i;
        boolean b = false;
        Scanner scn = new Scanner(System.in);
        System.out.print("i=");
        i = scn.nextInt();
        if ((i % 5 == 0) && (i % 7 == 0)) {
            b = true;
        }
        System.out.print(b);
    }

//Напишете израз, който да проверява дали дадено цяло число съдържа 7 
//за трета цифра отдясно на ляво.
    public static void myMetod4() {
        String i;
        Scanner scn = new Scanner(System.in);
        System.out.print("i=");
        i = scn.nextLine();

        if (i.contains("7")) {
            if (i.length() - 3 == i.indexOf("7")) {
                System.out.println("Числото съдържа цифрата 7 на позиция " + (i.length() - 2));
            } else {
                System.out.println("Числото не съдържа цифрата 7 на позиция " + (i.length() - 2));
            }

        }

    }
//    Напишете израз, който да проверява дали третия бит на дадено число е 1 или 0.
}
