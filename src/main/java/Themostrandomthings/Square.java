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

public class Square {

    public static void main(String[] args) {
        int sum;
        for (int i = 12; i >= 1; i--) {
            sum = (int) Math.pow(i, 2);
            System.out.print(sum + ", ");
        }
    }
}
