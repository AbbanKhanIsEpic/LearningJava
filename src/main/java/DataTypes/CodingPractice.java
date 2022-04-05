package DataTypes;

import javax.swing.*;
public class CodingPractice{
   public static void main(String [] args){
      double cal;
      String e;
      int num1;
      double num2;
      char num3;

      //The range is from 101 to 201
      cal = (double)(Math.random()*101 + 101);
      System.out.println(cal);
      num1 = (int)cal;
      System.out.println(num1);
      //The range is from 0 to 127 
      cal = (double)(Math.random()*127);
      num1 = (int)cal;
      num3 = (char)num1;
      System.out.println(num3);
      //Ther range is from 1 to 2
      cal = (double)(Math.random()*2 + 1);
      System.out.println(cal);
      cal = (double)(Math.random()*14 + 15);
      System.out.println(cal);
      //The ramnge between 5 and 11
      cal = (double)(Math.random()*7 + 5);
      System.out.println(cal);
      //between 20 and 30
      cal = (double)(Math.random()*11 + 20);
      System.out.println(cal);




   }
}