
package Praktikum;
import java.util.Scanner;

public class peraktikum3soal1 {
    public static void main(String[] args) {
        Scanner ipt = new Scanner (System.in);
        double bil,hasil;
        System.out.println("bilangan : ");
        hasil = ipt.nextDouble();
        if (hasil%5==0||hasil%2==0){
            System.out.println("Program Started");
        }else{
            System.out.println("program Halted");
            
        }
    }
}
