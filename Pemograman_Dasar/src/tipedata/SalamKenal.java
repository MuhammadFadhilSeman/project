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
public class SalamKenal {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan nama anda:");
        String nama = masukan.nextLine();
        System.out.println("Halo,Salam Kenal sdr. "+ nama +"!");
    }
}
