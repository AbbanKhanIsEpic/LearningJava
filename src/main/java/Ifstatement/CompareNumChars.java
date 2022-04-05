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
public class CompareNumChars {

    public static void main(String[] args) {
        String wrd1 = JOptionPane.showInputDialog("Give me a word");
        String wrd2 = JOptionPane.showInputDialog("Give me a word");
        int wrdlength1 = wrd1.length();
        int wrdlength2 = wrd2.length();
        if (wrdlength2 > wrdlength1) {
            System.out.println(wrd2 + " , " + wrd1);
        } else if (wrdlength2 < wrdlength1) {
            System.out.println(wrd1 + " , " + wrd2);
        }
        int a = 1;
        int b = 2;
        int c = 5;
        int m = 3;
        if (a == 3) {
            m = 4;
            if (b == 2) {
                m = 1;
                if (c == 1) {
                    m = 5;
                }
            }
        }
    }
}
