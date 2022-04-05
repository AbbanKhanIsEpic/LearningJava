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

public class SumOf7Numbers {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 7; i <= 84; i += 7) {
            sum += i;
        }
        System.out.println(sum);
    }
}
