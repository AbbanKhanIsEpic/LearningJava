/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Themostrandomthings;

import javax.swing.JOptionPane;

/**
 *
 * @author abbank
 */
public class Namesbeself {

    public static void main(String[] args) {
        String input;
        input = JOptionPane.showInputDialog("What is your name");
        int length;
        length = input.length();
        System.out.println(input.charAt(2));
        for (int i = 1; i < length; i++) {
            System.out.println(input.charAt(i));
        }
    }
}
