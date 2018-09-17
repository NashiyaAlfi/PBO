/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

import java.util.Scanner;

/**
 *
 * @author ONE
 */
public class Tugas3 {
    public static void main(String [] args){
         int p=5;
        int l=10;
        int t=5;
        System.out.print("Menghitung luas permukaan bola\n Masukkan jari-jari bola :");
     Scanner input = new Scanner(System.in);
     double jari = input.nextDouble();
     System.out.println("Luas permukaan bola adalah :" +jari*jari*22/7*4);
     
    }
}
