package javaapplication1;
//@author Asya Toskova

import java.util.Scanner;
public class FirstStart {

    public static void main(String[] args){
       Scanner scn = new Scanner(System.in); 
        System.out.print("Въведи № на лабораторно занятие -> ");
        int laboratory = scn.nextInt();
        
        switch(laboratory){
           case 1:
                Lab1.Choose();
               break;
            case 2:
                Lab2.Choose();
                break;
            case 3:
                Zadachi_SvNakov.Choose();
                break;
            default: 
                 System.out.print("Error!");
                break;
        }
       
    }
}