package structuriDanni;

import java.util.Scanner;

public class Upr1_architekturi {

    public static void Choose(int zadacha) {
        switch (zadacha) {
            case 1:
                myMetod1();
                break;
            case 2:
                myMetod2();
                break;

            default:
                System.out.print("Error!");
                break;
        }
    }

    public static void myMetod1() {
// преобразуване на числа в десетична бр. с-ма
        Scanner KeyS = new Scanner(System.in);
        String ns;
        System.out.print("Въведи число: ");
        ns = KeyS.nextLine();

        int s;
        System.out.print("В каква бройна система е това число: ");
        s = KeyS.nextInt();

        int a = 0;
        for (int i = 0; i < ns.length(); i++) {
            a = a * s + Integer.parseInt(String.valueOf(ns.charAt(i)));

        }
        System.out.println(s + "-ичното число в десетична с-ма е: " + a);
    }

    public static void myMetod2() {
// преобразуване на десетични числа в друга бр. с-ма
        Scanner KeyS = new Scanner(System.in);
        int ns;
        System.out.println("Въведи цяло десетично число: ");
        ns = KeyS.nextInt();

        int s;
        System.out.println("В каква бройна система да превърна числото: ");
        s = KeyS.nextInt();

        String a = "";
        int k = 0;
        String myBinary = "";
        int first_ns = ns;

        while (ns > (s - 1)) {
            k = ns % s;
            ns = ns / s;
            a = a + Integer.toString(k);

        }
        if ((ns <= (s - 1)) && (ns > 0)) {
            k = ns;
        }

        a = a + Integer.toString(k);
        for (int i = a.length() - 1; i >= 0; i--) {
            myBinary = myBinary + a.charAt(i);
        }
        System.out.println("Числото " + first_ns + " в " + s + "-ична с-ма е: " + myBinary);
    }
}
