package Themostrandomthings;

import it.*;

public class Cinnamonroll{

   public static void main(String [] args){

   Gogga bug = new Gogga();

   int num;

   for (int i = 0; i <= 10; ++i) {      System.out.println(i);

      for(num = 0; num < i; ++num) {


         System.out.println(num);

         bug.move();

      }

      bug.turnLeft();

      for(num = 0; num < i; ++num) {


         System.out.println(num);

         bug.move();

      }

      bug.turnLeft();

   }

   

   }

}