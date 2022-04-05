package DataTypes;

import javax.swing.JOptionPane;
public class RealNumberResults{
   public static void main(String [] args){
      String num1Str,num2Str;
      double num1,num2,total;
      
      num1Str = JOptionPane.showInputDialog("Give me a number");
      num1 = Double.parseDouble(num1Str);
      
      System.out.println((num1) + ("  " ) + ("No meaningful message for you"));
      
      num2Str = JOptionPane.showInputDialog("Give me a secound number");
      num2 = Double.parseDouble(num2Str);
      
      total = num1*num2;
      System.out.println(total);
   
   }
}