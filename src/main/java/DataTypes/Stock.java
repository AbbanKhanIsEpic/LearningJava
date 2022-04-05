package DataTypes;

import javax.swing.*;
public class Stock{
    public static void main(String [] args){
    
      System.out.println("ITEM \t ITEM CODE \t QUANTITY ");
      System.out.println("T-shirt \t 537 \t 350");
      System.out.println("Dress \t 7231 \t 480");
      System.out.println("Earrings \t 7732 \t 90");
    
      String name;
      String surname;
      String telnum;
      String yearofbirth;
      String height;
      
      name = JOptionPane.showInputDialog("What is your name?");
      surname =JOptionPane.showInputDialog("What id ypour surname?");
      telnum = JOptionPane.showInputDialog("What is your telephone number?");
      yearofbirth = JOptionPane.showInputDialog("What is your birth YYYY?");
      height = JOptionPane.showInputDialog("What is your telephone heights(in metres with 1 dec)?");
      
      JOptionPane.showMessageDialog(null, "Name: " + name + " " + surname + "\n Year of Birth: " + yearofbirth + "\n Height(m): " + height + "\n Telephone number: " + telnum, "Personal Details", JOptionPane.PLAIN_MESSAGE);
      JOptionPane.showMessageDialog(null, "Name: " + name + " " + surname + "\n Year of Birth: " + yearofbirth + "\n Height(m): " + height + "\n Telephone number: " + telnum, "Personal Details", JOptionPane.ERROR_MESSAGE);
      JOptionPane.showMessageDialog(null, "Name: " + name + " " + surname + "\n Year of Birth: " + yearofbirth + "\n Height(m): " + height + "\n Telephone number: " + telnum, "Personal Details", JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "Name: " + name + " " + surname + "\n Year of Birth: " + yearofbirth + "\n Height(m): " + height + "\n Telephone number: " + telnum, "Personal Details", JOptionPane.WARNING_MESSAGE);
      JOptionPane.showMessageDialog(null, "Name: " + name + " " + surname + "\n Year of Birth: " + yearofbirth + "\n Height(m): " + height + "\n Telephone number: " + telnum, "Personal Details", JOptionPane.QUESTION_MESSAGE);





      
      
    
    
    
    
    
    
    }

}