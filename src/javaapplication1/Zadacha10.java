package javaapplication1;

import java.util.Scanner;


public class Zadacha10 {
    public static void myMetod(){
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
}
