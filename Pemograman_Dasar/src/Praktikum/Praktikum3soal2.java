
package Praktikum;

import java.util.Scanner;

public class Praktikum3soal2 {

    public static void main(String[] args) {
        double total, lp, bt, kp, sp;
        int laptop, buku, kotak, smartphone;
        Scanner ipt = new Scanner(System.in);
        System.out.println("Jumlah laptop : ");
        laptop = ipt.nextInt();
        System.out.println("Jumlah Buku Tulis : ");
        buku = ipt.nextInt();
        System.out.println("jumlah kotak pensil (berisi)");
        kotak = ipt.nextInt();
        System.out.println("jumlah smartphone : ");
        smartphone = ipt.nextInt();
        System.out.println("======Indeks barang bawaan tasku=====");
        System.out.println("Laptop : " + laptop);
        System.out.println("Buku tulis : " + buku);
        System.out.println("Kotak Pensil (berisi) : " + kotak);
        System.out.println("Smartphone : " + smartphone);
        System.out.println("==================================");
        lp = laptop * 850.56;
        bt = buku * 250.11;
        kp = kotak * 25.31;
        sp = smartphone * 200.00;
        total = lp + bt + kp + sp;

        if (lp < 0 || bt < 0 || kp < 0 || sp < 0) {
            System.out.println("Error jumlah tidak boleh negatif");

        } else if (total <= 2000 && total >= 1500) {
            System.out.println("indeks berat barang 5");
        } else if (total <= 1500 && total >= 1000) {
            System.out.println("indeks berat barang 4");
        } else if (total <= 1000 && total >= 500) {
            System.out.println("indeks berat barang 3");
        } else if (total <= 500 && total >= 0) {
            System.out.println("indeks berat barang 2");
        } else if (total == 0) {
            System.out.println("indeks berat barang 1");
        } else if (total > 2000) {
            System.out.println("berat melebihi kapasitas");
        } else if (total < 0) {
            System.out.println("berat di bawah kapasitas");
        }

    }

}
