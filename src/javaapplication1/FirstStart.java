package javaapplication1;
//@author Asya Toskova

public class FirstStart {

    public static void main(String[] args) {
        play(5,2);
    }
    public static void play(int a ,int b) {
         switch(a){
           case 1:
                Lab1.Choose(b);
               break;
            case 2:
                Lab2.Choose(b);
                break;
            case 3:
                Lab3.Choose(b);
                break;
            case 4:
                Zadachi_SvNakov.Choose(b);
            case 5:
                Upr1_architekturi.Choose(b);
               
                break;
            default: 
                 System.out.println("Error!");
               
        }
    }
      
       
}
