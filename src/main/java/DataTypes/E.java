package DataTypes;

public class E{
   public static void main(String [] args){
      int num2 = 0;
      int num3 = 0;
      int num5 = 0;
      for(int i = 2;i < 10;i++){
         num2 = i%2;
         if (num2 != 0){   
            num3 = i%3;
            if(num3 !=0){
               System.out.println(i);
            }
         }
      
      }
   
   
   
   
   

   }
}