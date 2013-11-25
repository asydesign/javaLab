package javaapplication1;
import java.util.Scanner;

public class Homework {
    public static void f(double x, double y){
        System.out.println("f("+x+","+y+")=" + (x*x+2*(x-y*y)+7*y));
    }
    public static void myMetod(){
        double a;
        double b;
        double c;
        double d;
      Scanner scn = new Scanner(System.in); 
            System.out.print("a=");
            a = scn.nextDouble();
            System.out.print("b=");
            b = scn.nextDouble();
            System.out.print("c=");
            c = scn.nextDouble();
            System.out.print("d=");
            d = scn.nextDouble();
        
       f(a,d);
       f(b,c);
        
    }
}
