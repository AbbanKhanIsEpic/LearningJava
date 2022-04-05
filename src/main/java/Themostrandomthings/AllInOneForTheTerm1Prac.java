package Themostrandomthings;

import it.*;
import javax.swing.*;
public class AllInOneForTheTerm1Prac{
   public static void main(String [] args){
   Gogga bug = new Gogga();
   String ask;
   int width;
   int Ypos;
   int Xpos;
   double random;
   ask = JOptionPane.showInputDialog("Tell me how thicc you want the Gogga bug to be(make it less than 10");
   bug.setTrailWidth(width = Integer.parseInt(ask));
   ask = JOptionPane.showInputDialog("You wish that the bug increase it's width?(Answer as \"Yes\" or \"No\"");
   if (ask.equals("Yes")){
      for(int i = width;i<21;i++){
         bug.move();
         bug.setTrailWidth(i);
         Ypos = bug.getYPos();
         Xpos = bug.getXPos();
         if (Ypos == 1){
            bug.setPosition(Xpos + 1,5);
         
         
         }
      }
      
   }
   
   

   }
}