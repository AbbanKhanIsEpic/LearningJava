package ForLoops;

import java.awt.*;
import it.*;
public class PrintNums{
   public static void main(String [] args){
      Gogga bug = new Gogga();
      Gogga snail = new Gogga();
      Gogga dog = new Gogga();
      Gogga cat = new Gogga();
      Gogga bird = new Gogga();
      int num = 1;
      bug.setColor(Color.blue);
      snail.setPosition(4,4);
      dog.setPosition(5,5);
      bird.setPosition(9,9);
      cat.setPosition(2,2);
      bird.setColor(Color.black);
      cat.setColor(Color.orange);
      dog.setColor(Color.pink);

      for(int i = 2;true;i++){
         bug.setDirection(Gogga.UP);
         bug.move();
         bug.setDirection(Gogga.RIGHT);
         bug.move();
         bug.setDirection(Gogga.DOWN);
         bug.move();
         bug.setDirection(Gogga.LEFT);
         bug.move();
         bug.setTrailWidth(num*i);
         snail.setDirection(Gogga.UP);
         snail.move();
         snail.setDirection(Gogga.RIGHT);
         snail.move();
         snail.setDirection(Gogga.DOWN);
         snail.move();
         snail.setDirection(Gogga.LEFT);
         snail.move();
         snail.setTrailWidth(num+= i);
         bird.setDirection(Gogga.UP);
         bird.move();
         bird.setDirection(Gogga.RIGHT);
         bird.move();
         bird.setDirection(Gogga.DOWN);
         bird.move();
         bird.setDirection(Gogga.LEFT);
         bird.move();
         bird.setTrailWidth(num*= i);
         dog.setDirection(Gogga.UP);
         dog.move();
         dog.setDirection(Gogga.RIGHT);
         dog.move();
         dog.setDirection(Gogga.DOWN);
         dog.move();
         dog.setDirection(Gogga.LEFT);
         dog.move();
         dog.setTrailWidth(num%= i);
         cat.setDirection(Gogga.UP);
         cat.move();
         cat.setDirection(Gogga.RIGHT);
         cat.move();
         cat.setDirection(Gogga.DOWN);
         cat.move();
         cat.setDirection(Gogga.LEFT);
         cat.move();
         cat.setTrailWidth(num+= i/2);
            
      
      
      }
   }
}