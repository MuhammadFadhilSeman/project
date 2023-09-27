/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class PernyataanIfElseIf {
    public static void main(String[] args) {
        double skorujian;
        String nilai;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai : ");
        skorujian = input.nextDouble();
        if (skorujian < 0 || skorujian > 100) {
            System.out.println("Nilai Error");
        } else {
            if (skorujian >= 90) {
                nilai = "A";
            } else if (skorujian >= 80) {
                nilai = "B";
            } else if (skorujian >= 70) {
                nilai = "C";
            } else {
                nilai = "D";
            }
            System.out.println("Nilai : " + nilai);
        }
    }
}
