package DataTypes;

import javax.swing.JOptionPane;

public class NumberDataType1{
   public static void main(String [] args){
     
      String input1 = JOptionPane.showInputDialog("Type here you fool, a number");
      String input2 = JOptionPane.showInputDialog("Type here you fool, a number");
      
      double num1 = Double.parseDouble(input1);
      double num2 = Double.parseDouble(input2);

      
      
      System.out.println(num1 + num2);
   }
}