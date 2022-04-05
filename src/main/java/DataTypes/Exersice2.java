package DataTypes;

import javax.swing.JOptionPane;
import it.*;
public class Exersice2{
   public static void main(String [] args){
      String name,surname,yearStr,heightStr,telephonenumber,creditcard;
      int year;
      double height;
      
      //Personal Details
      System.out.println(); 
      
      //Name
      name = JOptionPane.showInputDialog("What is your name?");
      surname = JOptionPane.showInputDialog("What is your surname?");
      
      //Year of birth
      yearStr = JOptionPane.showInputDialog("What is your year of birth");
      year = Integer.parseInt(yearStr);
      
      //Height
      heightStr = JOptionPane.showInputDialog("What is your height in metres");
      height = Double.parseDouble(heightStr);
      
      //Telephone
      telephonenumber = JOptionPane.showInputDialog("What is your phone number");
      
      //Credit card
      creditcard = JOptionPane.showInputDialog("What is your credit card information");
     
      
      System.out.println("Your name is: " + name);
      System.out.println("Your surname is: " + surname);
      System.out.println("Your birth year is: " + yearStr);
      System.out.println("Your height is: " + heightStr);
      System.out.println("Your telephone number is: " + telephonenumber);
      System.out.println("Your credit card info is: " + creditcard);
      
      
   }   
}