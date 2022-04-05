package DataTypes;

import javax.swing.*;
public class ThreeWord{
   public static void main(String [] args){
      String word1;
      String word2;
      String word3;
      int num1 = 0;
      int num2 = 0;
      int num3 = 0;
      int total = 0;
      
      word1 = JOptionPane.showInputDialog("Say a word");
      word2 = JOptionPane.showInputDialog("Say a word");
      word3 = JOptionPane.showInputDialog("Say a word");
      
      for (int i = 0; i < word1.length(); i++){
            num1 = i+1; 
        }  
      for (int y = 0; y < word1.length(); y++){
            num2 = y+1; 
        }  
      for (int x = 0; x< word1.length(); x++){
            num3 = x+1; 
        }                                                                                 
      
      
      total = num1 + num2 + num3;
      
      System.out.println(word1 + " " + num1);    
      System.out.println(word2 + " " + num2);       
      System.out.println(word3 + " " + num3);                                                                        
   
      System.out.println("The total of charater is: " + total);
   
   }
}