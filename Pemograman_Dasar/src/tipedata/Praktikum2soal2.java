/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;
import java.util.Scanner;

public class Praktikum2soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.print("Masukan angka : ");
        nilai = input.nextInt();

        String cek = nilai % 2 == 0 ? "genap" : "ganjil";
            System.out.println("angka ini "+cek);
       
        }

    }


