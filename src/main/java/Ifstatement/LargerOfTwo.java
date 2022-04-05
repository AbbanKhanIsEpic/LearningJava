/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ifstatement;

import javax.swing.JOptionPane;

/**
 *
 * @author abbank
 */
public class LargerOfTwo {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Give me a number"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Give me a number"));
        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num1 + " is less than " + num2);
        }
    }

}
