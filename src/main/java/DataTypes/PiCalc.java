package DataTypes;

import javax.swing.*;
public class PiCalc{
   public static void main(String [] args){
      String yesnt;
      double answer;
      double area;
      double radius;
      double diameter;
      String ask;
      
      yesnt = JOptionPane.showInputDialog("Do you wish to calculate the area of a circle");

      if (yesnt == "Yes"){
         ask = JOptionPane.showInputDialog("What is the diameter of your circle?");
      
         diameter = Double.parseDouble(ask);
         radius = diameter/2;
      
         area = Math.PI*Math.pow(radius,2);
      
         answer = area;
      
         answer = answer*100;
      
         answer = Math.round(answer);
      
         answer = answer/100;

      
         
         System.out.println(answer);
         

      }
      else;
      
      
   }
}