/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Themostrandomthings;

/**
 *
 * @author abbank
 */
import it.*;
import javax.swing.*;

public class Get5Num {

    public static void main(String[] args) {
        String ask;
        double num = 0;
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double num4 = 0;
        double num5 = 0;
        double avg = 0;
        double highest = 0;
        for (int i = 1; i <= 5; i++) {
            ask = JOptionPane.showInputDialog("Give me a number");
            if (i == 1) {
                num = Integer.parseInt(ask);
            }
            if (i == 2) {
                num1 = Integer.parseInt(ask);
            }
            if (i == 3) {
                num2 = Integer.parseInt(ask);
            }
            if (i == 4) {
                num3 = Integer.parseInt(ask);
            }
            if (i == 0) {
                num4 = Integer.parseInt(ask);
            }

            System.out.println(" ");
        }
        avg = (num + num1 + num2 + num3 + num4) / 5.0;
        System.out.println(avg);
        avg = (num + num1 + num2 + num3 + num4);
        System.out.println(avg);
    }
}
