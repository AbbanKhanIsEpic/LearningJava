package CycleTestPracTesting;

public class TruncateWithCasting{
   public static void main(String [] args){
   double input = Math.random()*1388+69;
   int helper;
   
   input = input*100;
   helper = (int)input;
   input = (double)helper;
   input = input/100;
   System.out.print(input);



   }
}
