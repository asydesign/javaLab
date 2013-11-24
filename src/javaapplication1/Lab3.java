package javaapplication1;


public class Lab3 {
  
   public static void Choose(int zadacha){
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
                myMetod4();
                break;
            case 5:    
                myMetod5();
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
        System.out.println("Сумата е: "+suma); 
       
    }
    public static void myMetod2(){
//  Изведете ‘пирамида’ от символи, увеличаващи се с един на всеки следващ ред: 
        String k="A";
        for(int i=1; i<6; i++){
           System.out.println(k); 
           k=k+"A";
        } 
    }
    public static void myMetod3(){
//  средно аритметично на масив
        double[] m = {1,2,3.3,4};
        double k = 0;
        for(int i=0; i<m.length; i++){
          k = k + m[i];
      } 
        k=k/m.length;
     System.out.println(k); 
    }
    public static void myMetod4(){
//  средно квадратично на масив (кв. корен от сумата на квадратите)
        double[] m = {1,3,14,3E+8};
        double k = 0;
        for(int i=0; i<m.length; i++){
          k = k + m[i]*m[i];
      } 
     System.out.println(Math.sqrt(k)); 
    }
     
    public static void myMetod5(){
//  масив реални числа, max = ?
        double[] m = {1,3,14,3E+5};
        double k = 0;
        for(int i=0; i<m.length; i++){
            if(m[i]>k){
            k = m[i];
        }
      } 
     System.out.println(k);
     //System.err.println(k); може да се пренасочи да пише във file
    }
    
}
