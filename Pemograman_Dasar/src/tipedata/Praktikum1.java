package tipedata;

 import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.println("Masukkan NIM : ");
        String nim = input.nextLine();
        System.out.println("Masukkan Prodi : ");
        String prodi = input.nextLine();
        System.out.println("Selamat Datang :");
        System.out.println(nama);
        System.out.println( nim);
        System.out.println(prodi);

    }    
    
}
