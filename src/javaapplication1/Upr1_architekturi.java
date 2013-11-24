package javaapplication1;
import java.util.Scanner;
import javax.swing.*; //awt
//http://pastebin.com/u/wingman007

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
       
      
       int[] a = new int[100];
       int k;
       int i=0;
       String myBinary = " ";
       int first_ns = ns;
       
       while ((ns-s)>=0){ 
          ns = ns/s;
           k = ns%s;
                    System.out.println();    

           a[i] = k;
           i=i+1;
       }
       a[i]=ns;

//      for(int j = i; j>=0; j--){ //a.length = 100
//        
//        myBinary = myBinary + a[j];
//      }  
//      
//       System.out.println("Числото "+first_ns+" в "+ s +"-ична с-ма е: " + myBinary);
       
      
    }
}
