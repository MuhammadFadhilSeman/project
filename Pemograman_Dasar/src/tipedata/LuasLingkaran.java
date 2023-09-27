/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;

/**
 *
 * @author User
 */
public class LuasLingkaran {
    public static void main(String[] args) {
        //ini adalah konstanta ditandai dengan tulisan "final"
        final double PI = 3.141592;
        double r = 11.78;
        double rumuslingkaran =PI*r*r;
        //hasil kali bilangan pecahan
        System.out.println("lingkaran : "+rumuslingkaran);
        //type-casting dari double ke integer
        System.out.println("lingkaran : "+(int)rumuslingkaran);
        //pembulatan  ke bilangan bulat terdekat
        System.out.println("lingkaran : " + Math.round(rumuslingkaran));
        

                
    }
}
