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
public class TestAnotherNumber {

    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Give me a number"));
        if (num > 0) {
            System.out.println("Number: " + num + " is a postive");
        } else if (num < 0) {
            System.out.println("Number: " + num + " is a negative");
        }

        double penis = num / 2;
        double penis2 = Math.round(penis);

        if (penis2 != penis) {
            System.out.println("Number: " + num + " is a odd");
        } else if (penis2 == penis) {
            System.out.println("Number: " + num + " is a even");
        }
        penis = num % 7;
        if (penis == 0) {
            System.out.println("Number: " + num + " is a multiple");
        } else if (penis != 0) {
            System.out.println("Number: " + num + " is a not multiple of 7");
        }
        penis = Math.pow(num, 2);
        if (penis > 100) {
            System.out.println("Number: " + num + " ,if squared, is greater than 100");
        } else if (penis < 100) {
            System.out.println("Number: " + num + " ,if squared, is not greater than 100");
        }
    }

}
