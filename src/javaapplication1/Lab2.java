package javaapplication1;

import java.util.Scanner;


public class Lab2 {

    public static void Choose() {
        Scanner scn = new Scanner(System.in);
        //System.out.print("Въведи № на задачата -> ");

        // = scn.nextInt();
        int zadacha = 14;
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
            case 5:
                myMetod5();
                break;
            case 6:
                myMetod6(6, 9);
                break;
            case 7:
                myMetod7(3, 4, 9);
                break;
            case 8:
                myMetod8(45, 77);
                break;
            case 9:
                myMetod9();
                break;
            case 10:
                myMetod10();
                break;
            case 11:
                myMetod11();
                break;
            case 12:
                myMetod12();
                break;
            case 13:
                myMetod13();
                break;
            case 14:
                myMetod14();
                break;
            default:
                System.out.print("Error!");
                break;
        }

    }

    public static void myMetod1() {
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }

    public static void myMetod2() {
        int i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i < 10);

    }

    public static void myMetod3() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void myMetod4() {
        int i = 20;
        while (i > 0) {
            System.out.println(i);
            i = i - 2;
        }
    }

    public static void myMetod5() {
        for (int i = 0; i < 5; i++) {
            System.out.println("а");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("б");
        }
    }

    public static void myMetod6(int i, int j) {
        int max = i > j ? i : j;
        System.out.println(max);
    }

    public static void myMetod7(int i, int j, int h) {
        int max1 = i > j ? i : j;
        int max = h > max1 ? h : max1;
        System.out.println(max);
    }

    public static void myMetod8(int i, int j) {
        int min, max;
        if (i > j) {
            max = i;
            min = j;
        } else {
            max = j;
            min = i;
        }
        for (int k = min; k < max + 1; k++) {
            System.out.println(k);
        }
    }

    public static void myMetod9() {
        Scanner scn = new Scanner(System.in);
        System.out.println("1. Теглене на сума");
        System.out.println("2. Промяна на PIN");
        System.out.println("3. Проверка за наличност");
        System.out.println("4. Настройки");
        System.out.println("5. Изход");
        int n = scn.nextInt();

        switch (n) {
            case 1:
                System.out.println("Вие избрахте 'Теглене на сума'");
                break;
            case 2:
                System.out.println("Вие избрахте 'Промяна на PIN'");
                break;
            case 3:
                System.out.println("Вие избрахте 'Проверка за наличност'");
                break;
            case 4:
                System.out.println("Вие избрахте 'Настройки'");
                break;
            case 5:
                System.out.println("Вие избрахте 'Изход'");
                break;
            default:
                System.out.println("Error!");

        }

    }

    public static void myMetod10() {
        double m[];
        m = new double[5];
//         for(int i=0; i<5; i++){
//            m[i]=i;
//       }
        for (double element : m) {
            System.out.println(element);//не се знае големината на масива, 
            //но ще отпечата всички елементи от него
        }
    }

    public static void myMetod11() {
        int i = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Въведете число -> ");
        //while(i!=13){
        int n = scn.nextInt();

        switch (n) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Juny");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong month");

        }
        //}

    }
    

    public static void m1(int[] masiv) {
        for (int i = 0; i < masiv.length; i++) {
            System.out.println(masiv[i]);
        }

    }
    public static void m2(int[] masiv) {
        for (int i = masiv.length-1; i >= 0; i--) {
            System.out.println(masiv[i]);
        }
    }
    public static void myMetod12() {
        int m[];
        Scanner scn = new Scanner(System.in);
        System.out.println("Въведи брой елементи: ");
        int broiElementi = scn.nextInt();
        m = new int[broiElementi];
        for(int i=0; i<broiElementi; i++){
            System.out.println("Въведи елемент №:" + i);
            int x = scn.nextInt();
            m[i]= x;
        }
            m1(m);
            m2(m);
    }
        
   public static void m3(int[] masiv) {
       
        for (int i = 0; i < masiv.length; i++) {
           if(masiv[i] > 30){
            break;
           }
           System.out.println(masiv[i]);
        }

    }
   public static void myMetod13() {
        int m[]={1,2,3,4,5,30,31,6,45,6}; 
      
            m3(m);
            
    }
  public static int m4(int[] masiv) {
       int bigger=-1;
        for (int i = 0; i < masiv.length; i++) {
           if(masiv[i] > 30){
               //System.out.println(i);
            bigger = i;
            break;
           }
        }
        return bigger;
    }
   public static void myMetod14() {
        int m[];
        Scanner scn = new Scanner(System.in);
        System.out.print("Въведи брой елементи: ");
        int broiElementi = scn.nextInt();
        m = new int[broiElementi];
        for(int i=0; i<broiElementi; i++){
            System.out.print("Въведи елемент №:" + i + " ");
            int x = scn.nextInt();
            m[i]= x;
        }
            m4(m);
            
    }      

}
    

