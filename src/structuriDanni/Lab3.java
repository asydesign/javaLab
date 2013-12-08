package structuriDanni;

public class Lab3 {

    public static void Choose(int zadacha) {
        switch (zadacha) {
            case 1:
               // myMetod1();
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
            case 8:
                myMetod8();
                break;
            default:
                System.out.print("Error!");
                break;
        }
    }

   
    public static int myMetod1(int i1, int i2) {
    //Създайте метод, който връща максималното от две цели числа, зададени като параметри. 
    //В основната програма извикайте метода като за вход използвате параметри аргументи на класа    
        return i1 > i2 ? i1 : i2;
         
     /* public static void main(String[] args) {
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
         System.out.println(myMetod1(i1, i2));
      }
     */

       
    }
     
//  средно аритметично на масив
    public static void myMetod2() {
        double[] m = {1, 2, 3.3, 4};
        double k = 0;
        for (int i = 0; i < m.length; i++) {
            k = k + m[i];
        }
        k = k / m.length;
        System.out.println(k);
    }
    
//За масив от реални числа, намерете сумата на положителните елементи.

    public static void myMetod3() {
        double[] m = {1, -2, 3.3, -4, 77};
        double k = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] >= 0) {
                k = k + m[i];
            }
        }
        System.out.println(k);
    }
//  средно квадратично на масив (кв. корен от сумата на квадратите)

    public static void myMetod4() {

        double[] m = {1, 3, 14, 3E+8};
        double k = 0;
        for (int i = 0; i < m.length; i++) {
            k = k + m[i] * m[i];
        }
        System.out.println(Math.sqrt(k));
    }

//За масив от реални числа, намерете сумата от квадратите на елементите по-големи от 3.
    public static void myMetod5() {
        double[] m = {1, 3, 14, 3E+8};
        double k = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > 3) {
                k = k + m[i] * m[i];
            }
        }
        System.out.println(k);
    }

    //За масив от реални числа, намерете сумата от абсолютните стойности на елементите.
    public static void myMetod6() {
        double[] m = {1, 3, -14, 3E-2, -43};
        double k = 0;
        for (int i = 0; i < m.length; i++) {
            k = k + Math.abs(m[i]);
        }
        System.out.println(k);
    }
//  масив реални числа, max = ?  

    public static void myMetod7() {

        double[] m = {1, 3, 14, 3E+5};
        double k = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > k) {
                k = m[i];
            }
        }
        System.out.println(k);
        //System.err.println(k); може да се пренасочи да пише във file
    }

    //  масив реални числа, min = ?  
    public static void myMetod8() {

        double[] m = {155, 3, 14, 3E+5};
        double k = 1E+300;
        for (int i = 0; i < m.length; i++) {
            if (m[i] < k) {
                k = m[i];
            }
        }
        System.out.println(k);
    }
    
   

}
