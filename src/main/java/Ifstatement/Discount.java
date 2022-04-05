/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ifstatement;

import javax.swing.*;

/**
 *
 * @author abbank
 */
public class Discount {

    public static void main(String[] args) {
        double totalprice = Double.parseDouble(JOptionPane.showInputDialog("Tell me the price"));
        if (totalprice > 100) {
            totalprice *= 0.9;
        }
        System.out.println(totalprice);
    }

}
