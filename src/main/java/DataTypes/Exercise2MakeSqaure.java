package DataTypes;

import it.*;
import javax.swing.JOptionPane;
public class Exercise2MakeSqaure{
   public static void main(String [] args){
      String trailStr;
      int trail;
      trailStr = JOptionPane.showInputDialog("How thicc you want your trail to be?In numbers");
      trail = Integer.parseInt(trailStr);
      Gogga bug = new Gogga();
      bug.setTrailWidth(trail);
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.turnLeft();
      bug.move();
      bug.turnLeft();
   }
}