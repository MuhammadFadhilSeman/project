/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;
import java.util.Scanner;

public class Praktikum2soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pi = 3.141592;
        double r;
        System.out.println("jari-jari : ");
        r = input.nextDouble();
        double hasil = pi * r * r;
        System.out.println("hasil lingkaran : " + Math.round(hasil));


    }
}
