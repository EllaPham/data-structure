/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dynamicarrayexample;

import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Trang
 */
public class dynamicArray {
    public static void main(String[] args) 
    {
        String r = JOptionPane.showInputDialog("What's the length of our array");
        int number = Integer.parseInt(r);
        int arr[] = new int[number];
        for (int i = 0; i < number; i++){
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the next value into the array: "));
            System.out.println("The value entered was: " + arr[i]);
        }
    }

    
}
