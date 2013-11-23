package javaapplication1;


public class Lab2_Home {
  
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
//    Даден е едномерен масив от цели числа. Изведете всички положителни елементи 
//    на масива. Изведете сумата от всички отрицателни елементи.
      
        int m[]={1, -5, -4, 20, 0, 5, -4, 7};
        int suma=0;
        for(int i=0; i<m.length; i++){
            if(m[i]>=0){
                System.out.println(m[i]);
            }else{
                suma = suma+m[i];
            }
        }
        System.out.println(suma);
       
    }
    public static void myMetod2(){
//  Изведете ‘пирамида’ от символи, увеличаващи се с един на всеки следващ ред: 
        String k="A";
        for(int i=1; i<6; i++){
           System.out.println(k); 
           k=k+"A";
        } 
    }
}
