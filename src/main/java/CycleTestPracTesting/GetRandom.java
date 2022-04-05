/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CycleTestPracTesting;

/**
 *
 * @author abbank
 */
//Abban Khan is the creator of this code
import javax.swing.*;
public class GetRandom{
   public static void main(String [] args){
      String input;
      double num;
      
      input = JOptionPane.showInputDialog("Give me a random word");
      
      num = input.length() - 1;
      num = Math.round(Math.random()*num);
      System.out.println(input.charAt((int)num));
      
   }
}