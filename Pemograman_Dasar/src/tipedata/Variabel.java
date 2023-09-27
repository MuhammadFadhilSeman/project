/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Variabel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //DELKARASI
        String nama, NIM;
        float nilai;
        //INPUT
        System.out.print("nama :");
        nama = input.next();
        System.out.println("NIM :");
        NIM = input.next();
        System.out.print("nilai :");
        nilai = input.nextFloat();
        //OUTPUT
        System.out.println("nama :" + nama);
        System.out.println("NIM :" + NIM);
        System.out.println("nilai :" + nilai);
    }
}
