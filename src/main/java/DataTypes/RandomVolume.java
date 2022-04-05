package DataTypes;

public class RandomVolume{
   public static void main(String [] args){
      double height = 15.68;
      double radius = Math.random()*31 + 15;
      double volume = (Math.PI*Math.pow(radius,2)*height)/3;
      System.out.println(volume +" unit cube");
      System.out.println(radius);



   }
}