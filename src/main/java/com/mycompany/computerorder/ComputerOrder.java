/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computerorder;

import java.util.Scanner;
/**
 *
 * @author maria
 */
public class ComputerOrder {

    private static final double BASIC_PRICE = 375.99;

    public static void main(String[] args) {
        System.out.println("COMPUTER ORDER");
        Scanner keyboard = new Scanner(System.in);

        double total = BASIC_PRICE;

        System.out.print("Select screen size. [1] 38cm,  [2] 43cm: ");
        if (keyboard.nextInt() == 1) {
            total = total + 75.99;
        } else if (keyboard.nextInt() == 2) {
            total = total + 99.99;
        }

        System.out.print("Include Antivirus software? [Y/n]: ");
        if (keyboard.next().toUpperCase().equals("Y")) total = total + 65.99;

        System.out.print("Include printer? [Y/n]: ");
        if (keyboard.next().toUpperCase().equals("Y")) total = total + 125.00;

        System.out.println("Total system price: " + total);
    }
}
