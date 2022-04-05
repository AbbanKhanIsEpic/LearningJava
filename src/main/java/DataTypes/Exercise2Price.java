package DataTypes;

import javax.swing.JOptionPane;
public class Exercise2Price{
   public static void main(String [] args){
      String asking,p1Str,p2Str,p3Str;
      double p1,p2,p3;
   
      asking = JOptionPane.showInputDialog("What is the first product that you wish to buy?");
      p1Str = asking;
      asking = JOptionPane.showInputDialog("And its price?");
      p1 = Double.parseDouble(asking);
   
      asking = JOptionPane.showInputDialog("What is the secound product that you wish to buy?");
      p2Str = asking;
      asking = JOptionPane.showInputDialog("And its price?");
      p2 = Double.parseDouble(asking);
   
      asking = JOptionPane.showInputDialog("What is the third product that you wish to buy?");
      p3Str = asking;
      asking = JOptionPane.showInputDialog("And its price?");
      p3 = Double.parseDouble(asking);
   
      System.out.println((p1Str) + (p1));
      System.out.println((p2Str) + (p2));
      System.out.println((p3Str) + (p3));
      System.out.println(("Total: ") + (p1 + p2 + p3));
   }
}                                                                                    