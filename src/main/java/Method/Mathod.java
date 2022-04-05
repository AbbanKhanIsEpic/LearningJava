/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

import javax.swing.JOptionPane;

/**
 *
 * @author abbank
 */
public class Mathod {

    static void Kill() {
        System.out.println("Misson done");
    }

    public static void main(String[] args) {
        String ask = JOptionPane.showInputDialog("Hello, what number do you want to seperate from a list");
        char lookChar = ask.charAt(0);
        String postition = " ";
        String list = JOptionPane.showInputDialog("Give me a list(Single digit)");
        for (int i = 0; i < list.length(); i++) {
            char look = list.charAt(i);
            if (look == lookChar) {
                postition = postition + i + " ";
            }
        }
        System.out.println(postition);
        Kill();
    }
}
