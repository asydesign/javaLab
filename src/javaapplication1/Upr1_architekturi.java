package javaapplication1;
import java.util.Scanner;


public class Upr1_architekturi {
   
    public static void Choose(int zadacha){
        switch(zadacha){
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
    
    public static void myMetod1(){
   
        Scanner KeyS = new Scanner(System.in);
        String ns;
        System.out.println("Въведи число: ");
        ns=KeyS.nextLine();
    
        int s;
        System.out.println("Въведи бройна система: ");
        s=KeyS.nextInt();
        
        int a=0;
        for(int i=0; i < ns.length(); i++){
            a = a*s + Integer.parseInt(String.valueOf(ns.charAt(i)));
        }
        System.out.println("Числото в десетична с-ма е: "+ a);
    }
    
    public static void myMetod2(){
   
        Scanner KeyS = new Scanner(System.in);
        int ns;
        System.out.println("Въведи число в десетична с-ма: ");
        ns = KeyS.nextInt();
    
        int s; 
        System.out.println("Въведи бройна система: ");
        s = KeyS.nextInt();
        
       String a="";
       int k;
       while (ns>=0){
            //a = a*s + Integer.parseInt(String.valueOf(ns.charAt(i)));
            ns = ns/s;
            k = ns%s;
            a = a.concat(Integer.toString(k));
            System.out.println(ns);
       }
        //System.out.println("Числото в "+ s +"-ична с-ма е: " + a);
    }
}
