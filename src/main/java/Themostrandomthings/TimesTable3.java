/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Themostrandomthings;

/**
 *
 * @author abbank
 */
public class TimesTable3 {

    public static void main(String[] args) {
        int e = 0;
        for (int i = 12; i >= 1; i--) {
            System.out.println(i * 3);
            int times = i * 3;
            e = i % 5;
            if (e == 0) {
                System.out.println("The multipule of 5 from 3 times table is: " + times);
            }

        }
    }
}
