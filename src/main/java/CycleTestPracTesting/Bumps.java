package CycleTestPracTesting;

import it.*;
import javax.swing.*;
public class Bumps{
   public static void main(String [] args){
      int x;
      int y;
      Gogga bug = new Gogga();
      bug.setPosition(1,5);
      
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.move();

   
      x = bug.getXPos();
      y = bug.getYPos();
      System.out.println("The x position of the bug is: " + x +"\n and the y position of the bug is: " + y);


   }
}