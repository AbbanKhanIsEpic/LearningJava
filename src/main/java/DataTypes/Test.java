package DataTypes;

import it.*;
public class Test{
   public static void main(String [] args){
      Gogga bug = new Gogga();
      
      //LETTER A 
      
      bug.setPosition(0,5);
      bug.move();
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.move();
      bug.setPosition(0,3);
      bug.turnLeft();
      bug.move();
      bug.move();
      
      //Letter B
      bug.setPosition(3,5);
      bug.move();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.turnRight();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.move();
      
      //Letter B
      bug.setPosition(6,5);
      bug.move();
      bug.move();
      bug.move();
      bug.setPosition(6,5);
      bug.turnRight();
      bug.move();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.move();
      // Letter A
      
      bug.setPosition(9,5);
      bug.turnLeft();
      bug.turnLeft();
      bug.turnLeft();
      bug.move();
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.move();
      bug.setPosition(9,3);
      bug.turnLeft();
      bug.move();
      bug.move();
      
      //Letter N
      
      
   }
}