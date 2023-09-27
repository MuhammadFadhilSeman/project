/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;
import java.util.Scanner;

public class praktikum2soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p, l, t;
        System.out.println("panjang : ");
        p = input.nextDouble();
        System.out.println("lebar : ");
        l = input.nextDouble();
        System.out.println("tinggi : ");
        t = input.nextDouble();
        double v = p * l * t;
        System.out.println("nilai balok : " + v);
        
    }
}
