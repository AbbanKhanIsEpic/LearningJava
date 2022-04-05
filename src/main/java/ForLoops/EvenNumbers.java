package ForLoops;


import javax.swing.*;
public class EvenNumbers{
   public static void main(String [] args){
      int total = 0;
      int even;
      int num;
      for(int i = 0;i <= 1000;i++){
         even = i%2;
         num = i;
         System.out.println(" ");
         if(even == 0){
            total += even;
            System.out.println(num);
         }
      
      }
      System.out.println(total);
   }
}