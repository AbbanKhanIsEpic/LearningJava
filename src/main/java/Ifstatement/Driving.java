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
public class Driving {

    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("The age please"));
        if (age < 18) {
            System.out.println("Too young to drive");
        } else if (age > 75) {
            System.out.println("Sorry you are over the legal age limit for driving");
        } else if (age > 18 && age < 75) {
            System.out.println("Age OK.Have you got a driving licence");
        }
    }

}
