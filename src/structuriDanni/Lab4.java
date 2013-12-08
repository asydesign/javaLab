       // int[] m;
// int[] m3 = new int[5];
// int[] m4 = new int[]{1,2,3,4,5};
// int[] m5 = {1,2,3,4,5};
// int[][] m6 = {{1,2,3,4,5},{1,2,3,4}};
package structuriDanni;

import java.util.Random;

public class Lab4 {

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
            case 5:
                myMetod5();
                break;
            case 6:
                myMetod6();
                break;
            case 7:
                myMetod7();
                break;
            default:
                System.out.print("Error!");
                break;
        }
    }

    //За даден масив от низове, изведете елементите започващи с "Ив".
    static void myMetod1() {
        String[] m = new String[]{"Ася", "Бори", "Иван", "Таня", "Ивета", "Ники"};
        for (int i = 0; i < m.length; i++) {
            if (m[i].contains("Ив")) {
                System.out.println(m[i]);
            }
        }
    }

    //За масив от низове, изведете елементите съдържащи "и".
    static void myMetod2() {
        String[] m = new String[]{"Ася", "Бори", "Иван", "Таня", "Ивета", "Ники"};
        for (int i = 0; i < m.length; i++) {
            if ((m[i].contains("и")) || (m[i].contains("И"))) {
                System.out.println(m[i]);
            }
        }
    }

    // За масив от низове, изведете елементите завършващи с "ин".
    static void myMetod3() {
        String[] m = new String[]{"Есенин", "Маяковски", "Тургенин", "Пушкин", "Лермонтов", "Толстой"};
        for (int i = 0; i < m.length; i++) {
            if (m[i].endsWith("ин")) {
                System.out.println(m[i]);
            }
        }
    }

    // За масив от низове, изведете низовете с големи букви.    
    static void myMetod4() {

        String[] m = new String[]{"Есенин", "Маяковски", "Тургенин", "Пушкин", "Лермонтов", "Толстой"};
        for(int i = 0; i < m.length; i++){
            System.out.println(m[i].toUpperCase());

        }
    }

    //Да се реализира алгоритъм за намиране на факториел с цикъл и с рекурсия.
    //0! = 1, 1! = 1, 2! = 2*1, 3! = 3*2*1... n! = n*(n-1)!   
    static void myMetod5() {
        System.out.println(factorielCycle(5));
        System.out.println(factorielRecursia(5));

    }

    static int factorielCycle(int n) {
        int res = n;
        if (n <= 1) {
            return 1;
        } else {
            for (int i = 1; i < n; i++) {
                res = res * (n - i);
            }
            return res;
        }
    }

    static int factorielRecursia(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorielRecursia(n - 1);
        }
    }

// извеждане на член от ред на Фибоначи    
    static void myMetod6() {
       System.out.println(fibonachi(4));//1,1,2,3,5,8,13,21...
    }

    static int fibonachi(int n) {//rekursia
        if (n <= 2) {
            return 1;
        }
        return fibonachi(n - 2) + fibonachi(n - 1);
    }

    // Да се генерират по случаен начин 3 масива, всеки от които с до 20 елемента 
    //от цели числа принадлежащи на интервала [-100, 100]. 
    // Да се намери средно квадратично (сума_от_квадратите/броя) на числата, 
    //които са в интервал [-20, 20], за всеки масив. 
    static Random randomObj = new Random();
    static int[] masiv;

    static void myMetod7() {
        srednoKvadratichno(1);
        srednoKvadratichno(2);
        srednoKvadratichno(3);
    }

    static int rundomElements(int k) {
        return Math.abs(randomObj.nextInt(k) + 1);
    }

    static void printMasiv() {
        for (int i = 0; i < (masiv.length - 1); i++) {
            System.out.print(masiv[i] + ", ");
        }
        System.out.print(masiv[masiv.length - 1] + " ");
    }

    static int[] creatMasiv() {
        masiv = new int[rundomElements(20)];
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = rundomElements(200) - 100;
        }
        printMasiv();
        return masiv;
    }

    static void srednoKvadratichno(int a) {
        double sum = 0;
        int number = 0;
        creatMasiv();
        for (int i = 0; i < masiv.length; i++) {
            if ((masiv[i] >= -20) && (masiv[i] <= 20)) {
                number = number + 1;
                sum = sum + (masiv[i] * masiv[i]);
            }
        }
        if (number == 0) {
            System.out.println("Няма числа в интервала [-20, 20] от масив " + a);
        } else {
            sum = sum / number;
            System.out.println("Средно квадратичното на числата, които са в интервал [-20, 20] от масив " + a + " = " + sum);
        }

    }

}
