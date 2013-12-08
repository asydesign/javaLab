package structuriDanni;
//@author Asya Toskova
//import javax.swing.*; or awt - graphycs interface
//http://pastebin.com/u/wingman007

public class FirstStart {

    public static void main(String[] args) {
        play(4,7);
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
                Lab4.Choose(b);
                break;
            case 5:
                Zadachi_SvNakov.Choose(b);
                break;
            case 6:
                Upr1_architekturi.Choose(b);
                break;
                
            default: 
                 System.out.println("Error!");
               
        }
    }
      
       
}
