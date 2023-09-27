/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;
import java.util.Scanner;

public class praktikum3soal3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bar, had, cb, jb;

        System.out.println("=====Selamat Datang di Toko Charlie=====");
        System.out.print("Jumlah beli barang: ");
        bar = scan.nextInt();
        System.out.println("========================================");

        had = bar / 3;
        cb = bar / 7;
        jb = had + bar;

        if (bar <= 0) {
            System.out.println("ERROR!! jumlah barang harus lebih dari 0");

        } else {
            System.out.print("Cashback: Rp");
            if (bar % 7 == 0) {
                System.out.println(cb * 5500);
            } else {
                System.out.println("-");
            }

            System.out.print("Tambahan Barang: ");
            if (bar % 3 == 0) {
                System.out.println(had * 1);
            } else if (bar < 3) {
                System.out.println("-");
            } else {
                System.out.println(had * 1);
            }
            System.out.println("Jumlah Barang: " + jb);
        }

    }

}
    
