package structuriDanni;

import java.util.Scanner;

public class Lab2 {

    public static void Choose(int zadacha) {

        switch (zadacha) {

            case 1:
                myMetod1();
                break;
            case 2:
                myMetod1_1();
                break;
            case 3:
                myMetod1_2();
                break;
            case 4:
                myMetod2();
                break;
            case 5:
                myMetod3();
                break;
            case 6:
                myMetod4(6, 9);
                break;
            case 7:
                myMetod5(3, 4, 9);
                break;
            case 8:
                myMetod6(45, 77);
                break;
            case 9:
                myMetod7();
                break;
            case 10:
                myMetod8();
                break;
            case 11:
                myMetod9();
                break;
            case 12:
                myMetod10();
                break;
            case 13:
                myMetod11();
                break;
            case 14:
                myMetod12();
                break;
            case 15:
                myMetod13();
                break;
            case 16:
                Homework1();
                break;
            case 17:
                Homework2();
                break;
            default:
                System.out.print("Error!");
                break;
        }

    }
//Отпечатайте числата от 1 до 10, всяко на отделен ред, като използвате оператор за цикъл.

    public static void myMetod1() {
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }

    public static void myMetod1_1() {
        int i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i < 10);

    }

    public static void myMetod1_2() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

//Отпечатайте четните числата от 1 до 20, в обратен ред.
    public static void myMetod2() {
        int i = 20;
        while (i > 0) {
            System.out.println(i);
            i = i - 2;
        }
    }

//Отпечатайте 5 пъти буквата ‘а’ и веднага след това 10 пъти ‘б’.
    public static void myMetod3() {
        for (int i = 0; i < 5; i++) {
            System.out.println("а");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("б");
        }
    }

//Създайте метод, който извежда максималното от две цели числа зададени като формални параметри.
//Извикайте метода в основната програма.
    public static void myMetod4(int i, int j) {
        int max;
        max = i > j ? i : j;
        System.out.println(max);
    }

//Като използвате функцията max от зад. 4.2. създайте основна програма, 
//в която въвеждате три цели числа от конзолата и намирате, максималното от тях.
    public static void myMetod5(int i, int j, int h) {
        int max, max1;
        max1 = i > j ? i : j;
        max = h > max1 ? h : max1;
        System.out.println(max);
    }

//Създайте метод „void m(int i1, i2)”, който извежда в конзолата списък с всички 
//цели числа между i1 и i2 в нарастващ ред;
//В основната програма, въведете от конзолата две цели числа и извикайте метода m.
//Примерен вход: 5 и 9.
//Изход от програмата за примерния вход: 5, 6, 7, 8, 9.  
    public static void myMetod6(int i, int j) {
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

//Да се създаде меню за избор на възможности за програма, обслужваща банкомат:
//1. Теглене на сума;
//2. Промяна на PIN;
//3. Проверка на наличност;
//4. Настройки;
//5. Изход.
//Да се чете от конзолата въведеното число и да се извежда текст с описание на избраната операция.
    public static void myMetod7() {
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

//Модифицирайте задача 7, така че от конзолата да се въвежда число за избор на операция, докато не се избере операцията за „Изход”.
    public static void myMetod8() {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        while (n != 5) {
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
                //System.out.println("Error!");
            }
            System.out.println("1. Теглене на сума");
            System.out.println("2. Промяна на PIN");
            System.out.println("3. Проверка за наличност");
            System.out.println("4. Настройки");
            System.out.println("5. Изход");
            n = scn.nextInt();
        }
    }

//Създайте програма чрез която при въвеждане на число от 1 до 12, се извежда името на съответния месец.
    public static void myMetod9() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Въведете число -> ");
        int n = scn.nextInt();
        String m[] = {"Wrong month", "January", "February", "March", "April", "May", "Juny", "July", "August", "September", "Oktober", "November", "December"};
        for (int i = 1; i < 13; i++) {
            if (n == i) {
                System.out.println(m[n]);
            } else {
                System.out.println(m[0]);
            }

        }
    }
//Декларирайте едномерен масив от 5 елемента от тип double;
//Задайте стойности на елементите на масива;
//Отпечатайте стойностите на елементите на масива.

    public static void myMetod10() {
        Double m[] = new Double[5];
        m[0] = 1.;
        m[1] = 5.;
        m[2] = 0.4;
        m[3] = 2.;
        m[4] = 3.;
        for (int i = 0; i < 5; i++) {
            System.out.println(m[i]);
        }
//        for (double element : m) {
//            System.out.println(element);//не се знае големината на масива, но ще отпечата всички елементи от него
//        }
    }
//Създайте метод „void m1(int []масив)”, който получава като параметър едномерен 
//масив от цели числа. В тялото на метода се извеждат стойностите на елементите на 
//масива последователно от началото към края.
//a)Създайте метод аналогичен на първия, който извежда елементите на масива в обратен ред – 
//последователно от последния към първия елемент.
//b)В основната програма задайте масив от цели числа от конзолата като първо въведете 
//броя на елементите на масива и след това самите елементи на масива. 
//Извикайте методите от подточки a) и б) с параметър въведения масив. 

    public static void m1(int[] masiv) {
        for (int i = 0; i < masiv.length; i++) {
            System.out.println(masiv[i]);
        }

    }

    public static void m2(int[] masiv) {
        for (int i = masiv.length - 1; i >= 0; i--) {
            System.out.println(masiv[i]);
        }
    }

    public static void myMetod11() {
        int m[];
        Scanner scn = new Scanner(System.in);
        System.out.println("Въведи брой елементи: ");
        int broiElementi = scn.nextInt();
        m = new int[broiElementi];
        for (int i = 0; i < broiElementi; i++) {
            System.out.println("Въведи елемент №:" + i);
            int x = scn.nextInt();
            m[i] = x;
        }
        m1(m);
        m2(m);
    }

//Даден е едномерен масив от цели числа. Извеждайте последователно всички елементи на масива. 
//Извеждането спира, ако се срещне елемент със стойност над 30.        
    public static void m3(int[] masiv) {

        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] > 30) {
                break;
            }
            System.out.println(masiv[i]);
        }

    }

    public static void myMetod12() {
        int m[] = {1, 2, 3, 4, 5, 30, 31, 6, 45, 6};

        m3(m);

    }

//a)Създайте метод, получаващ като параметър едномерен масив от цели числа,  
//който връща индекса на първия срещнат елемент със стойност над 30.
//б) В основната програма реализирайте въвеждане на масив от конзолата и 
//като използвате метода от т.а) изведете информация за първия срещнат елемент със стойност над 30.
    public static int m4(int[] masiv) {
        int bigger = -1;
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] > 30) {
                bigger = i;
                System.out.println("Първият срещнат по-голям от 30 елемент е: " + masiv[bigger]);
                break;
            }
        }
        return bigger;
    }

    public static void myMetod13() {
        int m[];

        Scanner scn = new Scanner(System.in);
        System.out.print("Въведи брой елементи: ");
        int broiElementi = scn.nextInt();
        m = new int[broiElementi];
        for (int i = 0; i < broiElementi; i++) {
            System.out.print("Въведи елемент №:" + i + " ");
            int x = scn.nextInt();
            m[i] = x;
        }
        m4(m);

        //System.out.println(m[bigger]); ?????   
    }

//Даден е едномерен масив от цели числа. Изведете всички положителни елементи 
//на масива. Изведете сумата от всички отрицателни елементи.
    public static void Homework1() {
        int m[] = {1, -5, -4, 20, 0, 5, -4, 7};
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] >= 0) {
                System.out.println(m[i]);
            } else {
                suma = suma + m[i];
            }
        }
        System.out.println("Сумата е: " + suma);

    }

//  Изведете ‘пирамида’ от символи, увеличаващи се с един на всеки следващ ред: 
    public static void Homework2() {
        String k = "A";
        for (int i = 1; i < 6; i++) {
            System.out.println(k);
            k = k + "A";
        }
    }
}
