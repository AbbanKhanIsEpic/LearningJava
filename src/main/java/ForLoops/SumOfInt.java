package ForLoops;

import javax.swing.*;
public class SumOfInt{
   public static void main(String [] args){
   int sum = 0;
   int i;
   int pos = 0;
   int neg = 0;
   int greaterten = 0;
   for(i = 0;i<=10;i++){
      String askStr = JOptionPane.showInputDialog("Give me a random number");
      int ask = Integer.parseInt(askStr);
      if(ask != 0){
         sum += ask;
      
      }
      if(ask > 0){
         pos += ask;     
      }
      if(ask < 0){
         neg += ask;
      
      }
      if(greaterten > 10){
         greaterten += ask;
      
      }



   
   }
   System.out.println(sum/i);
   System.out.println(pos);
   System.out.println(neg);
   System.out.println(greaterten);
   
      
   
   
   }
}