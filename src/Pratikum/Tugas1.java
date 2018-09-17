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
public class Tugas1 {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        String nama, tl, jk, alm, mh;
        int nis, tll;
        
        
        System.out.println("Nama :");
        nama = masukan.nextLine();
        System.out.println("NIS :");
        nis = masukan.nextInt();
        System.out.println("Tempat lahir :");
        tl = masukan.next();
        System.out.println("Tanggal Lahir :");
        tll = masukan.nextInt();
        masukan.nextLine();
        System.out.println("Jenis Kelamin :");
        jk = masukan.next();
        System.out.println("Alamat di Malang :");
        alm = masukan.next();
        System.out.println("Motto Hidup :");
        mh = masukan.next();
        
        
    }
}
