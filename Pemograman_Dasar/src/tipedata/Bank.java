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
public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo,jmluang;
        saldo = 100000;
         System.out.println("Selamat Datang di Bank Unan");
         System.out.println("Saldo saat ini : Rp."+ saldo);
         
         System.out.println("Masukkan nilai uang yang mau disimpan : Rp.");
         jmluang = input.nextDouble();
         saldo += jmluang;
         
         System.out.println("Saldo saat ini : Rp."+ saldo);
         System.out.println("masukkan nilai uang yang ingin diambil : Rp.");
         jmluang = input.nextDouble();
         
         saldo -= jmluang;
         System.out.println("saldo saat ini " + saldo);
         
         
         
        
        
        
        
    }
}
