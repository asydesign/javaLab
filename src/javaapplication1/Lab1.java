package javaapplication1;
import java.util.Scanner;

public class Lab1 {
    public static void Choose(){
        Scanner scn = new Scanner(System.in); 
        System.out.print("Въведи № на задачата -> ");
        int zadacha = scn.nextInt();
        
        switch(zadacha){
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
                myMetod4(15,45);
                break;
            case 5:
                myMetod5();
                break;
            case 6:
                myMetod6();
                break;
            case 7:
                myMetod7(3.,4);
                break;
             case 8:
                myMetod8(1,0.99999999999999999);
                 break;
             case 9:
                myMetod9();
                 break;
             case 10:
                myMetod10();
                 break;
             case 11:
                Homework();
                break;
             default: 
                 System.out.print("Error!");
                break;
        }
    
    }
    
    public static void myMetod1(){
        System.out.println("Hello World!");    
    }
    
    public static void myMetod2(){
        int i;
        i=5;
        i+=10;
        System.out.println("i = "+i);    
    }
    public static void myMetod3(){
        double i;
        double j;
        i=5;
        j=9;
        System.out.println(i+" + "+j+" = " + (i+j));
        System.out.println(i+" - "+j+" = " + (i-j));
        System.out.println(i+" * "+j+" = " + (i*j));
        System.out.println(i+" / "+j+" = " + (i/j));
    }
    public static void myMetod4(double i,double j){
        System.out.println(i+" + "+j+" = " + (i+j));
        System.out.println(i+" - "+j+" = " + (i-j));
        System.out.println(i+" * "+j+" = " + (i*j));
        System.out.println(i+" / "+j+" = " + (i/j));
    }
     public static void myMetod5(){
        double i;
        i=35;
        System.out.println("i="+ i + " -> i++="+ i++);
        i=35;
        System.out.println("i="+ i + " -> i--="+ i--);
        i=35;
        System.out.println("i="+ i + " -> ++i="+ ++i);
        i=35;
        System.out.println("i="+ i + " -> --i="+ --i);
    }
     public static void myMetod6(){
        float i=5.2f;
        i+=1;
        System.out.println("i = " + i);
        i-=2;
        System.out.println("i = " + i);
        i*=3;
        System.out.println("i = " + i);
        i/=4;
        System.out.println("i = " + i);
    }
      public static void myMetod7(double k, double l){
        boolean b;
        b = (k==l);
        System.out.println(b);
    }
       public static void myMetod8(double k, double l){
        System.out.println(k+"=="+l+" " + (k==l));
        System.out.println(k+">"+l+" " + (k>l));
        System.out.println(k+"<"+l+" " + (k<l));
        System.out.println(k+">="+l+" " + (k>=l));
        System.out.println(k+"<="+l+" " + (k<=l));
        System.out.println(k+"!="+l+" " + (k!=l));
    }
       public static void myMetod9(){
        int i;
        int j;
        Scanner scn = new Scanner(System.in);
            System.out.print("i=");
            i = scn.nextInt();
            System.out.print("j=");
            j = scn.nextInt();
        
        System.out.println("i+j="+(i+j));
    }
       public static void myMetod10(){
        double p;
        double q;
        double pr;
        Scanner scn = new Scanner(System.in); 
        System.out.print("p=");
        p = scn.nextDouble();
        System.out.print("q=");
        q = scn.nextDouble();
        pr=p*q;      
        if(pr>50){
            System.out.println("p*q="+pr);
//      }else{
//          System.out.println("p*q < 50");
       }
        
    }
       public static void f(double x, double y){
        System.out.println("f("+x+","+y+")=" + (x*x+2*(x-y*y)+7*y));
    }
    public static void Homework(){
        double a, b,c, d;
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
