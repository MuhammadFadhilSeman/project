
package Praktikum;
import java.util.Scanner;

public class Praktikum3soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hrg = 100000, wkt = 0, stk = 150, buy = 0, diskon, tdiskon;

        System.out.println("jumlah pembelian : ");
        int jml = input.nextInt();

        if (jml<= 0 || jml > stk) {
            System.out.println("Error jumlah invalid");
        } else {
            System.out.println("Masukkan menit : ");
            wkt = input.nextInt();

            if (wkt >= 420) {
                System.out.println("Toko tutup");
            } else {
                diskon = (wkt / 40) * 5;
                buy = jml * hrg;
                tdiskon = (buy * diskon) / 100;
                buy -= tdiskon;
                stk -= jml;
                System.out.println("Pembelian : " + jml);
                System.out.println("sisa stock : " + stk);
                System.out.println("hasil : " + buy);
            }
        }

    }
}
