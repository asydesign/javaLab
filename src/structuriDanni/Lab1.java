package structuriDanni;

import java.util.Scanner;

public class Lab1 {

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
                myMetod3_2(15, 45);
                break;
            case 5:
                myMetod4();
                break;
            case 6:
                myMetod5();
                break;
            case 7:
                myMetod6(3., 4);
                break;
            case 8:
                myMetod7(1, 0.99999999999999999);
                break;
            case 9:
                myMetod7_2();
                break;
            case 10:
                myMetod8(4, 5);
                break;
            case 11:
                myMetod9();
                break;
            case 12:
                myMetod10(5, 6);
                break;
            case 13:
                Homework();
                break;
            default:
                System.out.print("Error!");
                break;
        }

    }

    public static void myMetod1() {
        System.out.println("Hello World!");
    }

//Създайте променлива с име i от тип int (за цяло число);
//Задайте й стойност 5;
//Увеличете стойността на i с 10;
//Отпечатайте стойността на i в конзолата.
    public static void myMetod2() {
        int i;
        i = 5;
        i += 10;
        System.out.println("i = " + i);
    }

//Декларирайте 2 променливи за реални числа и им задайте стойности.
//Изведете резултатите от основните аритметични действия с тях.
    public static void myMetod3() {
        double i;
        double j;
        i = 5;
        j = 9;
        System.out.println(i + " + " + j + " = " + (i + j));
        System.out.println(i + " - " + j + " = " + (i - j));
        System.out.println(i + " * " + j + " = " + (i * j));
        System.out.println(i + " / " + j + " = " + (i / j));
    }

//За условието от задача 3 създайте отделен метод, който извиквате в main-метода
    public static void myMetod3_2(double i, double j) {
        System.out.println(i + " + " + j + " = " + (i + j));
        System.out.println(i + " - " + j + " = " + (i - j));
        System.out.println(i + " * " + j + " = " + (i * j));
        System.out.println(i + " / " + j + " = " + (i / j));
    }

//Демонстрирайте действието на операторите за увеличение (++) и намаление (--) 
//с единица на променливи от тип число (тези оператори важат за цели и реални числа).
    public static void myMetod4() {
        double i;
        i = 35;
        System.out.println("i=" + i + " -> i++=" + i++);
        i = 35;
        System.out.println("i=" + i + " -> i--=" + i--);
        i = 35;
        System.out.println("i=" + i + " -> ++i=" + ++i);
        i = 35;
        System.out.println("i=" + i + " -> --i=" + --i);
    }

//Демонстрирайте действието на операторите +=, -=, *=, /=
    public static void myMetod5() {
        float i = 5.2f;
        i += 1;
        System.out.println("i = " + i);
        i -= 2;
        System.out.println("i = " + i);
        i *= 3;
        System.out.println("i = " + i);
        i /= 4;
        System.out.println("i = " + i);
    }

//Демонстрирайте действието на операторa за сравнение ==
    public static void myMetod6(double k, double l) {
        boolean b;
        b = (k == l);
        System.out.println(b);
    }

//Демонстрирайте действието на всички оператори за сравнение.
    public static void myMetod7(double k, double l) {
        System.out.println(k + "==" + l + " " + (k == l));
        System.out.println(k + ">" + l + " " + (k > l));
        System.out.println(k + "<" + l + " " + (k < l));
        System.out.println(k + ">=" + l + " " + (k >= l));
        System.out.println(k + "<=" + l + " " + (k <= l));
        System.out.println(k + "!=" + l + " " + (k != l));
    }

//java.util
    public static void myMetod7_2() {
        int i;
        int j;
        Scanner scn = new Scanner(System.in);
        System.out.print("i=");
        i = scn.nextInt();
        System.out.print("j=");
        j = scn.nextInt();

        System.out.println("i+j=" + (i + j));
    }

//Демонстрирайте действието на логическите оператори:
//• Логическо И - && (oзначение в Java &&)
//• Логическо ИЛИ - ||
//• Логическо Отрицание НЕ - !
    public static void myMetod8(double k, double l) {
        if ((k > 0) && (l > 0)) {
            System.out.println(k + " и " + l + " са положителни числа.");
        }
        if ((k > 0) || (l > 0)) {
            System.out.println(k + " или " + l + " е положително число.");
        }
        if (k != l) {
            System.out.println(k + " е различно от " + l + ".");
        }
    }

//Създайте метод „void поГолямоОт50(double d1, double d2)”, който извежда 
//произведението на две реални числа, но само ако то е по-голямо от 50.
//Извикайте метода в основната програма           
    public static void myMetod9() {
        double p;
        double q;
        double pr;
        Scanner scn = new Scanner(System.in);
        System.out.print("p=");
        p = scn.nextDouble();
        System.out.print("q=");
        q = scn.nextDouble();
        pr = p * q;
        if (pr > 50) {
            System.out.println("p*q=" + pr);
       }

    }

//Създайте метод „void m(double d1, double d2)”, който извежда стойността на израза
//• (d1+d2)*(d1-d2), ако d1+d2 е по-голямо от 20;
//• (d1+d2)/5 (в обратния случай - когато d1+d2 <=20); 
//o Извикайте метода в основната програма.
    public static void myMetod10(double d1, double d2) {
        double d = 0;

        if ((d1 + d2) > 20) {
            d = (d1 + d2) * (d1 - d2);
            System.out.println(d);
        } else {
            d = (d1 + d2) / 5;
            System.out.println(d);
        }

    }

//Създайте метод/подпрограма с име f, с два формални параметъра – реални числа a и b, 
//който извежда в конзолата резултата от изчислението на израза a*a + 2*(a-b*b)+7*b.
//- В main-метода
//създайте код за въвеждане от конзолата на 4 реални числа – a, b, c, d;
//извикайте метода два пъти с фактически параметри съответно a, d и b, c – т.е.  
//f(a,d) и f(b, c).     
    public static void f(double x, double y) {
        System.out.println("f(" + x + "," + y + ")=" + (x * x + 2 * (x - y * y) + 7 * y));
    }

    public static void Homework() {
        double a, b, c, d;
        Scanner scn = new Scanner(System.in);
        System.out.print("a=");
        a = scn.nextDouble();
        System.out.print("b=");
        b = scn.nextDouble();
        System.out.print("c=");
        c = scn.nextDouble();
        System.out.print("d=");
        d = scn.nextDouble();

        f(a, d);
        f(b, c);

    }

}
