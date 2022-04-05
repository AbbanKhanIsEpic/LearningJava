/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoops;

import javax.swing.JOptionPane;

/**
 *
 * @author abbank
*/
public class RepeatName {
    public static void main(String[] args){
    String input = JOptionPane.showInputDialog("What is your name");
    String num = JOptionPane.showInputDialog("How many times do you want your name to be repeated");
    int number = Integer.parseInt(num);
    for(int i = 0;i <= number;i++){
        System.out.print(input + " ");
     }
    }
}
