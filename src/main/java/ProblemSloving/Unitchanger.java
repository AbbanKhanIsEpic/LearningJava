/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSloving;

/**
 *
 * @author abbank
 */
import javax.swing.*;

public class Unitchanger {

    public static void main(String[] args) {
        String ask = JOptionPane.showInputDialog("What do you want covert? \n Celsius to Fahrenheit? or  \t Fahrenheit to Celsius? ");
        if ("Celsius to Fahrenheit".equals(ask)) {
            double cf = Double.parseDouble(JOptionPane.showInputDialog("What do you want covert? \n Celsius to Fahrenheit"));
            System.out.println("Converting " + cf + "C to F");
            double f = (((9 * cf) / 5) + 32);
            System.out.println("The Fahrenheit is " + f);
        }

    }
}
