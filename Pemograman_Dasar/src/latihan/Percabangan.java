package latihan;
import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {
        int belanja,Diskon,bayar;
        String Kartu;
        Scanner scan = new Scanner(System.in);
        System.out.println("apakah ada mempunyai kartu debit : ");
        Kartu = scan.nextLine();
        System.out.println("apakah anda mau menggunakan kartu debit : ");
        Kartu = scan.nextLine();
        System.out.println("jumlah uang yang dimasukkan : ");
        belanja = scan.nextInt();
        if (Kartu.equalsIgnoreCase("ya")) {
            if (belanja >= 1000000) {
                Diskon = 10000;
                System.out.println("Selamat anda mendapatkan diskon sebesar Rp.10000");
            } else if (belanja >= 100000) {
                Diskon = 5000;
                System.out.println("Selamat anda mendapatkan diskon sebesar Rp.5000");
            }else if (belanja >= 10000){
                Diskon = 1000;
                System.out.println("Selamat anda mendapatkan diskon sebesar Rp.1000");
            }else {
                Diskon = 0;
                System.out.println("Maaf anda tidak mendapatkan diskon");
            }
            bayar = belanja - Diskon;
            System.out.println("harga yang harus dibayar : Rp."+ bayar);
            System.out.println("Terima Kasih telah berbelanja");
        }
    }
}
