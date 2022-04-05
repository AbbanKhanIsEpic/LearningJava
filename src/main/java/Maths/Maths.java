/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maths;
/**
 *
 * @author abbank
 */
import it.*;
import java.awt.Color;
import javax.swing.*;
public class Maths {
    public static void main(String[] args) {
        String input;
        int inputnum;
        input = JOptionPane.showInputDialog("Hello, give me a random number");
        Gogga bug = new Gogga();
        inputnum = Integer.parseInt(input);
        if(inputnum > 100){
          inputnum = (int)Math.pow(inputnum, inputnum);
          inputnum = Math.round(inputnum);
          for(int x = inputnum;x <= 0;x--){
              bug.move();
              bug.turnLeft();
              inputnum %= inputnum;
              if(inputnum == 0){
                  bug.setColor(Color.yellow);
                  
              }
              if(inputnum != 0){
                  bug.setColor(Color.blue);
                  
              }
          }
        }
    }
 
}
