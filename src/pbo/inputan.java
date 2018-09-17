/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author ONE
 */
public class inputan {
    public static void main (String [] args){
        Scanner masukkan = new Scanner(System.in);
        int a, b;
        System.out.print("Masukkan nilai a :");
        a = masukkan.nextInt();
        System.out.print ("MAsukkan nilai b ;");
        b = masukkan.nextInt();
        System.out.println();
        System.out.println("Nilai variabel yang dalam program;");
       System.out.println("a =" +a );
        System.out.println("b =" +b );
    }
}
       
